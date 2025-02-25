package org.example;

public class Nino {
    private String nombre;
    private int edad;
    private String genero;
    private String documentoIdentidad;
    private String alergias;
    private Acudiente acudiente;

    public Nino(String nombre, int edad, String genero, String documentoIdentidad, String alergias, Acudiente acudiente) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documentoIdentidad = documentoIdentidad;
        this.alergias = alergias;
        this.acudiente = acudiente;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Documento: " + documentoIdentidad);
        System.out.println("Alergias: " + alergias);
        System.out.println("Acudiente: " + acudiente.getNombre() + " - " + acudiente.getTelefono());
    }
}
