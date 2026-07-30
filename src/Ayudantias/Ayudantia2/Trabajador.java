package Ayudantias.Ayudantia2;

public class Trabajador {
		
	private int ID;
	private String nombre;
	private String puesto;
	private double sueldo;
	private boolean esJefe;
	private boolean esLider;
	
	
	
	public Trabajador(int iD, String nombre, String puesto, double sueldo, boolean esJefe, boolean esLider) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.puesto = puesto;
		this.sueldo = sueldo;
		this.esJefe = esJefe;
		this.esLider = esLider;
	}



	public int getID() {
		return ID;
	}



	public String getNombre() {
		return nombre;
	}



	public String getPuesto() {
		return puesto;
	}



	public double getSueldo() {
		return sueldo;
	}



	public boolean isEsJefe() {
		return esJefe;
	}



	public boolean isEsLider() {
		return esLider;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}



	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}



	public void setEsJefe(boolean esJefe) {
		this.esJefe = esJefe;
	}



	public void setEsLider(boolean esLider) {
		this.esLider = esLider;
	}
	
	// ID,Nombre,Rol,Sueldo,esJefe,esLider

	
	
	
}
