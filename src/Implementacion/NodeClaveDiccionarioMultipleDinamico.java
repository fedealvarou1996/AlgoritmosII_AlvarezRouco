package Implementacion;

public class NodeClaveDiccionarioMultipleDinamico {

    private int clave;
    private NodeValorDiccionarioMultipleDinamico primero; // cabeza de la lista de valores para esta clave
    private NodeClaveDiccionarioMultipleDinamico next;

    public NodeClaveDiccionarioMultipleDinamico(int clave, NodeValorDiccionarioMultipleDinamico primero, NodeClaveDiccionarioMultipleDinamico next) {
        this.clave = clave;
        this.primero = primero;
        this.next = next;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public NodeValorDiccionarioMultipleDinamico getPrimero() {
        return primero;
    }

    public void setPrimero(NodeValorDiccionarioMultipleDinamico primero) {
        this.primero = primero;
    }

    public NodeClaveDiccionarioMultipleDinamico getNext() {
        return next;
    }

    public void setNext(NodeClaveDiccionarioMultipleDinamico next) {
        this.next = next;
    }
}
