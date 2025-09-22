package CLASES.CLASE6.Practica;

class Cliente extends Personas {

    public Cliente(String nombre, String dni, String telefono, String email) {
        super(nombre, dni, telefono, email);
    }

    @Override
    public String toString() {
        return "Cliente -> " + super.toString();
    }
}
