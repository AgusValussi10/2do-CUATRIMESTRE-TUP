package CLASES.CLASE5;

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

