package Ayudantia2;

public class Proyectos {
	
	private int id;
	private String nombre;
	private double presupuestoProyecto;
	private int liderProyecto;
	private int empleadosProyectos;
	// ID,Nombre,Presupuesto,Lider_ID,Equipo_ID
	public Proyectos(int id, String nombre, double presupuestoProyecto, int liderProyecto, int empleadosProyectos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.presupuestoProyecto = presupuestoProyecto;
		this.liderProyecto = liderProyecto;
		this.empleadosProyectos = empleadosProyectos;
	}
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public double getPresupuestoProyecto() {
		return presupuestoProyecto;
	}
	public int getLiderProyecto() {
		return liderProyecto;
	}
	public int getEmpleadosProyectos() {
		return empleadosProyectos;
	}
	
	
	
	
	
	
	
	

}
