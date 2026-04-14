package PracticaMia;

import Interface.ColaPrioridadTDA;
import Implementacion.ColaPrioridadDinamica;

public class EjercicioColaPrioridadDinamica {
    public static void main(String[] args){
        ColaPrioridadTDA filaCajero = new ColaPrioridadDinamica();

        filaCajero.InicializarColaPrioridad();

        // numero de cliente, prioridad
        filaCajero.AcolarPrioridad(101, 1); // comun
        filaCajero.AcolarPrioridad(102, 1); // comun
        filaCajero.AcolarPrioridad(201, 5); // preferencial
        filaCajero.AcolarPrioridad(103, 1); // comun
        filaCajero.AcolarPrioridad(202, 5); // preferencial

        System.out.println("Fila del cajero con prioridad dinamica:");

        while (!filaCajero.ColaVacia()) {
            System.out.println("Atendiendo al cliente: " + filaCajero.Primero()
                    + " | Prioridad: " + filaCajero.Prioridad());
            filaCajero.Desacolar();
        }

        System.out.println("La fila quedo vacia.");
    }
}
