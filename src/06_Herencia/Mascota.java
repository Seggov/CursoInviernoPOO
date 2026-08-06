package Apuntes.Herencia;

import java.util.ArrayList;

public class Mascota {

    protected static final String VETERINARIA = "Los UCNIN";

    private String nombre;
    private String especie;
    private ArrayList<Atencion> listaAtencion = new ArrayList<>();
    
    public Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public void hablando() {
        System.out.println("La mascota hace un sonido");
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }
    
    
    public void agregarAtencion(Atencion at) {
    	this.listaAtencion.add(at);
    	
    	
    }

	public int calcularMonto() {
		int total = 0;

		for (int i = 0; i < listaAtencion.size(); i++) {
			total += listaAtencion.get(i).getMonto();
		}

		return total;
	}
}