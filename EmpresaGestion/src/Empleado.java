class Empleado {
    String cedula;
    String nombre;
    String cargo;
    int anios;
    double salario;

    Empleado(String cedula, String nombre, String cargo, int anios, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
        this.anios = anios;
        this.salario = salario;
    }

    void mostrarInfo() {
        System.out.println("Cédula: " + cedula + ", Nombre: " + nombre + ", Cargo: " + cargo + ", Años: " + anios + ", Salario: " + salario);
    }
}
