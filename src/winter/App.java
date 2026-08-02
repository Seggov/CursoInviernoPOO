package winter;

public class App {

	public static void main(String[] args) {
		App programa = new App();
		programa.iniciar();

	}

	private void iniciar() {

	    Persona a = new Persona("A", "111");
	    Persona b = new Persona("B", "222");
	    Persona c = new Persona("C", "333");

	    ListaDobleNexo lista = new ListaDobleNexo();

	    lista.insertarFinal(a);
	    lista.insertarFinal(b);
	    lista.insertarFinal(c);

	    System.out.println(lista.mostrar());
	}

}
