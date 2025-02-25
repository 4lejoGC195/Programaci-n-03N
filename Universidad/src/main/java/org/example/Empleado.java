package org.example;

import java.util.ArrayList; // Importar ArrayList
import java.util.List;      // Importar List

// Clase Empleado
class Empleado {
    private String numeroIdentificacion;
    private String nombreCompleto;
    private String puesto;
    private String correoElectronico;
    private String numeroTelefono;
    private String fechaContratacion;

    // Constructor
    public Empleado(String numeroIdentificacion, String nombreCompleto, String puesto,
                    String correoElectronico, String numeroTelefono, String fechaContratacion) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombreCompleto = nombreCompleto;
        this.puesto = puesto;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
        this.fechaContratacion = fechaContratacion;
    }

    // Getters
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", puesto='" + puesto + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", fechaContratacion='" + fechaContratacion + '\'' +
                '}';
    }
}
