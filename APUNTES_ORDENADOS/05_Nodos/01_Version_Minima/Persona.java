package Apuntes.MinimoNodos;

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

    @Override
    public String toString() {
        return nombre + " - " + rut;
    }

	public int compareTo(Persona pj) {
		int salida = this.nombre.compareTo(pj.getNombre());

		if (salida == 0) {
			salida = this.rut.compareTo(pj.getRut());
		}

		return salida;
	}
}
