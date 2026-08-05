package PracticandAndo;


public class ListaNodos {
	
	private Nodo primero;
	
	public ListaNodos() {}
	
	public boolean isEmpty() {
		return (this.primero == null);
	}

	public void agregarFinal(Persona p) { // p = persona
		Nodo nuevo = new Nodo(p);
		if (isEmpty()) {
			primero = nuevo;
			return; // esto es imortante poque si no, no se guarda
		}
		
		Nodo ultimo = getUltimo();
		ultimo.setSig(nuevo);
		nuevo.setPrev(ultimo);
	}

	public void mostrar() {
		// TODO Auto-generated method stub
		mostrarAdelante();
	}
		
	private Nodo getUltimo() {
		if (isEmpty()) {return null;}
		Nodo actual = primero;
		while (actual.getSig() != null) {
			actual = actual.getSig();
		}
		return actual;
	}

	public void mostrarAdelante() {
		// TODO Auto-generated method stub
		Nodo actual = primero;

		while (actual != null) {
			System.out.println(actual.getPersona());
			actual = actual.getSig();
		}
	}

	public void mostrarAtras() {
		// TODO Auto-generated method stub
		Nodo actual = getUltimo();

		while (actual != null) {
			System.out.println(actual.getPersona());
			actual = actual.getPrev();
		}
	}

}
