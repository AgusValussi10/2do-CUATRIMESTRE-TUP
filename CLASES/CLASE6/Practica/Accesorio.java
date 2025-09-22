package CLASES.CLASE6.Practica;

public class Accesorio extends Producto {

    // Ejemplo de atributo propio
    private String tipo; // ejemplo: gorra, bolso, pulsera

    public Accesorio(int id, double precio, int stock, String tipo) {
        super(id, precio, stock);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String mostrarDatos() {
        return "Accesorio -> " + super.mostrarDatos() + ", tipo=" + tipo;
    }

    @Override
    public String toString() {
        return "Accesorio -> " + super.toString() + ", tipo='" + tipo + "'}";
    }
}
