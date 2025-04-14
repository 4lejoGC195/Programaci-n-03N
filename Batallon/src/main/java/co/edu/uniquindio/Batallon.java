package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Comparator;

public class Batallon {
    private String nombre;
    private String id;

    private LinkedList<VehiculoApoyo> listVehiculosApoyo;
    private LinkedList<VehiculoBlindado> listVehiculosBlindados;
    private LinkedList<VehiculoTransporteTropa> listVehiculosTransporteTropa;
    private LinkedList<Mision> listMisiones;

    public Batallon(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;

        this.listVehiculosApoyo = new LinkedList<>();
        this.listVehiculosBlindados = new LinkedList<>();
        this.listVehiculosTransporteTropa = new LinkedList<>();
        this.listMisiones = new LinkedList<>();
    }

    public boolean crearVehiculoBlindado(String id, String modelo, int anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo, int nivelBlindaje) {
        boolean flag = false;
        for (VehiculoBlindado vehiculo : listVehiculosBlindados) {
            if (vehiculo.getId().equals(id)) {
                return false;
            }
        }
        return flag;
    }

    public boolean registrarMision(LocalDate fechaMision, String ubicacionMision, LinkedList listPersonal, String idVehiculomision) {
        boolean flag = false;
        String cantMisionesActuales = String.valueOf(listMisiones.size() + 1);
        Mision newMision = new Mision(cantMisionesActuales, fechaMision, ubicacionMision);
        return flag;
    }

