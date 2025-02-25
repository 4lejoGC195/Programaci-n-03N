package org.example;

// Clase principal para probar la solución
public class Main {
    public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados();

        // Agregar empleados
        gestor.agregarEmpleado(new Empleado("001", "Sofía Pérez", "Desarrolladora", "sofia@empresa.com", "123456789", "2023-01-15"));
        gestor.agregarEmpleado(new Empleado("002", "Carlos López", "Analista", "carlos@empresa.com", "987654321", "2023-02-20"));

        // Obtener y mostrar un empleado
        Empleado empleado = gestor.obtenerEmpleado("001");
        System.out.println("Empleado encontrado: " + empleado);

        // Actualizar un empleado
        gestor.actualizarEmpleado("001", new Empleado("001", "Sofía Pérez", "Líder de Proyecto", "sofia@empresa.com", "123456789", "2023-01-15"));
        System.out.println("Empleado actualizado: " + gestor.obtenerEmpleado("001"));

        // Eliminar un empleado
        gestor.eliminarEmpleado("002");
        System.out.println("Empleado con ID 002 eliminado.");

        // Intentar obtener el empleado eliminado
        Empleado empleadoEliminado = gestor.obtenerEmpleado("002");
        if (empleadoEliminado == null) {
            System.out.println("Empleado con ID 002 no encontrado.");
        }
    }
}