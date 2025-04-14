public class Empresa {
    private String nombre;
    private Empleado[] empleados;
    private int contador;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new Empleado[50];
        this.contador = 0;
    }

    public void agregarEmpleado(Empleado emp) {
        if (contador < 50) {
            empleados[contador] = emp;
            contador++;
        } else {
            System.out.println("No se pueden agregar más empleados.");
        }
    }

    public void mostrarEmpleados() {
        for (int i = 0; i < contador; i++) {
            empleados[i].mostrarInfo();
        }
    }

    public void calcularSalarios() {
        for (int i = 0; i < contador; i++) {
            double nuevoSalario = empleados[i].getSalario();

            if (empleados[i].getAnios() > 10) {
                nuevoSalario *= 1.15;
            } else if (empleados[i].getAnios() > 5) {
                nuevoSalario *= 1.10;
            } else if (empleados[i].getAnios() > 3) {
                nuevoSalario *= 1.05;
            }

            System.out.println("Empleado: " + empleados[i].getNombre() + 
                               " - Salario actualizado: " + nuevoSalario);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
