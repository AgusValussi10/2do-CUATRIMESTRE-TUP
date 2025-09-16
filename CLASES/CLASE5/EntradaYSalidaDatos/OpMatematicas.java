/*
 * Pide al usuario dos números enteros y muestra en pantalla: 1. La suma con System.out.println 2.
 * El producto con System.out.printf (formato: “El producto es: %d”)
 */
package CLASES.CLASE5.EntradaYSalidaDatos;

import java.util.Scanner;

public class OpMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir dos numeros enteros
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        // Operaciones
        int suma = num1 + num2;
        int producto = num1 * num2;

        // Mostrar resultados
        System.out.println("La suma es: " + suma);
        System.out.printf("El producto es: %d\n", producto);

        sc.close();
    }
}
