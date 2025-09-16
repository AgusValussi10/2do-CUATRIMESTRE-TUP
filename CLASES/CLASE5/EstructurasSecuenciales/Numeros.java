/*
 * Escribe un programa en Java que pida al usuario ingresar dos números enteros y muestre: La suma
 * La resta La multiplicación La división
 */

package CLASES.CLASE5.EstructurasSecuenciales;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear objeto Scanner

        // Pedir datos al usuario
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        // Operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;

        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);

        sc.close(); // Cerrar el Scanner
    }
}

