/*
 * Crea un programa que solicite al usuario su nombre y luego lo muestre con un mensaje:Hola,
 * [nombre], ¡bienvenido a Java!
 */
package CLASES.CLASE5.Cadenas;

import java.util.Scanner;

public class CreacionString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir nombre al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        // Mostrar mensaje
        System.out.println("Hola, " + nombre + ", ¡Bienvenido a Java!");

        sc.close();
    }
}
