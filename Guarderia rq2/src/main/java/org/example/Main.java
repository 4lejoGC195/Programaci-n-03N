package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia();

        // Agregar niños
        guarderia.agregarNino(new Nino("1", "Juan Pérez", 4, "Masculino", "12345678", "Ninguna", "Ana Pérez", "555-1234"));
        guarderia.agregarNino(new Nino("2", "María López", 6, "Femenino", "87654321", "Ninguna", "Luis López", "555-5678"));
        guarderia.agregarNino(new Nino("3", "Pedro Gómez", 5, "Masculino", "11223344", "Ninguna", "Sofía Gómez", "555-9101"));
        guarderia.agregarNino(new Nino("4", "Lucía Martínez", 7, "Femenino", "44332211", "Ninguna", "Carlos Martínez", "555-1213"));

        // Obtener y mostrar niños mayores de 5 años
        List<Nino> mayoresDe5 = guarderia.obtenerNinosMayoresDe5();
        System.out.println("Niños mayores de 5 años:");
        for (Nino nino : mayoresDe5) {
            System.out.println(nino);
        }
    }
}