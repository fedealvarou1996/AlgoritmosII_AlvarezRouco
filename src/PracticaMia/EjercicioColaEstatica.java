package PracticaMia;

import Interface.ColaTDA;
import Implementacion.ColaEstatica;

public class EjercicioColaEstatica {
    public static void main(String[] args) {
        ColaTDA filaCajero = new ColaEstatica();

        filaCajero.InicializarCola();

        // Llegan clientes
        filaCajero.Acolar(101);
        filaCajero.Acolar(102);
        filaCajero.Acolar(103);
        filaCajero.Acolar(104);

        System.out.println("Llego la fila de clientes al cajero.");

        // Atender al primero
        if (!filaCajero.ColaVacia()) {
            System.out.println("Se esta atendiendo al cliente: " + filaCajero.Primero());
            filaCajero.Desacolar();
        }

        // Atender al siguiente
        if (!filaCajero.ColaVacia()) {
            System.out.println("Se esta atendiendo al cliente: " + filaCajero.Primero());
            filaCajero.Desacolar();
        }

        // Mostrar los que quedan en espera
        System.out.println("Clientes que siguen esperando en la fila:");
        while (!filaCajero.ColaVacia()) {
            System.out.println("Cliente: " + filaCajero.Primero());
            filaCajero.Desacolar();
        }

        System.out.println("La fila quedo vacia.");

    }
}
