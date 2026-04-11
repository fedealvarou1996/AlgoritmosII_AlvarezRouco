package Implementacion;

import Interface.ColaPrioridadTDA;

public class ColaPrioridadDinamica implements ColaPrioridadTDA {

    // La lista está ordenada de mayor a menor prioridad.
    // frente apunta al nodo con mayor prioridad (el primero en salir).
    private NodeColaPrioridadDinamica frente;

    @Override
    public void InicializarColaPrioridad() {
        frente = null;
    }

    @Override
    public void AcolarPrioridad(int numero, int prioridad) {
        NodeColaPrioridadDinamica nuevo = new NodeColaPrioridadDinamica(numero, prioridad, null);

        if (frente == null || prioridad > frente.getPrioridad()) {
            // Insertar al frente si la lista está vacía o tiene mayor prioridad.
            nuevo.setNext(frente);
            frente = nuevo;
        } else {
            // Avanzar hasta encontrar el lugar correcto (orden descendente de prioridad).
            NodeColaPrioridadDinamica curr = frente;
            while (curr.getNext() != null && curr.getNext().getPrioridad() >= prioridad) {
                curr = curr.getNext();
            }
            nuevo.setNext(curr.getNext());
            curr.setNext(nuevo);
        }
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()) {
            frente = frente.getNext();
        }
    }

    @Override
    public boolean ColaVacia() {
        return frente == null;
    }

    @Override
    public int Primero() {
        return frente.getDato();
    }

    @Override
    public int Prioridad() {
        return frente.getPrioridad();
    }
}
