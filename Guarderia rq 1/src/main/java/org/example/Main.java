package org.example;

public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia();
        Acudiente acudiente1 = new Acudiente("María Pérez", "123456789");
        Nino nino1 = new Nino("Juan", 4, "Masculino", "A12345", "Ninguna", acudiente1);
        
        guarderia.registrarNino(nino1);
        guarderia.listarNinos();
    }
}
