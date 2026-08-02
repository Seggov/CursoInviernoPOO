package PracticandAndo;

public class Persona {

	private String nombre;
	private String rut;
	private int edad;
	public Persona(String nombre, String rut, int edad) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", rut=" + rut + ", edad=" + edad + "]";
	}
	
	
	
	

}
