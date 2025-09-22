package CLASES.CLASE6.Practica;

public abstract class Producto implements Sucursal {
    protected int id;
    protected double precio;
    protected int stock;

    public Producto(int id, double precio, int stock) {
        this.id = id;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String mostrarDatos() {
        return "Producto id=" + id + ", precio=" + precio + ", stock=" + stock;
    }

    @Override
    public String toString() {
        return "Producto{id=" + id + ", precio=" + precio + ", stock=" + stock + "}";
    }
}
