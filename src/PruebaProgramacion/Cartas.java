package PruebaProgramacion;

public class Cartas {
	
	private String code;
	private String name;
	private String anio;
	private int valor;
	private String rareza;
	private String editorial;
	private int numberEdition;
	public Cartas(String code, String name, String anio, int valor, String rareza, String editorial,
			int numberEdition) {
		super();
		this.code = code;
		this.name = name;
		this.anio = anio;
		this.valor = valor;
		this.rareza = rareza;
		this.editorial = editorial;
		this.numberEdition = numberEdition;
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
	public String getRareza() {
		return rareza;
	}
	public String getEditorial() {
		return editorial;
	}
	public int getNumberEdition() {
		return numberEdition;
	}
	
	private boolean puedeEntrar() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
}
