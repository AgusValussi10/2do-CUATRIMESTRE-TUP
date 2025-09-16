/*
 * Pide al usuario que ingrese base y altura de un rectángulo (números enteros). El programa debe
 * calcular y mostrar el área con: Área = base * altura
 */
package CLASES.CLASE5.EntradaYSalidaDatos;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese la base del rectangulo: ");
        int base = sc.nextInt();

        System.out.print("Ingrese la altura del rectangulo: ");
        int altura = sc.nextInt();

        // Calcular área
        int area = base * altura;

        // Mostrar resultado
        System.out.println("El area del rectangulo es: " + area);

        sc.close();
    }
}
