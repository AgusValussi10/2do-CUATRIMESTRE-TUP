/*
 * Crea un programa en Java que manipule números y arreglos. Declara una función duplicarNumero(int
 * x) que intente duplicar el valor de un número. Declara otra función duplicarArreglo(int[] arr)
 * que duplique el valor de cada elemento del arreglo. Desde main, prueba ambas funciones: Llama a
 * duplicarNumero con un entero y muestra si cambió o no. Llama a duplicarArreglo con un arreglo y
 * muestra si los valores cambiaron.
 */
package CLASES.CLASE5.VariablesIntroduccion;

public class Arreglos {
    // Funcion que intenta duplicar un numero
    public static void duplicarNumero(int x) {
        x = x * 2;
        System.out.println("Dentro de duplicarNumero, x vale: " + x);
    }

    // Funcion que duplica cada elemento de un arreglo
    public static void duplicarArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    public static void main(String[] args) {
        // Caso 1: numero
        int numero = 5;
        System.out.println("Antes de duplicarNumero, numero = " + numero);
        duplicarNumero(numero);
        System.out.println("Despues de duplicarNumero, numero = " + numero);

        System.out.println("----------------------------------");

        // Caso 2: arreglo
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.print("Antes de duplicarArreglo: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();

        duplicarArreglo(numeros);

        System.out.print("Despues de duplicarArreglo: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
