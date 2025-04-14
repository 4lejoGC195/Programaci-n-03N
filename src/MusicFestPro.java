import java.util.ArrayList;

class Asistente {
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private ArrayList<String> entradas;

    public Asistente(int id, String nombre, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.entradas = new ArrayList<>();
    }

    public void comprarEntrada(String tipo) {
        entradas.add(tipo);
    }

    public void mostrarEntradas() {
        System.out.println(nombre + " ha comprado: " + entradas);
    }
}

class Artista {
    private int id;
    private String nombre;
    private String genero;
    private String riderTecnico;

    public Artista(int id, String nombre, String genero, String riderTecnico) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.riderTecnico = riderTecnico;
    }

    public String getInfo() {
        return "Artista: " + nombre + " - Género: " + genero;
    }
}

class Concierto {
    private int id;
    private String fecha;
    private String lugar;
    private ArrayList<Artista> artistas;
    private String estado;

    public Concierto(int id, String fecha, String lugar, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.lugar = lugar;
        this.estado = estado;
        this.artistas = new ArrayList<>();
    }

    public void agregarArtista(Artista artista) {
        artistas.add(artista);
    }

    public void mostrarDetalles() {
        System.out.println("Concierto ID: " + id + " - " + fecha + " en " + lugar + " - Estado: " + estado);
        for (Artista a : artistas) {
            System.out.println(a.getInfo());
        }
    }
}

public class MusicFestPro {
    public static void main(String[] args) {
        Asistente asistente1 = new Asistente(1, "Carlos Méndez", "carlos@mail.com", "123456789");
        asistente1.comprarEntrada("VIP");
        asistente1.mostrarEntradas();

        Artista artista1 = new Artista(101, "The Neon Lights", "Rock", "Luces LED, amplificadores Marshall");
        Concierto concierto1 = new Concierto(201, "10/12/2025", "Auditorio Central", "Programado");
        concierto1.agregarArtista(artista1);

        concierto1.mostrarDetalles();
    }
}