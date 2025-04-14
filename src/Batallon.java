import java.util.ArrayList;

class Vehiculo {
    protected int id;
    protected String modelo;
    protected int añoFabricacion;
    protected int kilometraje;
    protected String estadoOperativo;
    protected int misionesCompletadas;

    public Vehiculo(int id, String modelo, int añoFabricacion, int kilometraje, String estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.kilometraje = kilometraje;
        this.estadoOperativo = estadoOperativo;
        this.misionesCompletadas = 0;
    }

    public void registrarMision() {
        this.misionesCompletadas++;
    }

    public boolean necesitaReemplazo() {
        return this.misionesCompletadas > 50;
    }

    public String getInfo() {
        return "ID: " + id + ", Modelo: " + modelo + ", Estado: " + estadoOperativo + ", Misiones: " + misionesCompletadas;
    }
}

class TransporteTropas extends Vehiculo {
    private int capacidadSoldados;

    public TransporteTropas(int id, String modelo, int añoFabricacion, int kilometraje, String estadoOperativo, int capacidadSoldados) {
        super(id, modelo, añoFabricacion, kilometraje, estadoOperativo);
        this.capacidadSoldados = capacidadSoldados;
    }
}

class VehiculoBlindado extends Vehiculo {
    private int nivelBlindaje;

    public VehiculoBlindado(int id, String modelo, int añoFabricacion, int kilometraje, String estadoOperativo, int nivelBlindaje) {
        super(id, modelo, añoFabricacion, kilometraje, estadoOperativo);
        this.nivelBlindaje = nivelBlindaje;
    }
}

class VehiculoApoyo extends Vehiculo {
    private String tipoFuncion;

    public VehiculoApoyo(int id, String modelo, int añoFabricacion, int kilometraje, String estadoOperativo, String tipoFuncion) {
        super(id, modelo, añoFabricacion, kilometraje, estadoOperativo);
        this.tipoFuncion = tipoFuncion;
    }
}

public class Batallon {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new TransporteTropas(1, "Humvee", 2015, 12000, "Disponible", 10));
        vehiculos.add(new VehiculoBlindado(2, "Tanque M1", 2018, 8000, "En Misión", 5));
        vehiculos.add(new VehiculoApoyo(3, "Camión Logístico", 2016, 15000, "En Mantenimiento", "Logística"));

        for (int i = 0; i < 51; i++) {
            vehiculos.get(0).registrarMision();
        }

        System.out.println("Vehículos con más de 50 misiones:");
        for (Vehiculo v : vehiculos) {
            if (v.necesitaReemplazo()) {
                System.out.println(v.getInfo());
            }
        }
    }
}