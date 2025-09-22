package CLASES.CLASE6.Practica;

public class Zapatos extends Indumentaria {

    // Si queres agregar atributos propios de Zapatos, podes hacerlo
    // private String tipo; // ejemplo: deportivo, formal

    public Zapatos(int id, double precio, int stock, String talle) {
        super(id, precio, stock, talle);
    }

    @Override
    public String mostrarDatos() {
        return "Zapatos -> " + super.mostrarDatos();
    }

    @Override
    public String toString() {
        return "Zapatos -> " + super.toString();
    }
}
