/*
 * Solicita al usuario una palabra y muestra cada carácter en una línea diferente usando un for con
 * charAt(i).
 */
package CLASES.CLASE5.Cadenas;

import java.util.Scanner;

public class RecorridoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir palabra al usuario
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        // Recorrer y mostrar cada caracter
        System.out.println("Caracteres de la palabra:");
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }

        sc.close();
    }
}
