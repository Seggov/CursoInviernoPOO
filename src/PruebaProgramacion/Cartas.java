package PruebaProgramacion;

public class Cartas {
	
	private String code;
	private String name;
	private String anio;
	private int valor;
	private String juego;
	private String rareza;
	
	
	public Cartas(String code, String name, String anio, int valor, String juego, String rareza) {
		super();
		this.code = code;
		this.name = name;
		this.anio = anio;
		this.valor = valor;
		this.juego = juego;
		this.rareza = rareza;
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


	public String getJuego() {
		return juego;
	}


	public String getRareza() {
		return rareza;
	}
	
	
	
	
}
