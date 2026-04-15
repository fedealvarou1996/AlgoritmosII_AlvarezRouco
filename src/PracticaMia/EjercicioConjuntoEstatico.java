package PracticaMia;

import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class EjercicioConjuntoEstatico {
    public static void main(String[] args) {
        ConjuntoTDA padron = new ConjuntoEstatico();

        padron.InicializarConjunto();

        // Registrar alumnos en el padron
        padron.Agregar(1001);
        padron.Agregar(1002);
        padron.Agregar(1003);
        padron.Agregar(1004);

        // Intentar agregar repetido
        padron.Agregar(1002);

        System.out.println("Consulta de alumnos en el padron:");

        if (padron.Pertenece(1002)) {
            System.out.println("El alumno 1002 esta habilitado para votar.");
        } else {
            System.out.println("El alumno 1002 NO esta habilitado para votar.");
        }

        if (padron.Pertenece(2000)) {
            System.out.println("El alumno 2000 esta habilitado para votar.");
        } else {
            System.out.println("El alumno 2000 NO esta habilitado para votar.");
        }

        // Sacar un alumno del padron
        padron.Sacar(1003);

        System.out.println("\nPadron final:");
        while (!padron.ConjuntoVacio()) {
            int alumno = padron.Elegir();
            System.out.println("Alumno habilitado: " + alumno);
            padron.Sacar(alumno);
        }

        System.out.println("El padron quedo vacio.");
    }
}
