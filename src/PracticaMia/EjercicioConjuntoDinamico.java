package PracticaMia;

import Implementacion.ConjuntoDinamico;
import Interface.ConjuntoTDA;

public class EjercicioConjuntoDinamico {
    public static void main(String[] args) {
        ConjuntoTDA padron = new ConjuntoDinamico();

        padron.InicializarConjunto();

        // Registrar alumnos habilitados para votar
        padron.Agregar(1001);
        padron.Agregar(1002);
        padron.Agregar(1003);
        padron.Agregar(1004);

        // Intento de agregar repetido
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

        // Eliminar un alumno del padrón
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
