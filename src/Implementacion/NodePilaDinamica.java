package Implementacion;

public class NodePilaDinamica {

    private int data;
    private NodePilaDinamica next;

    public NodePilaDinamica(int data, NodePilaDinamica next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodePilaDinamica getNext() {
        return next;
    }

    public void setNext(NodePilaDinamica next) {
        this.next = next;
    }
}