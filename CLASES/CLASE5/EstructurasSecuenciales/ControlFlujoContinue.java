/*
 * Haz un programa que pida al usuario ingresar 10 números enteros. El programa debe mostrar solo
 * los números pares, usando continue para saltar los impares
 */
package CLASES.CLASE5.EstructurasSecuenciales;

import java.util.Scanner;

public class ControlFlujoContinue {
    // Funcion que muestra la cantidad y los numeros pares
    // Funcion que muestra la cantidad total de pares
    public static void mostrarCantidadPares(int contadorPares) {
        System.out.println("\nCantidad total de numeros pares ingresados: " + contadorPares);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorPares = 0;

        System.out.println("Ingrese 10 numeros enteros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Numero " + i + ": ");
            int num = sc.nextInt();

            if (num % 2 != 0) {
                continue; // si es impar, no hace nada y salta a la siguiente iteracion
            }

            System.out.println("El numero " + num + " es PAR");
            contadorPares++;
        }

        // Llamada a la funcion
        mostrarCantidadPares(contadorPares);

        sc.close();
    }
}
