package CLASES.CLASE6;

import CLASES.CLASE6.Practica.Accesorio;
import CLASES.CLASE6.Practica.Ropa;
import CLASES.CLASE6.Practica.Vendedor;
import CLASES.CLASE6.Practica.Zapatos;

public class MainPrueba {
    public static void main(String[] args) {
        // Cliente
        Cliente c = new Cliente("Ana Perez", "40111222", "3624000000", "ana@mail.com");
        System.out.println(c);

        // Vendedor
        Vendedor v = new Vendedor("Carlos Lopez", "40222333", "3624111111", "carlos@mail.com",
                "V-102", "Sucursal Centro");
        System.out.println(v.mostrarDatos());
        System.out.println(v);

        // Productos
        Ropa r = new Ropa(101, 15999.99, 5, "M");
        Zapatos z = new Zapatos(202, 25999.99, 3, "42");
        Accesorio a = new Accesorio(303, 4999.99, 10, "Gorra");

        System.out.println(r.mostrarDatos());
        System.out.println(z.mostrarDatos());
        System.out.println(a.mostrarDatos());
    }
}
