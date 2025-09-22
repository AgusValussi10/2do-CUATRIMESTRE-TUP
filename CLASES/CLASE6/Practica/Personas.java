package CLASES.CLASE6.Practica;

public abstract class Personas {
    protected String nombre;
    protected String dni;
    protected String telefono;
    protected String email;

    public Personas() {}

    public Personas(String nombre, String dni, String telefono, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

    // getters y setters PUBLICOS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', dni='" + dni + "', telefono='" + telefono
                + "', email='" + email + "'}";
    }
}
