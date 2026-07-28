package Ayudantia2;

public class Proyectos {
	
	private String id;
	private String nombre;
	private double presupuestoProyecto;
	private int liderProyecto;
	private int empleadosProyectos;
	// ID,Nombre,Presupuesto,Lider_ID,Equipo_ID
	public Proyectos(String id, String nombre, double presupuestoProyecto, int liderProyecto, String primerEmpleado,
			int empleadosProyectos, String ultimoEmpleado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.presupuestoProyecto = presupuestoProyecto;
		this.liderProyecto = liderProyecto;
		this.empleadosProyectos = empleadosProyectos;
	}
	public String getId() {
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
