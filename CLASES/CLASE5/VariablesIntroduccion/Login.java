/*
 * Escribe un programa en Java que maneje un contador global de intentos fallidos de inicio de
 * sesión. 1. Define una variable global (atributo de una clase) llamada intentos. 2. En el método
 * validarUsuario, usa variables locales para almacenar el usuario y contraseña ingresados. 3. Cada
 * vez que la validación falle, incrementa el contador global intentos. 4. Cuando se superen 3
 * intentos fallidos, el programa debe mostrar un mensaje de “Usuario bloqueado”.
 */

package CLASES.CLASE5.VariablesIntroduccion;

import java.util.Scanner;

public class Login {
    // Variable global (atributo de la clase)
    static int intentos = 0;
    static Scanner sc = new Scanner(System.in); // scanner global

    // Método para validar usuario y contraseña
    public static boolean validarUsuario() {

        // Variables locales
        System.out.print("Ingrese usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Ingrese contrasena: ");
        String contrasena = sc.nextLine();

        // Usuario válido: admin
        // Contraseña válida: 1234

        if (usuario.equals("admin") && contrasena.equals("1234")) {
            System.out.println("Inicio de sesion exitoso!");
            return true;
        } else {
            intentos++; // incremento contador global
            System.out.println("Credenciales incorrectas. Intentos fallidos: " + intentos);
            return false;
        }
    }

    public static void main(String[] args) {
        boolean acceso = false;

        while (intentos < 3 && !acceso) {
            acceso = validarUsuario();
        }

        if (!acceso) {
            System.out.println("Usuario bloqueado");
        }

        sc.close(); // cerrar el scanner
    }
}
