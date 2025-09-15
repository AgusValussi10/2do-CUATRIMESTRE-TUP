package CLASES.CLASE5;

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
