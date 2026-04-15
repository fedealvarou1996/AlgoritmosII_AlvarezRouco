package PracticaMia;

import Implementacion.DiccionarioSimpleEstatico;
import Interface.DiccionarioSimpleTDA;

public class EjercicioDiccionarioSimpleEstatico {
    public static void main(String[] args) {
        DiccionarioSimpleTDA agenda = new DiccionarioSimpleEstatico();

        agenda.InicializarDiccionario();

        // Agenda de contactos
        // 1 = Ana
        // 2 = Juan
        // 3 = Lucia
        // 4 = Pedro

        agenda.Agregar(1, 111111);
        agenda.Agregar(2, 222222);
        agenda.Agregar(3, 333333);

        // Actualizar telefono de Juan
        agenda.Agregar(2, 999999);

        // Agregar otro contacto
        agenda.Agregar(4, 444444);

        // Eliminar un contacto
        agenda.Eliminar(3);

        // Mostrar claves cargadas
        int[] claves = agenda.Claves();

        System.out.println("Claves de contactos registradas en la agenda:");
        for (int i = 0; i < claves.length; i++) {
            System.out.println("Clave de contacto: " + claves[i]);
        }
    }
}
