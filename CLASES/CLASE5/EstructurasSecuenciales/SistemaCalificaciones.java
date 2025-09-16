/*
 * Crea un programa en Java que simule un sistema de calificaciones: 1. Si la nota es menor a 6,
 * mostrar “Reprobado”. 2. Si la nota está entre 6 y 8, mostrar “Aprobado”. 3. Si la nota es mayor o
 * igual a 9, mostrar “Excelente”.
 * 
 */

package CLASES.CLASE5.EstructurasSecuenciales;

import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la nota al usuario
        System.out.print("Ingrese la nota (0 a 10): ");
        int nota = sc.nextInt();

        // Evaluar la nota
        if (nota < 6) {
            System.out.println("Reprobado");
        } else if (nota >= 6 && nota <= 8) {
            System.out.println("Aprobado");
        } else if (nota >= 9) {
            System.out.println("Excelente");
        } else {
            System.out.println("Nota invalida, debe estar entre 0 y 10.");
        }

        sc.close();
    }
}
