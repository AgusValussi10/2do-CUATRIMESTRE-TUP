/*
 * Escribe un programa que pida al usuario: 1. Su nombre 2. Su edad 3. Su ciudad de residencia 4. El
 * programa debe mostrar un mensaje como: Hola Juan, tienes 20 años y vives en Resistencia.
 */
package CLASES.CLASE5.EntradaYSalidaDatos;

import java.util.Scanner;

public class DatosPersonales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese su ciudad de residencia: ");
        String ciudad = sc.nextLine();

        // Mostrar mensaje final
        System.out.println(
                "Hola " + nombre + ", tienes " + edad + " años y vives en " + ciudad + ".");

        sc.close();
    }
}
