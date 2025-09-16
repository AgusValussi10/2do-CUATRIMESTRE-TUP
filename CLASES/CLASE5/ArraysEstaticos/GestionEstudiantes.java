/*
 * Crea una clase Estudiante con atributos: nombre, edad y promedio. Implementa en la clase
 * ColeccionDeEstudiantes un arreglo de máximo 5 estudiantes, con métodos para: 1. Agregar un
 * estudiante, 2. Listar todos los estudiantes, 3. Modificar los datos de un estudiante dado su
 * nombre, 4. Eliminar un estudiante de la colección.
 */
package CLASES.CLASE5.ArraysEstaticos;

import java.util.Scanner;

class Estudiante {
    String nombre;
    int edad;
    double promedio;

    // Constructor
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Mostrar datos del estudiante
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Promedio: " + promedio;
    }
}


class ColeccionDeEstudiantes {
    private Estudiante[] estudiantes = new Estudiante[5];
    private int contador = 0;

    // 1. Agregar estudiante
    public void agregarEstudiante(Estudiante e) {
        if (contador < estudiantes.length) {
            estudiantes[contador] = e;
            contador++;
            System.out.println("Estudiante agregado correctamente.");
        } else {
            System.out.println("La coleccion esta llena (maximo 5 estudiantes).");
        }
    }

    // 2. Listar estudiantes
    public void listarEstudiantes() {
        if (contador == 0) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        for (int i = 0; i < contador; i++) {
            System.out.println(estudiantes[i]);
        }
    }

    // 3. Modificar estudiante por nombre
    public void modificarEstudiante(String nombre, String nuevoNombre, int nuevaEdad,
            double nuevoPromedio) {
        for (int i = 0; i < contador; i++) {
            if (estudiantes[i].nombre.equalsIgnoreCase(nombre)) {
                estudiantes[i].nombre = nuevoNombre;
                estudiantes[i].edad = nuevaEdad;
                estudiantes[i].promedio = nuevoPromedio;
                System.out.println("Estudiante modificado correctamente.");
                return;
            }
        }
        System.out.println("Estudiante con nombre '" + nombre + "' no encontrado.");
    }

    // 4. Eliminar estudiante
    public void eliminarEstudiante(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (estudiantes[i].nombre.equalsIgnoreCase(nombre)) {
                // Mover el último estudiante a la posición eliminada
                estudiantes[i] = estudiantes[contador - 1];
                estudiantes[contador - 1] = null;
                contador--;
                System.out.println("Estudiante eliminado correctamente.");
                return;
            }
        }
        System.out.println("Estudiante con nombre '" + nombre + "' no encontrado.");
    }
}


public class GestionEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColeccionDeEstudiantes coleccion = new ColeccionDeEstudiantes();
        int opcion;

        do {
            System.out.println("\n--- GESTION DE ESTUDIANTES ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Modificar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese edad: ");
                    int edad = sc.nextInt();
                    System.out.print("Ingrese promedio: ");
                    double promedio = sc.nextDouble();
                    sc.nextLine();
                    Estudiante e = new Estudiante(nombre, edad, promedio);
                    coleccion.agregarEstudiante(e);
                }
                case 2 -> {
                    coleccion.listarEstudiantes();
                }
                case 3 -> {
                    System.out.print("Ingrese nombre del estudiante a modificar: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nueva edad: ");
                    int nuevaEdad = sc.nextInt();
                    System.out.print("Nuevo promedio: ");
                    double nuevoPromedio = sc.nextDouble();
                    sc.nextLine();
                    coleccion.modificarEstudiante(nombre, nuevoNombre, nuevaEdad, nuevoPromedio);
                }
                case 4 -> {
                    System.out.print("Ingrese nombre del estudiante a eliminar: ");
                    String nombreEliminar = sc.nextLine();
                    coleccion.eliminarEstudiante(nombreEliminar);
                }
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion invalida, intente de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}

