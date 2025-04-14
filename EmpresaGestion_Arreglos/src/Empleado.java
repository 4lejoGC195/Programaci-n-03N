public class Empleado {
    private String cedula;
    private String nombre;
    private String cargo;
    private int anios;
    private double salario;

    public Empleado(String cedula, String nombre, String cargo, int anios, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
        this.anios = anios;
        this.salario = salario;
    }

    public void mostrarInfo() {
        System.out.println("Cédula: " + cedula + ", Nombre: " + nombre + 
                           ", Cargo: " + cargo + ", Años: " + anios + 
                           ", Salario: " + salario);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
