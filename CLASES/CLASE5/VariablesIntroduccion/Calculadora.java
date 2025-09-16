/*
 * Crea un programa en Java que simule una calculadora básica con funciones. 1. Define un
 * procedimiento que muestre un menú con las operaciones: suma, resta, multiplicación y división. 2.
 * Define una función para cada operación matemática que reciba dos números y devuelva el resultado.
 * 3. Desde main, llama a las funciones según la opción ingresada por el usuario.
 */

package CLASES.CLASE5.VariablesIntroduccion;

import java.util.Scanner;

public class Calculadora {
    // Mostrar menú
    public static void mostrarMenu() {
        System.out.println("===== CALCULADORA BASICA =====");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        System.out.print("Elija una opcion: ");
    }

    // Funciones para cada operación
    // SUMA
    public static double sumar(double a, double b) {
        return a + b;
    }

    // RESTA
    public static double restar(double a, double b) {
        return a - b;
    }

    // MULTIPLICACION
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // DIVISION
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }

    // MAIN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        do {
            mostrarMenu(); // llamamos al procedimiento
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer numero: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                num2 = sc.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado = sumar(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = restar(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        resultado = dividir(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opcion no valida.");
            }
            System.out.println();

        } while (opcion != 5);

        System.out.println("Saliendo de la calculadora...");
        sc.close();
    }
}

