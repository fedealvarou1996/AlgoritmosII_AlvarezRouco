package PracticaMia;

import Interface.ColaPrioridadTDA;
import Implementacion.ColaPrioridadEstatica;

public class EjercicioColaPrioridadEstatica {
    public static void main(String[] args){
        ColaPrioridadTDA filaCajero = new ColaPrioridadEstatica();

        filaCajero.InicializarColaPrioridad();

        // Llegan clientes: numero, prioridad
        filaCajero.AcolarPrioridad(101, 1); // cliente comun
        filaCajero.AcolarPrioridad(102, 1); // cliente comun
        filaCajero.AcolarPrioridad(201, 5); // cliente preferencial
        filaCajero.AcolarPrioridad(103, 1); // cliente comun
        filaCajero.AcolarPrioridad(202, 5); // cliente preferencial

        System.out.println("Fila de cajero con prioridad cargada.");

        // Atender dos clientes
        if (!filaCajero.ColaVacia()) {
            System.out.println("Atendiendo al cliente: " + filaCajero.Primero() +
                    " | Prioridad: " + filaCajero.Prioridad());
            filaCajero.Desacolar();
        }

        if (!filaCajero.ColaVacia()) {
            System.out.println("Atendiendo al cliente: " + filaCajero.Primero() +
                    " | Prioridad: " + filaCajero.Prioridad());
            filaCajero.Desacolar();
        }

        // Mostrar quiénes quedan
        System.out.println("Clientes que siguen esperando:");
        while (!filaCajero.ColaVacia()) {
            System.out.println("Cliente: " + filaCajero.Primero() +
                    " | Prioridad: " + filaCajero.Prioridad());
            filaCajero.Desacolar();
        }

        System.out.println("La fila quedo vacia.");

    }
}
