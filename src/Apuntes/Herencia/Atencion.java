package Apuntes.Herencia;

import java.util.Date;

public class Atencion {
	
	
	private Mascota ms = new Mascota(null, null, null, null);
	private Date fecha;
	private int monto;
	private Mascota mascota;
	
	
	
	
	
	
	
	
	
	public Atencion(Mascota ms, Date fecha, int monto, Mascota mascota) {
		super();
		this.ms = ms;
		this.fecha = fecha;
		this.monto = monto;
		this.mascota = mascota;
	}









	public void iniciar() {
		
		System.out.println("hola mascotas");
		mascota.MascotasVeterinaria();
	}
	
	
}
