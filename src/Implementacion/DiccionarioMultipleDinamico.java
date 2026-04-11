package Implementacion;

import Interface.DiccionarioMultipleTDA;

public class DiccionarioMultipleDinamico implements DiccionarioMultipleTDA {

    // Lista enlazada de claves; cada clave apunta a su propia lista de valores.
    private NodeClaveDiccionarioMultipleDinamico cabeza;

    @Override
    public void InicializarDiccionario() {
        cabeza = null;
    }

    @Override
    public void Agregar(int clave, int valor) {
        NodeClaveDiccionarioMultipleDinamico nodoClave = buscarClave(clave);

        if (nodoClave == null) {
            // Clave nueva: crear nodo de clave con un primer valor.
            NodeValorDiccionarioMultipleDinamico nodoValor = new NodeValorDiccionarioMultipleDinamico(valor, null);
            cabeza = new NodeClaveDiccionarioMultipleDinamico(clave, nodoValor, cabeza);
        } else {
            // Clave existente: agregar valor solo si no está repetido.
            if (!existeValor(nodoClave, valor)) {
                nodoClave.setPrimero(new NodeValorDiccionarioMultipleDinamico(valor, nodoClave.getPrimero()));
            }
        }
    }

    @Override
    public void EliminarValor(int clave, int valor) {
        NodeClaveDiccionarioMultipleDinamico nodoClave = buscarClave(clave);
        if (nodoClave == null) return;

        NodeValorDiccionarioMultipleDinamico curr = nodoClave.getPrimero();
        NodeValorDiccionarioMultipleDinamico prev = null;

        while (curr != null && curr.getValor() != valor) {
            prev = curr;
            curr = curr.getNext();
        }

        if (curr != null) {
            if (prev == null) {
                nodoClave.setPrimero(curr.getNext());
            } else {
                prev.setNext(curr.getNext());
            }

            // Si la clave quedó sin valores, se elimina también.
            if (nodoClave.getPrimero() == null) {
                Eliminar(clave);
            }
        }
    }

    @Override
    public void Eliminar(int clave) {
        NodeClaveDiccionarioMultipleDinamico curr = cabeza;
        NodeClaveDiccionarioMultipleDinamico prev = null;

        while (curr != null && curr.getClave() != clave) {
            prev = curr;
            curr = curr.getNext();
        }

        if (curr != null) {
            if (prev == null) {
                cabeza = curr.getNext();
            } else {
                prev.setNext(curr.getNext());
            }
        }
    }

    @Override
    public int[] Recuperar(int clave) {
        NodeClaveDiccionarioMultipleDinamico nodoClave = buscarClave(clave);
        if (nodoClave == null) return new int[0];

        int count = 0;
        NodeValorDiccionarioMultipleDinamico curr = nodoClave.getPrimero();
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }

        int[] result = new int[count];
        curr = nodoClave.getPrimero();
        for (int i = 0; i < count; i++) {
            result[i] = curr.getValor();
            curr = curr.getNext();
        }
        return result;
    }

    @Override
    public int[] Claves() {
        int count = 0;
        NodeClaveDiccionarioMultipleDinamico curr = cabeza;
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }

        int[] result = new int[count];
        curr = cabeza;
        for (int i = 0; i < count; i++) {
            result[i] = curr.getClave();
            curr = curr.getNext();
        }
        return result;
    }

    private NodeClaveDiccionarioMultipleDinamico buscarClave(int clave) {
        NodeClaveDiccionarioMultipleDinamico curr = cabeza;
        while (curr != null && curr.getClave() != clave) {
            curr = curr.getNext();
        }
        return curr;
    }

    private boolean existeValor(NodeClaveDiccionarioMultipleDinamico nodoClave, int valor) {
        NodeValorDiccionarioMultipleDinamico curr = nodoClave.getPrimero();
        while (curr != null) {
            if (curr.getValor() == valor) return true;
            curr = curr.getNext();
        }
        return false;
    }
}
