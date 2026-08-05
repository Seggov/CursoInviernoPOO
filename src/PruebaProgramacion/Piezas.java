package PruebaProgramacion;

public abstract class Piezas {
	
	private String nombre;
	private String codigo;
	private double valor;
	private int anio;
	public Piezas(String nombre, String codigo, double valor, int anio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.valor = valor;
		this.anio = anio;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public double getValor() {
		return valor;
	}
	public int getAnio() {
		return anio;
	}
	
	
}
