/*
 * Crea un programa que pida al usuario ingresar números enteros en un bucle infinito. 1. El
 * programa se detiene (break) cuando el usuario ingresa el número 999. 2. Luego muestra la cantidad
 * de números ingresados antes de detenerse.
 */

package CLASES.CLASE5.EstructurasSecuenciales;

import java.util.Scanner;

public class ControlFlujo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        System.out.println("Ingrese numeros enteros (para detenerse escriba 999):");

        while (true) { // bucle infinito
            int num = sc.nextInt();

            if (num == 999) {
                break; // salir del bucle cuando se ingrese 999
            }

            contador++; // contar los numeros ingresados
        }

        System.out.println("Cantidad de numeros ingresados antes de detenerse: " + contador);

        sc.close();
    }
}
