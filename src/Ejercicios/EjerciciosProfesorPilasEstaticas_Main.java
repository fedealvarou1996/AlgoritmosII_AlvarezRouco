package Ejercicios;

import Implementacion.Estrategia_1_String_PilasEstaticas;
import Interface.PilaTDA;
import Interface.PilaTDAStrings;

public class EjerciciosProfesorPilasEstaticas_Main {
    public static void main(String[] args) {
/*
        PilaTDA p1 = new Estrategia_1();
        PilaTDA p2 = new Estrategia_2();
        PilaTDA p3 = new Estrategia_3();
*/
        PilaTDAStrings p4 = new Estrategia_1_String_PilasEstaticas();
/*
        probarPila("Estrategia 1", p1);
        probarPila("Estrategia 2", p2);
        probarPila("Estrategia 3", p3);

 */
        historialNavegacionURL("historialNavegacionURL", p4);
    }

    public static void probarPila(String nombre, PilaTDA pila) {
        System.out.println("=== " + nombre + " ===");

        pila.InicializarPila();

        pila.Apilar(10);
        pila.Apilar(20);
        pila.Apilar(30);

        System.out.println("Tope luego de apilar 10, 20, 30: " + pila.Tope());

        pila.Desapilar();
        System.out.println("Tope luego de desapilar una vez: " + pila.Tope());

        pila.Desapilar();
        System.out.println("Tope luego de desapilar otra vez: " + pila.Tope());

        pila.Desapilar();
        System.out.println("¿Pila vacía?: " + pila.PilaVacia());

        System.out.println();
    }

    public static void historialNavegacionURL(String nombre, PilaTDAStrings pilaString) {
        System.out.println("=== " + nombre + " ===");

        pilaString.InicializarPila();

        pilaString.Apilar("fi.uba.ar");
        pilaString.Apilar("campus.utn.edu.ar");
        pilaString.Apilar("stackoverflow.com");

        System.out.println("Tope luego de apilar 'stackoverflow.com', 'campus.utn.edu.ar', fi.uba.ar: " + pilaString.Tope());

        pilaString.Desapilar();
        System.out.println("Tope luego de desapilar una vez: " + pilaString.Tope());

        pilaString.Desapilar();
        System.out.println("Tope luego de desapilar otra vez: " + pilaString.Tope());

        pilaString.Desapilar();
        System.out.println("¿Pila vacía?: " + pilaString.PilaVacia());

        System.out.println();
    }
}