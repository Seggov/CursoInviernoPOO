package Apuntes.Herencia;

import java.util.LinkedList;

public class Mascota {
	protected final String VETERINARIA = "Los UCNIN";
	
	private String nombre;
	private String especie;
	private LinkedList<Atencion> Atencion = new LinkedList<>();
	
	
	public Mascota(String nombre, String especie, LinkedList<Apuntes.Herencia.Atencion> atencion, Perro perro) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		Atencion = atencion;
		this.guau = perro;
	}
	Perro guau = new Perro(VETERINARIA, VETERINARIA, Atencion, guau);
	public void MascotasVeterinaria() {
		
		guau.hablando();
		
	}

}
