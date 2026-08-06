package apuntes.nodos;

public class Persona {

    private String rut;
    private String nombre;

    public Persona(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public int compareTo(Persona otra) {
        String otroNombre = otra.getNombre();
        int salida = this.nombre.compareTo(otroNombre);

        if (salida == 0) {
            String otroRut = otra.getRut();
            salida = this.rut.compareTo(otroRut);
        }

        return salida;
    }

    @Override
    public String toString() {
        return rut + " | " + nombre;
    }
}