    public LinkedList<Vehiculo> obtenerVehiculosCantMisiones() {
        LinkedList<Vehiculo> vehiculosMisionesCompletadas = new LinkedList<>();
        for (VehiculoApoyo vehiculo : listVehiculosApoyo) {
            if (vehiculo.getMisionesCompletadas() > 50) {
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }
        for (VehiculoBlindado vehiculo : listVehiculosBlindados) {
            if (vehiculo.getMisionesCompletadas() > 50) {
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }
        for (VehiculoTransporteTropa vehiculo : listVehiculosTransporteTropa) {
            if (vehiculo.getMisionesCompletadas() > 50) {
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }
        return vehiculosMisionesCompletadas;
    }

    public double calcularKilometrajePromedio() {
        double totalKilometrajeTransporte = 0;
        double totalKilometrajeBlindado = 0;
        double totalKilometrajeApoyo = 0;
        int countTransporte = 0;
        int countBlindado = 0;
        int countApoyo = 0;

        for (VehiculoTransporteTropa vehiculo : listVehiculosTransporteTropa) {
            totalKilometrajeTransporte += vehiculo.getKilometraje();
            countTransporte++;
        }

        for (VehiculoBlindado vehiculo : listVehiculosBlindados) {
            totalKilometrajeBlindado += vehiculo.getKilometraje();
            countBlindado++;
        }

        for (VehiculoApoyo vehiculo : listVehiculosApoyo) {
            totalKilometrajeApoyo += vehiculo.getKilometraje();
            countApoyo++;
        }

        double promedioTransporte = countTransporte > 0 ? totalKilometrajeTransporte / countTransporte : 0;
        double promedioBlindado = countBlindado > 0 ? totalKilometrajeBlindado / countBlindado : 0;
        double promedioApoyo = countApoyo > 0 ? totalKilometrajeApoyo / countApoyo : 0;

        System.out.println("Kilometraje promedio Transporte: " + promedioTransporte);
        System.out.println("Kilometraje promedio Blindado: " + promedioBlindado);
        System.out.println("Kilometraje promedio Apoyo: " + promedioApoyo);

        return promedioTransporte;
    }

    public LinkedList<Mision> filtrarMisiones(String ubicacion, LocalDate fechaInicio, LocalDate fechaFin) {
        LinkedList<Mision> misionesFiltradas = new LinkedList<>();
        for (Mision mision : listMisiones) {
            if (mision.getUbicacion().equals(ubicacion) &&
                    (mision.getFecha().isEqual(fechaInicio) || mision.getFecha().isEqual(fechaFin) ||
                            (mision.getFecha().isAfter(fechaInicio) && mision.getFecha().isBefore(fechaFin)))) {
                misionesFiltradas.add(mision);
            }
        }
        return misionesFiltradas;
    }

    public Vehiculo obtenerVehiculoConMasMisiones() {
        Vehiculo vehiculoConMasMisiones = null;
        int maxMisiones = 0;

        for (VehiculoApoyo vehiculo : listVehiculosApoyo) {
            if (vehiculo.getMisionesCompletadas() > maxMisiones) {
                maxMisiones = vehiculo.getMisionesCompletadas();
                vehiculoConMasMisiones = vehiculo;
            }
        }

        for (VehiculoBlindado vehiculo : listVehiculosBlindados) {
            if (vehiculo.getMisionesCompletadas() > maxMisiones) {
                maxMisiones = vehiculo.getMisionesCompletadas();
                vehiculoConMasMisiones = vehiculo;
            }
        }

        for (VehiculoTransporteTropa vehiculo : listVehiculosTransporteTropa) {
            if (vehiculo.getMisionesCompletadas() > maxMisiones) {
                maxMisiones = vehiculo.getMisionesCompletadas();
                vehiculoConMasMisiones = vehiculo;
            }
        }

        return vehiculoConMasMisiones;
    }

    public LinkedList<Vehiculo> buscarVehiculosPorAnio(int anio) {
        LinkedList<Vehiculo> vehiculosEncontrados = new LinkedList<>();
        vehiculosEncontrados.addAll(listVehiculosApoyo);
        vehiculosEncontrados.addAll(listVehiculosBlindados);
        vehiculosEncontrados.addAll(listVehiculosTransporteTropa);
        vehiculosEncontrados.removeIf(vehiculo -> vehiculo.getAnioFabricacion() != anio);
        vehiculosEncontrados.sort(Comparator.comparing(Vehiculo::getModelo));
        return vehiculosEncontrados;
    }

    public LinkedList<Vehiculo> ordenarVehiculosPorMisionesCompletadas() {
        LinkedList<Vehiculo> todosVehiculos = new LinkedList<>();
        todosVehiculos.addAll(listVehiculosApoyo);
        todosVehiculos.addAll(listVehiculosBlindados);
        todosVehiculos.addAll(listVehiculosTransporteTropa);
        todosVehiculos.sort(Comparator.comparingInt(Vehiculo::getMisionesCompletadas).reversed());
        return todosVehiculos;
    }

    public HashMap<EstadoOperativo, Integer> actualizarEstadoOperativo(double umbralKilometraje) {
        HashMap<EstadoOperativo, Integer> resumenEstado = new HashMap<>();
        resumenEstado.put(EstadoOperativo.EN_MANTENIMIENTO, 0);
        resumenEstado.put(EstadoOperativo.EN_MISION, 0);
        resumenEstado.put(EstadoOperativo.DISPONIBLE, 0);

        for (Vehiculo vehiculo : listVehiculosApoyo) {
            actualizarEstado(vehiculo, umbralKilometraje, resumenEstado);
        }
        for (Vehiculo vehiculo : listVehiculosBlindados) {
            actualizarEstado(vehiculo, umbralKilometraje, resumenEstado);
        }
        for (Vehiculo vehiculo : listVehiculosTransporteTropa) {
            actualizarEstado(vehiculo, umbralKilometraje, resumenEstado);
        }

        return resumenEstado;
    }

    private void actualizarEstado(Vehiculo vehiculo, double umbralKilometraje, HashMap<EstadoOperativo, Integer> resumenEstado) {
        if (vehiculo.getKilometraje() > umbralKilometraje) {
            vehiculo.setEstadoOperativo(EstadoOperativo.EN_MANTENIMIENTO);
            resumenEstado.put(EstadoOperativo.EN_MANTENIMIENTO, resumenEstado.get(EstadoOperativo.EN_MANTENIMIENTO) + 1);
        } else if (vehiculo.getListMisiones().stream().anyMatch(m -> !m.getFecha().isBefore(LocalDate.now()))) {
            vehiculo.setEstadoOperativo(EstadoOperativo.EN_MISION);
            resumenEstado.put(EstadoOperativo.EN_MISION, resumenEstado.get(EstadoOperativo.EN_MISION) + 1);
        } else {
            vehiculo.setEstadoOperativo(EstadoOperativo.DISPONIBLE);
            resumenEstado.put(EstadoOperativo.DISPONIBLE, resumenEstado.get(EstadoOperativo.DISPONIBLE) + 1);
        }
    }

    public LinkedList<VehiculoApoyo> getListVehiculosApoyo() {
        return listVehiculosApoyo;
    }

    public LinkedList<VehiculoBlindado> getListVehiculosBlindados() {
        return listVehiculosBlindados;
    }

    public LinkedList<VehiculoTransporteTropa> getListVehiculosTransporteTropa() {
        return listVehiculosTransporteTropa;
    }

    public LinkedList<Mision> getListMisiones() {
        return listMisiones;
    }
}