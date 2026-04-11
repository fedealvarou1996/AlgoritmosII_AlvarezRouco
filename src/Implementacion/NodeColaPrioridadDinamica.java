package Implementacion;

public class NodeColaPrioridadDinamica {

    private int dato;
    private int prioridad;
    private NodeColaPrioridadDinamica next;

    public NodeColaPrioridadDinamica(int dato, int prioridad, NodeColaPrioridadDinamica next) {
        this.dato = dato;
        this.prioridad = prioridad;
        this.next = next;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public NodeColaPrioridadDinamica getNext() {
        return next;
    }

    public void setNext(NodeColaPrioridadDinamica next) {
        this.next = next;
    }
}
