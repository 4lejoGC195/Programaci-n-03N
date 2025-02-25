package org.example;

public class Acudiente {
    private String nombre;
    private String telefono;

    public Acudiente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}
