/*
 * Crea un programa que imprima un mensaje en varias líneas con tabulaciones y saltos de línea, por
 * ejemplo: Nombre: Juan Edad: 20 Ciudad: Resistencia
 */
package CLASES.CLASE5.Cadenas;

import java.util.Scanner;

public class CaracteresEscapeFormato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese su ciudad: ");
        String ciudad = sc.nextLine();

        // Mostrar con formato usando caracteres de escape
        System.out.println("\n--- Datos Personales ---");
        System.out
                .println("\nNombre:\t" + nombre + "\n\nEdad:\t" + edad + "\n\nCiudad:\t" + ciudad);

        sc.close();
    }
}
