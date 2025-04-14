package co.edu.uniquindio;

public class Soldado {
    private String id;
    private String nombreCompleto;
    private String rango;
    private String especialidad;
    private int edad;
    private boolean disponible;

    public Soldado(String id, String nombreCompleto, String rango, String especialidad, int edad) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.rango = rango;
        this.especialidad = especialidad;
        this.edad = edad;
        this.disponible = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}