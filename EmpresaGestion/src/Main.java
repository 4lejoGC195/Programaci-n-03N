import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa empresa = new Empresa("Mi Empresa");

        while (true) {
            System.out.println("\n1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            if (opcion == 1) {
                System.out.println("Ingrese cédula:");
                String cedula = sc.nextLine();
                System.out.println("Ingrese nombre:");
                String nombre = sc.nextLine();
                System.out.println("Ingrese cargo:");
                String cargo = sc.nextLine();
                System.out.println("Ingrese años en la empresa:");
                int anios = sc.nextInt();
                System.out.println("Ingrese salario:");
                double salario = sc.nextDouble();

                Empleado nuevo = new Empleado(cedula, nombre, cargo, anios, salario);
                empresa.agregarEmpleado(nuevo);
                System.out.println("Empleado agregado.");
            } else if (opcion == 2) {
                empresa.mostrarEmpleados();
            } else {
                break;
            }
        }
        sc.close();
    }
}
