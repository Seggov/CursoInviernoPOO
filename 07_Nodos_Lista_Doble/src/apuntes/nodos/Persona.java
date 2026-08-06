package apuntes.nodos;

public class Persona {
    private String nombre;
    private String rut;

    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public int compareTo(Persona otra) {
        int salida = this.nombre.compareTo(otra.getNombre());
        if (salida == 0) {
            salida = this.rut.compareTo(otra.getRut());
        }
        return salida;
    }

    @Override
    public String toString() {
        return rut + " | " + nombre;
    }
}
