package CLASES.CLASE5.ArraysEstaticos;

import java.util.Scanner;

class Mascota {
    String nombre;
    String especie;
    int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Especie: " + especie + ", Edad: " + edad;
    }
}


class Veterinaria {
    private Mascota[] mascotas = new Mascota[7];
    private int contador = 0;

    // 1. Registrar nueva mascota
    public void registrarMascota(Mascota m) {
        if (contador < mascotas.length) {
            mascotas[contador] = m;
            contador++;
            System.out.println("Mascota registrada correctamente.");
        } else {
            System.out.println("No se pueden registrar mas de 7 mascotas.");
        }
    }

    // 2. Mostrar todas las mascotas
    public void mostrarMascotas() {
        if (contador == 0) {
            System.out.println("No hay mascotas registradas.");
            return;
        }
        for (int i = 0; i < contador; i++) {
            System.out.println(mascotas[i]);
        }
    }

    // 3. Buscar y modificar edad por nombre
    public void modificarEdad(String nombre, int nuevaEdad) {
        for (int i = 0; i < contador; i++) {
            if (mascotas[i].nombre.equalsIgnoreCase(nombre)) {
                mascotas[i].edad = nuevaEdad;
                System.out.println("Edad de la mascota modificada correctamente.");
                return;
            }
        }
        System.out.println("No se encontro mascota con nombre '" + nombre + "'.");
    }

    // 4. Eliminar mascota por nombre
    public void eliminarMascota(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (mascotas[i].nombre.equalsIgnoreCase(nombre)) {
                mascotas[i] = mascotas[contador - 1]; // remplazar con la ultima
                mascotas[contador - 1] = null;
                contador--;
                System.out.println("Mascota eliminada correctamente.");
                return;
            }
        }
        System.out.println("No se encontro mascota con nombre '" + nombre + "'.");
    }

    // 5. Contar mascotas registradas
    public int contarMascotas() {
        return contador;
    }
}


public class RegistroMascotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veterinaria veterinaria = new Veterinaria();
        int opcion;

        do {
            System.out.println("\n--- MENU VETERINARIA ---");
            System.out.println("1. Registrar mascota");
            System.out.println("2. Mostrar mascotas");
            System.out.println("3. Modificar edad de una mascota");
            System.out.println("4. Eliminar mascota");
            System.out.println("5. Contar mascotas registradas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese especie: ");
                    String especie = sc.nextLine();
                    System.out.print("Ingrese edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    Mascota m = new Mascota(nombre, especie, edad);
                    veterinaria.registrarMascota(m);
                }
                case 2 -> veterinaria.mostrarMascotas();
                case 3 -> {
                    System.out.print("Ingrese nombre de la mascota: ");
                    String nombreBuscar = sc.nextLine();
                    System.out.print("Ingrese nueva edad: ");
                    int nuevaEdad = sc.nextInt();
                    sc.nextLine();
                    veterinaria.modificarEdad(nombreBuscar, nuevaEdad);
                }
                case 4 -> {
                    System.out.print("Ingrese nombre de la mascota a eliminar: ");
                    String nombreEliminar = sc.nextLine();
                    veterinaria.eliminarMascota(nombreEliminar);
                }
                case 5 -> {
                    int total = veterinaria.contarMascotas();
                    System.out.println("Total de mascotas registradas: " + total);
                }
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
