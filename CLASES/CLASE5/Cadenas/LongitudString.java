/*
 * Solicita al usuario que ingrese una palabra y muestra cuántos caracteres tiene utilizando
 * .length().
 */
package CLASES.CLASE5.Cadenas;

import java.util.Scanner;

public class LongitudString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir palabra al usuario
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        // Obtener longitud con .length()
        int longitud = palabra.length();

        // Mostrar resultado
        System.out.println("La palabra \"" + palabra + "\" tiene " + longitud + " caracteres.");

        sc.close();
    }
}
