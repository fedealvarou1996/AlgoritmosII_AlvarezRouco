package PracticaMia;

import Implementacion.DiccionarioMultipleEstatico;
import Interface.DiccionarioMultipleTDA;

public class EjercicioDiccionarioMultipleEstatico {
    public static void main(String[] args) {
        DiccionarioMultipleTDA agenda = new DiccionarioMultipleEstatico();

        agenda.InicializarDiccionario();

        // Contactos:
        // 1 = Ana
        // 2 = Juan
        // 3 = Lucia

        // Ana tiene dos telefonos
        agenda.Agregar(1, 111111);
        agenda.Agregar(1, 222222);

        // Juan tiene un telefono
        agenda.Agregar(2, 333333);

        // Lucia tiene dos telefonos
        agenda.Agregar(3, 444444);
        agenda.Agregar(3, 555555);

        // Intento de agregar repetido para Ana
        agenda.Agregar(1, 111111);

        // Mostrar telefonos de Ana
        System.out.println("Telefonos de Ana:");
        int[] telefonosAna = agenda.Recuperar(1);
        for (int i = 0; i < telefonosAna.length; i++) {
            System.out.println(telefonosAna[i]);
        }

        // Eliminar un telefono de Lucia
        agenda.EliminarValor(3, 444444);

        // Mostrar telefonos de Lucia despues de eliminar uno
        System.out.println("\nTelefonos de Lucia:");
        int[] telefonosLucia = agenda.Recuperar(3);
        for (int i = 0; i < telefonosLucia.length; i++) {
            System.out.println(telefonosLucia[i]);
        }

        // Eliminar a Juan completo de la agenda
        agenda.Eliminar(2);

        // Mostrar claves restantes
        System.out.println("\nClaves de contactos restantes:");
        int[] claves = agenda.Claves();
        for (int i = 0; i < claves.length; i++) {
            System.out.println("Clave: " + claves[i]);
        }
    }
}
