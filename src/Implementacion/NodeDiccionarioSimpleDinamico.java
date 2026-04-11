package Implementacion;

public class NodeDiccionarioSimpleDinamico {

    private int clave;
    private int valor;
    private NodeDiccionarioSimpleDinamico next;

    public NodeDiccionarioSimpleDinamico(int clave, int valor, NodeDiccionarioSimpleDinamico next) {
        this.clave = clave;
        this.valor = valor;
        this.next = next;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodeDiccionarioSimpleDinamico getNext() {
        return next;
    }

    public void setNext(NodeDiccionarioSimpleDinamico next) {
        this.next = next;
    }
}
