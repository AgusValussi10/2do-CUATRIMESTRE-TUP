package CLASES.CLASE6.Practica;

public class Ropa extends Indumentaria {

    // si queres agregar algo propio de Ropa, por ejemplo tipoTela, lo sumas aca
    // private String tipoTela;

    public Ropa(int id, double precio, int stock, String talle) {
        super(id, precio, stock, talle);
    }

    @Override
    public String mostrarDatos() {
        // podes personalizar el texto si queres
        return "Ropa -> " + super.mostrarDatos();
    }

    @Override
    public String toString() {
        return "Ropa -> " + super.toString();
    }
}
