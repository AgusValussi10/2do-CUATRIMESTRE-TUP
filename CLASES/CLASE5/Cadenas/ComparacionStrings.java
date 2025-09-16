/*
 * Escribe un programa que pida dos palabras y verifique: Si son exactamente iguales (equals) Si son
 * iguales ignorando mayúsculas (equalsIgnoreCase)
 */
package CLASES.CLASE5.Cadenas;

import java.util.Scanner;

public class ComparacionStrings {
    public static void main(String[] gs) {
        Scanner sc = new Scanner(System.in);

        // Pedir palabras al usuario
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = sc.nextLine();

        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = sc.nextLine();

        // Comparación exacta (sensible a mayúsculas)
        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son EXACTAMENTE iguales (equals).");
        } else {
            System.out.println("Las palabras NO son exactamente iguales (equals).");
        }

        // Comparación ignorando mayúsculas
        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("Las palabras son iguales ignorando mayusculas (equalsIgnoreCase).");
        } else {
            System.out.println("Las palabras NO son iguales ni siquiera ignorando mayusculas.");
        }

        sc.close();
    }
}
