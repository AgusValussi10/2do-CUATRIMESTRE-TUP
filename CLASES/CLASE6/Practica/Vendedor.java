package CLASES.CLASE6.Practica;

public class Vendedor extends Personas implements Sucursal {

    private String legajo;
    private String nombreSucursal;

    public Vendedor(String nombre, String dni, String telefono, String email, String legajo,
            String nombreSucursal) {
        super(nombre, dni, telefono, email);
        this.legajo = legajo;
        this.nombreSucursal = nombreSucursal;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    @Override
    public String mostrarDatos() {
        return "Sucursal: " + nombreSucursal + " | Vendedor: " + getNombre() + " (legajo " + legajo
                + ")";
    }

    @Override
    public String toString() {
        return "Vendedor -> " + super.toString() + ", legajo='" + legajo + "', sucursal='"
                + nombreSucursal + "'}";
    }
}
