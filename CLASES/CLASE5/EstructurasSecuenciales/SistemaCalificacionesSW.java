/*
 * Crea un programa en Java que simule un sistema de calificaciones: 1. Si la nota es menor a 6,
 * mostrar “Reprobado”. 2. Si la nota está entre 6 y 8, mostrar “Aprobado”. 3. Si la nota es mayor o
 * igual a 9, mostrar “Excelente”. 4. Implementa la misma lógica también con un switch para
 * practicar.
 */
package CLASES.CLASE5.EstructurasSecuenciales;

import java.util.Scanner;

public class SistemaCalificacionesSW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la nota al usuario
        System.out.print("Ingrese la nota (0 a 10): ");
        int nota = sc.nextInt();

        // Evaluar la nota con switch
        switch (nota) {
            case 0, 1, 2, 3, 4, 5:
                System.out.println("Reprobado");
                break;

            case 6, 7, 8:
                System.out.println("Aprobado");
                break;

            case 9, 10:
                System.out.println("Excelente");
                break;

            default:
                System.out.println("Nota invalida, debe estar entre 0 y 10.");
                break;
        }

        sc.close();
    }
}
