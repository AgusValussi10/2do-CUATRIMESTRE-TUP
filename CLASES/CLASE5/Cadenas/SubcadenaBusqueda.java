/*
 * Pide al usuario una frase y una palabra. El programa debe verificar si la palabra está contenida
 * en la frase (contains) y mostrar la posición donde aparece (indexOf).
 */
package CLASES.CLASE5.Cadenas;

import java.util.Scanner;

public class SubcadenaBusqueda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir frase al usuario
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        // Pedir palabra al usuario
        System.out.print("Ingrese una palabra a buscar: ");
        String palabra = sc.nextLine();

        // Verificar si la palabra está contenida en la frase
        if (frase.contains(palabra)) {
            int posicion = frase.indexOf(palabra);
            System.out.println("La palabra \"" + palabra + "\" SI se encuentra en la frase.");
            System.out.println("Aparece en la posicion: " + posicion);
        } else {
            System.out.println("La palabra \"" + palabra + "\" NO se encuentra en la frase.");
        }

        sc.close();
    }
}
