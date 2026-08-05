package Apuntes.Herencia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	
	private List<Atencion> atenciones = new ArrayList<Atencion>();
	private static List<Mascota> mascotas = new ArrayList<Mascota>();
	
    public static void main(String[] args) {
    	Perro perro = new Perro("Firulais", "Perro");
        Gato gato = new Gato("Garfield", "Gato", true);

        perro.hablando();
        gato.hablando();
        
        mascotas.add(perro);
        mascotas.add(gato);
        
        for (int i = 0; i < mascotas.size(); i++) {
			Mascota x = mascotas.get(i);
			int monto = x.calcularMonto();
			System.out.println(x.getNombre()+monto); 

		}
        
        
    }
}