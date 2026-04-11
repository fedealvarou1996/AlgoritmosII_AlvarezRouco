package Implementacion;

public class NodeConjuntoDinamico {

    private int data;
    private NodeConjuntoDinamico next;

    public NodeConjuntoDinamico(int data, NodeConjuntoDinamico next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeConjuntoDinamico getNext() {
        return next;
    }

    public void setNext(NodeConjuntoDinamico next) {
        this.next = next;
    }
}
