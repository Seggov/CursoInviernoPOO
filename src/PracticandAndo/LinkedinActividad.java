package PracticandAndo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedinActividad {
	
	public static void main(String[] args) {
		LinkedinActividad programa = new LinkedinActividad();
		programa.iniciar();
		
	}

	private LinkedList<Persona> listaDinamica = new LinkedList<Persona>();
	private void iniciar() {
		
		
	    Persona p1 = new Persona("Pedro", "111", 10);
	    Persona p2 = new Persona("Ana", "222",42);
	    Persona p3 = new Persona("Juan", "333",501);
		
	    
	    listaDinamica.add(p1);listaDinamica.add(p2);listaDinamica.add(p3);
	    
	    comprobarMayorEdad();
	    
	}
	
	private void comprobarMayorEdad() {

	    for (int i = 0; i < listaDinamica.size(); i++) {

	        Persona p = listaDinamica.get(i); // iterara 3 vees
	        	
	        if (p.getEdad() >= 18) {
	            System.out.println(p.getNombre() + " es mayor de edad");
	        } else {
	            System.out.println(p.getNombre() + " es menor de edad");
	        }
	    }
	}

}
