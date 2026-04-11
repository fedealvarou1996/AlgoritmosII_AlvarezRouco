package Implementacion;

public class NodeValorDiccionarioMultipleDinamico {

    private int valor;
    private NodeValorDiccionarioMultipleDinamico next;

    public NodeValorDiccionarioMultipleDinamico(int valor, NodeValorDiccionarioMultipleDinamico next) {
        this.valor = valor;
        this.next = next;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodeValorDiccionarioMultipleDinamico getNext() {
        return next;
    }

    public void setNext(NodeValorDiccionarioMultipleDinamico next) {
        this.next = next;
    }
}
