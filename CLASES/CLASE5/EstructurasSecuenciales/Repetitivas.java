/*
 * Haz un programa en Java que muestre un menú de opciones al usuario: 1. Contar del 1 al 10 con
 * for. 2. Contar del 10 al 1 con while. 3. Pedir números hasta que el usuario ingrese 0 usando
 * do-while. 4. Recorrer un arreglo de enteros con for-each y mostrar sus elementos.
 */

package CLASES.CLASE5.EstructurasSecuenciales;

import java.util.Scanner;

public class Repetitivas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar menú
            System.out.println("\n--- MENU DE OPCIONES ---");
            System.out.println("1. Contar del 1 al 10 con for");
            System.out.println("2. Contar del 10 al 1 con while");
            System.out.println("3. Pedir numeros hasta que el usuario ingrese 0 (do-while)");
            System.out.println("4. Recorrer un arreglo de enteros con for-each");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Contando del 1 al 10 con for:");
                    for (int i = 1; i <= 10; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Contando del 10 al 1 con while:");
                    int j = 10;
                    while (j >= 1) {
                        System.out.print(j + " ");
                        j--;
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Ingrese numeros (0 para salir):");
                    int num;
                    do {
                        num = sc.nextInt();
                        if (num != 0) {
                            System.out.println("Ingresaste: " + num);
                        }
                    } while (num != 0);
                    System.out.println("Fin del ingreso.");
                    break;

                case 4:
                    System.out.println("Recorriendo arreglo con for-each:");
                    int[] numeros = {10, 20, 30, 40, 50};
                    for (int n : numeros) {
                        System.out.println("Elemento: " + n);
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
