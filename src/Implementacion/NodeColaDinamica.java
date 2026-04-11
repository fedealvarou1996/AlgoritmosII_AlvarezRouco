
package Implementacion;

public class NodeColaDinamica {

    private int data;
    private NodeColaDinamica next;

    public NodeColaDinamica(int data, NodeColaDinamica next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeColaDinamica getNext() {
        return next;
    }

    public void setNext(NodeColaDinamica next) {
        this.next = next;
    }
}