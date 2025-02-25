package org.example;




class Nino {
    private String id;
    private String nombreCompleto;
    private int edad;
    private String genero;
    private String documentoIdentidad;
    private String alergias;
    private String nombreAcudiente;
    private String numeroContacto;

    // Constructor
    public Nino(String id, String nombreCompleto, int edad, String genero, String documentoIdentidad,
                String alergias, String nombreAcudiente, String numeroContacto) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.genero = genero;
        this.documentoIdentidad = documentoIdentidad;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroContacto = numeroContacto;
    }

    // Getters
    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Nino{" +
                "id='" + id + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                ", alergias='" + alergias + '\'' +
                ", nombreAcudiente='" + nombreAcudiente + '\'' +
                ", numeroContacto='" + numeroContacto + '\'' +
                '}';
    }
}