import java.util.ArrayList;

class Empresa {
    String nombre;
    ArrayList<Empleado> empleados = new ArrayList<>();

    Empresa(String nombre) {
        this.nombre = nombre;
    }

    void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
    }

    void mostrarEmpleados() {
        for (Empleado e : empleados) {
            e.mostrarInfo();
        }
    }
}
