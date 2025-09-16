/*
 * Pide al usuario que ingrese una frase y muéstrala en: Todo mayúsculas (toUpperCase()) Todo
 * minúsculas (toLowerCase())
 */
package CLASES.CLASE5.Cadenas;

import java.util.Scanner;

public class MayusYMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir frase al usuario
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        // Mostrar en mayúsculas
        System.out.println("En MAYUSCULAS: " + frase.toUpperCase());

        // Mostrar en minúsculas
        System.out.println("En minusculas: " + frase.toLowerCase());

        sc.close();
    }
}
