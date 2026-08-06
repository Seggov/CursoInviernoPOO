package Apuntes.Nodos;

public class Persona {
	private String nombre;
	private String rut;
	
	public Persona(String nombre, String rut) {
		this.nombre = nombre;
		this.rut = rut;
	}

	public String getNombre() {return nombre;}
	
	public String getRut() {return rut;}
	
	public int compareTo(Persona otra) {
		String otroNombre = otra.getNombre();
		int salida = this.nombre.compareTo(otroNombre); 
		if (salida == 0) {
			String otroRut = otra.getRut();
			salida = this.rut.compareTo(otroRut);
		} 
		return salida;
	}
	
	public String toString() {
		return rut + " | " + nombre;
	}
	
}
