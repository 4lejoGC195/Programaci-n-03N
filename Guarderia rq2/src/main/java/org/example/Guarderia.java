package org.example;

import java.util.ArrayList; // Importar ArrayList
import java.util.List;      // Importar List

class Guarderia {
    private List<Nino> ninos;

    public Guarderia() {
        ninos = new ArrayList<>();
    }

    public void agregarNino(Nino nino) {
        ninos.add(nino);
    }

    public List<Nino> obtenerNinosMayoresDe5() {
        List<Nino> mayoresDe5 = new ArrayList<>();
        for (Nino nino : ninos) {
            if (nino.getEdad() > 5) {
                mayoresDe5.add(nino);
            }
        }
        return mayoresDe5;
    }
}