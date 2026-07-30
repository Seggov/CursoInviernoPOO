package Nodos;

public class Persona implements Comparable<Persona> {

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

    @Override
    public int compareTo(Persona otra) {

        int resultado = this.nombre.compareToIgnoreCase(
                otra.getNombre()
        );

        // Si tienen el mismo nombre, se comparan por RUT
        if (resultado == 0) {
            resultado = this.rut.compareToIgnoreCase(
                    otra.getRut()
            );
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | RUT: " + rut;
    }
}
