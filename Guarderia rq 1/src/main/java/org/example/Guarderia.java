package org.example;

import java.util.ArrayList;
import java.util.List;

public class Guarderia {
    private List<Nino> listaNinos;

    public Guarderia() {
        this.listaNinos = new ArrayList<>();
    }

    public void registrarNino(Nino nino) {
        listaNinos.add(nino);
        System.out.println("Nino registrado con éxito.");
    }

    public void listarNinos() {
        for (Nino nino : listaNinos) {
            nino.mostrarInformacion();
            System.out.println("-------------------");
        }
    }
}
