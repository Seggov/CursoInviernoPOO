package PruebaProgramacion;

public class Comic {
	
	private String code;
	private String name;
	private String anio;
	private int valor;
	private String editorial;
	private String nombreEdicion;
	
	
	public Comic(String code, String name, String anio, int valor, String editorial, String nombreEdicion) {
		super();
		this.code = code;
		this.name = name;
		this.anio = anio;
		this.valor = valor;
		this.editorial = editorial;
		this.nombreEdicion = nombreEdicion;
	}


	public String getCode() {
		return code;
	}


	public String getName() {
		return name;
	}


	public String getAnio() {
		return anio;
	}


	public int getValor() {
		return valor;
	}


	public String getEditorial() {
		return editorial;
	}


	public String getNombreEdicion() {
		return nombreEdicion;
	}
	
	
	
	
	
}
