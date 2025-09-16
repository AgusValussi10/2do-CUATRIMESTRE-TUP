/*
 * Pide al usuario su nombre y apellido, y luego concaténalos en un solo String que muestre el
 * nombre completo.
 */
package CLASES.CLASE5.Cadenas;

import java.util.Scanner;

public class Concatenacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();

        // Concatenar en un solo String
        String nombreCompleto = nombre + " " + apellido;

        // Mostrar resultado
        System.out.println("Su nombre completo es: " + nombreCompleto);

        sc.close();
    }
}
