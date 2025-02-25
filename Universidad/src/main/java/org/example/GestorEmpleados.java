package org.example;
import java.util.ArrayList; // Importar ArrayList
import java.util.List;      // Importar List

class GestorEmpleados {
    private List<Empleado> empleados;

    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public Empleado obtenerEmpleado(String numeroIdentificacion) {
        for (Empleado empleado : empleados) {
            if (empleado.getNumeroIdentificacion().equals(numeroIdentificacion)) {
                return empleado;
            }
        }
        return null; // Retorna null si no se encuentra el empleado
    }

    public void actualizarEmpleado(String numeroIdentificacion, Empleado nuevoEmpleado) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNumeroIdentificacion().equals(numeroIdentificacion)) {
                empleados.set(i, nuevoEmpleado);
                return;
            }
        }
    }

    public void eliminarEmpleado(String numeroIdentificacion) {
        empleados.removeIf(empleado -> empleado.getNumeroIdentificacion().equals(numeroIdentificacion));
    }
}
