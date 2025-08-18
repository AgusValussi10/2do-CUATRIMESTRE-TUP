
// La Biblioteca
// 1) Estructura de las clases (1 p.)
// El programa debe contener las siguiente estructura de clases:

// Clase Libro:
// Atributos: nombre (texto), autor (texto), isbn (número)
// Métodos:
// Constructor para inicializar los atributos.
// Método toString para mostrar los detalles del libro en formato de texto.

// Clase Biblioteca:
// Atributos: ArrayList<Libro> libros.
// Métodos:
// Un menú de opciones que permita al usuario interactuar con la biblioteca realizando diferentes
// operaciones.
// Implementar los métodos necesarios para las funcionalidades del menú.

import java.util.ArrayList;
import java.util.Scanner;

public class LaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.mostrarMenu();
    }
}


// Clase Libro
class Libro {
    private String nombre;
    private String autor;
    private int isbn;

    // Constructor para inicializar los atributos
    public Libro(String nombre, String autor, int isbn) {
        this.nombre = nombre;
        this.autor = autor;
        this.isbn = isbn;
    }

    // Getter para ISBN
    public int getIsbn() {
        return isbn;
    }

    // Método toString para mostrar los detalles del libro en formato de texto
    @Override
    public String toString() {
        return "Libro{" + "nombre='" + nombre + '\'' + ", autor='" + autor + '\'' + ", isbn=" + isbn
                + '}';
    }
}


// Clase Biblioteca
class Biblioteca {
    private ArrayList<Libro> libros;

    // Constructor para inicializar el ArrayList
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Menú de opciones para interactuar con la biblioteca
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de la Biblioteca ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Buscar libro por ISBN");
            System.out.println("4. Eliminar libro por ISBN");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> agregarLibro(scanner);
                case 2 -> mostrarLibros();
                case 3 -> buscarLibroPorISBN(scanner);
                case 4 -> eliminarLibroPorISBN(scanner);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    // Método para agregar un libro
    private void agregarLibro(Scanner scanner) {
        System.out.print("Ingrese el nombre del libro: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el ISBN del libro: ");
        int isbn = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Libro nuevoLibro = new Libro(nombre, autor, isbn);
        libros.add(nuevoLibro);
        System.out.println("Libro agregado exitosamente.");
    }

    // Método para mostrar todos los libros
    private void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }

    // Método para buscar un libro por ISBN
    private void buscarLibroPorISBN(Scanner scanner) {
        System.out.print("Ingrese el ISBN del libro a buscar: ");
        int isbn = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        boolean encontrado = false;

        for (Libro libro : libros) {
            if (libro.getIsbn() == isbn) {
                System.out.println("Libro encontrado: " + libro);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un libro con ese ISBN.");
        }
    }

    // Método para eliminar un libro por ISBN
    private void eliminarLibroPorISBN(Scanner scanner) {
        System.out.print("Ingrese el ISBN del libro a eliminar: ");
        int isbn = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        boolean eliminado = false;

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn() == isbn) {
                libros.remove(i);
                System.out.println("Libro eliminado exitosamente.");
                eliminado = true;
                break;
            }
        }

        if (!eliminado) {
            System.out.println("No se encontró un libro con ese ISBN.");
        }
    }
}
