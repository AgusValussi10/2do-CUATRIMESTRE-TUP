package CLASES.CLASE6.Practica;

public abstract class Indumentaria extends Producto {
    protected String talle;

    public Indumentaria(int id, double precio, int stock, String talle) {
        super(id, precio, stock);
        this.talle = talle;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    @Override
    public String mostrarDatos() {
        // Reutiliza lo de Producto y agrega talle
        return super.mostrarDatos() + ", talle=" + talle;
    }

    @Override
    public String toString() {
        return "Indumentaria -> " + super.toString() + ", talle='" + talle + "'}";
    }
}
