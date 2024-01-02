import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();
        Empleado empleado = new Empleado(nombre, edad, salario);
        System.out.println("Información del empleado:");
        empleado.mostrarInformacion();
        System.out.println("información modificada del empleado:");
        empleado.setNombre("juan");
        empleado.setEdad(30);
        empleado.setSalario(3000.0);
        System.out.println("Información del empleado:");
        empleado.mostrarInformacion();
    }
}
