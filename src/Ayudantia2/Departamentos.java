package Ayudantia2;

public class Departamentos {
	
	private int id;
	private String nombre;
	private int jefeDepartamento;
	private int empleadoDepartamento;
	public Departamentos(int id, String nombre, int jefeDepartamento, int empleadoDepartamento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.jefeDepartamento = jefeDepartamento;
		this.empleadoDepartamento = empleadoDepartamento;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}


















	public String getNombre() {
		return nombre;
	}


















	public int getJefeDepartamento() {
		return jefeDepartamento;
	}


















	public int getEmpleadoDepartamento() {
		return empleadoDepartamento;
	}


















	@Override
	public String toString() {
		return "Departamentos [id=" + id + ", nombre=" + nombre + ", jefeDepartamento=" + jefeDepartamento
				+ ", empleadoDepartamento=" + empleadoDepartamento + "]";
	}
	
	


	
	
	
	
	
	
	
	
	
	
}
