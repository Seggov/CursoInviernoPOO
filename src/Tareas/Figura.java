package Tareas;

public abstract class Figura implements Exportable{
	
	private List<Punto> punto;
	private String nombre;
	
	public Figura(List<Puntos> puntos, String nombre) {
		
	}
	
	
	
	abstract void quedoEnFigura(Puntos x, Puntos y);
}
