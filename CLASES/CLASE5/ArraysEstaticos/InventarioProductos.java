package CLASES.CLASE5.ArraysEstaticos;

import java.util.Scanner;

class Producto {
    String codigo;
    String nombre;
    double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + ", Nombre: " + nombre + ", Precio: $" + precio;
    }
}


class Inventario {
    private Producto[] productos = new Producto[10];
    private int contador = 0;

    // 1. Agregar producto
    public void agregarProducto(Producto p) {
        if (contador < productos.length) {
            productos[contador] = p;
            contador++;
            System.out.println("Producto agregado correctamente.");
        } else {
            System.out.println("Inventario lleno (maximo 10 productos).");
        }
    }

    // 2. Buscar por codigo
    public Producto buscarPorCodigo(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (productos[i].codigo.equalsIgnoreCase(codigo)) {
                return productos[i];
            }
        }
        return null;
    }

    // 3. Modificar precio por codigo
    public void modificarPrecio(String codigo, double nuevoPrecio) {
        Producto encontrado = buscarPorCodigo(codigo);
        if (encontrado != null) {
            encontrado.precio = nuevoPrecio;
            System.out.println("Precio modificado correctamente.");
        } else {
            System.out.println("Producto con codigo '" + codigo + "' no encontrado.");
        }
    }

    // 4. Eliminar producto por nombre
    public void eliminarPorNombre(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (productos[i].nombre.equalsIgnoreCase(nombre)) {
                productos[i] = productos[contador - 1]; // reemplazar con el ultimo
                productos[contador - 1] = null;
                contador--;
                System.out.println("Producto eliminado correctamente.");
                return;
            }
        }
        System.out.println("Producto con nombre '" + nombre + "' no encontrado.");
    }

    // 5. Mostrar productos
    public void mostrarProductos() {
        if (contador == 0) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
    }
}


public class InventarioProductos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int opcion;

        do {
            System.out.println("\n--- MENU INVENTARIO ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto por codigo");
            System.out.println("3. Modificar precio de un producto");
            System.out.println("4. Eliminar producto por nombre");
            System.out.println("5. Mostrar productos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese codigo: ");
                    String codigo = sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();
                    Producto p = new Producto(codigo, nombre, precio);
                    inventario.agregarProducto(p);
                }
                case 2 -> {
                    System.out.print("Ingrese codigo del producto: ");
                    String codigoBuscar = sc.nextLine();
                    Producto encontrado = inventario.buscarPorCodigo(codigoBuscar);
                    if (encontrado != null) {
                        System.out.println("Producto encontrado: " + encontrado);
                    } else {
                        System.out.println("No se encontro producto con ese codigo.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese codigo del producto: ");
                    String codigoMod = sc.nextLine();
                    System.out.print("Ingrese nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();
                    sc.nextLine();
                    inventario.modificarPrecio(codigoMod, nuevoPrecio);
                }
                case 4 -> {
                    System.out.print("Ingrese nombre del producto a eliminar: ");
                    String nombreEliminar = sc.nextLine();
                    inventario.eliminarPorNombre(nombreEliminar);
                }
                case 5 -> inventario.mostrarProductos();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
