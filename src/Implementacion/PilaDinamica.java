package Implementacion;

import Interface.PilaTDA;

public class PilaDinamica implements PilaTDA {

    private NodePilaDinamica tope; // apunta al nodo que está en el tope de la pila

    @Override
    public void InicializarPila() {
        tope = null;
    }

    @Override
    public void Apilar(int x) {
        // El nuevo nodo apunta al tope actual, y pasa a ser el nuevo tope.
        // Esto respeta LIFO: el último en entrar es el primero en salir.
        NodePilaDinamica nodePilaDinamica = new NodePilaDinamica(x, tope);
        tope = nodePilaDinamica;
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) {
            // Avanzamos tope al siguiente nodo, descartando el nodo actual.
            tope = tope.getNext();
        }
    }

    @Override
    public int Tope() {
        return tope.getData();
    }

    @Override
    public boolean PilaVacia() {
        return tope == null;
    }
}