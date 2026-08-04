package Apuntes.Herencia;

import java.util.LinkedList;

public class Perro extends Mascota{

	public Perro(String nombre, String especie, LinkedList<Apuntes.Herencia.Atencion> atencion, Perro perro) {
		super(nombre, especie, atencion, perro);
		// TODO Auto-generated constructor stub
	}

	public void hablando() {
		System.out.println("Ladrando en "+ VETERINARIA);
	}
	
	
}
