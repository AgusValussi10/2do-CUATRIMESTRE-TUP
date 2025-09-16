/*
 * Solicita al usuario ingresar una temperatura en grados Celsius y convierte a Fahrenheit usando la
 * fórmula: F = (C * 9/5) + 32 Muestra el resultado con printf, limitando a 2 decimales.
 */
package CLASES.CLASE5.EntradaYSalidaDatos;

import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir temperatura en Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        // Conversion a Fahrenheit
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        // Mostrar con 2 decimales
        System.out.printf("La temperatura en Fahrenheit es: %.2f\n", fahrenheit);

        sc.close();
    }
}
