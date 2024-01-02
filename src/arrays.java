import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int numalum = scanner.nextInt();
        double[] notas = new double[numalum];
        for (int i = 0; i < numalum; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        double promedio = promedio(notas);
        System.out.println("\nNotas de los estudiantes:");
        mostrarNotas(notas);
        System.out.println("\nPromedio de las notas: " + promedio);
    }
    private static double promedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
    private static void mostrarNotas(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + notas[i]);
        }
    }
}