package PracticaMia;

import Interface.ColaTDA;
import Implementacion.ColaDinamica;

public class EjercicioColaDinamica {
    public static void main(String[] args) {

        ColaTDA filaCajero = new ColaDinamica();

        filaCajero.InicializarCola();

        // Llegan clientes
        filaCajero.Acolar(101);
        filaCajero.Acolar(102);
        filaCajero.Acolar(103);
        filaCajero.Acolar(104);

        System.out.println("Llegaron clientes a la fila del cajero.");

        // Atender dos clientes
        if (!filaCajero.ColaVacia()) {
            System.out.println("Atendiendo al cliente: " + filaCajero.Primero());
            filaCajero.Desacolar();
        }

        if (!filaCajero.ColaVacia()) {
            System.out.println("Atendiendo al cliente: " + filaCajero.Primero());
            filaCajero.Desacolar();
        }

        // Mostrar quiénes quedan
        System.out.println("Clientes que siguen esperando:");
        while (!filaCajero.ColaVacia()) {
            System.out.println("Cliente en espera: " + filaCajero.Primero());
            filaCajero.Desacolar();
        }

        System.out.println("La fila quedo vacia.");

    }
}
