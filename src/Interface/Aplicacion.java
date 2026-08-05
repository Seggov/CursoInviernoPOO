package Interface;

public class Aplicacion {

	public static void main(String[] args) {
		Aplicacion programa = new Aplicacion();
		programa.inicar();
	}

	private void inicar() {
		Persona nf = new Persona();
		nf.print();
		
	}

}
