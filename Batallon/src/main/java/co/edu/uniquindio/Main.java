package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Batallon batallon = new Batallon("Batallon 1", "B001");

        VehiculoApoyo vehiculoApoyo = new VehiculoApoyo("A001", "Modelo A", 2020, 15000, EstadoOperativo.DISPONIBLE, TipoFuncion.LOGISTICA);
        VehiculoBlindado vehiculoBlindado = new VehiculoBlindado("B001", "Modelo B", 2019, 20000, EstadoOperativo.DISPONIBLE, 5);
        VehiculoTransporteTropa vehiculoTransporte = new VehiculoTransporteTropa("C001", "Modelo C", 2021, 10000, EstadoOperativo.DISPONIBLE, 30);

        batallon.getListVehiculosApoyo().add(vehiculoApoyo);
        batallon.getListVehiculosBlindados().add(vehiculoBlindado);
        batallon.getListVehiculosTransporteTropa().add(vehiculoTransporte);

        LinkedList<String> personal = new LinkedList<>();
        personal.add("Soldado 1");
        personal.add("Soldado 2");

        boolean misionRegistrada = batallon.registrarMision(LocalDate.now(), "Zona de Combate", personal, "B001");
        System.out.println("Misión registrada: " + misionRegistrada);

        batallon.calcularKilometrajePromedio();

        LinkedList<Mision> misionesFiltradas = batallon.filtrarMisiones("Zona de Combate", LocalDate.now().minusDays(1), LocalDate.now());
        System.out.println("Misiones filtradas: " + misionesFiltradas.size());

        Vehiculo vehiculoConMasMisiones = batallon.obtenerVehiculoConMasMisiones();
        if (vehiculoConMasMisiones != null) {
            System.out.println("Vehículo con más misiones completadas: " + vehiculoConMasMisiones.getId());
        } else {
            System.out.println("No hay vehículos registrados.");
        }
    }
}