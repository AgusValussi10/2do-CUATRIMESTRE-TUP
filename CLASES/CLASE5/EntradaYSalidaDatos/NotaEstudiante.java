/*
 * El usuario debe ingresar tres notas (decimales). El programa calcula el promedio y lo muestra con
 * System.out.printf, de la forma: El promedio del alumno es: 7.33
 */
package CLASES.CLASE5.EntradaYSalidaDatos;

import java.util.Scanner;

public class NotaEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir las 3 notas
        System.out.print("Ingrese la primera nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = sc.nextDouble();

        // Calcular promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Mostrar resultado con 2 decimales
        System.out.printf("El promedio del alumno es: %.2f\n", promedio);

        sc.close();
    }
}
