package Apuntes.Nodos;

public class ListaDobleNexo {
	
	private Nodo primero;
	
	public ListaDobleNexo() {}
	
	public boolean isEmpty() {
		return (this.primero == null);
	}

	public String mostrar() {
		String salida = "";
		
		Nodo actual = this.primero;
		
		while(actual != null) {
			Persona p = actual.getPersona();
			salida += p.toString() + "\n";
			actual = actual.getSig();
		}
		
		return salida;
	}
	
	public int size() {
		int n = 0;
		Nodo actual = this.primero;
		
		while (actual != null) {
			n++;
			actual = actual.getSig();
		}
		return n;
	}
	
	public Persona buscarRut(String rut) {
		
		Nodo actual = this.primero;
		while (actual != null) {
			Persona p = actual.getPersona();
			
			if (p.getRut().equals(rut)) {
				return p;
			}
			actual = actual.getSig();
		}
		return null;
	}
	
	public void insertarFinal(Persona p) {
		Nodo nuevo = new Nodo(p);
		if (isEmpty()) {
			primero = nuevo;
			return;
		}
	
		Nodo ultimo = getUltimo();
		
		ultimo.setSig(nuevo);
		nuevo.setSig(null);
		nuevo.setPrev(ultimo);
	}
	
	/**
	 * Mejorar!
	 */
	public void sort() {
		for (int i = 0; i < this.size()-1; i++) {
			
			Nodo ni = getNodoI(i);
			Persona pi = ni.getPersona();
			for (int j = i+1; j < this.size(); j++) {
				
				Nodo nj = getNodoI(j);
				Persona pj = nj.getPersona();
				
				if(pi.compareTo(pj) > 0) {
					ni.setPersona(pj);
					nj.setPersona(pi);
				}
			}
		}
	}
	
	//TAREA
	public void invertir() {
		Nodo actual = primero;
		Nodo ultimo = null;

		while (actual != null) {
			Nodo siguiente = actual.getSig();

			actual.setSig(actual.getPrev());
			actual.setPrev(siguiente);

			ultimo = actual;
			actual = siguiente;
		}

		primero = ultimo;
	}
	
	public Persona getI(int index) {
		int tamaño = size();
		if (index >= tamaño) {
			return null;
		}
		
		
		Nodo actual = primero;
		for (int j = 0; j < index; j++) {
			actual = actual.getSig();
		}
		return actual.getPersona();
	}
	
	private Nodo getNodoI(int index) {
		int tamaño = size();
		if (index >= tamaño) {
			return null;
		}
		
		Nodo actual = primero;
		for (int j = 0; j < index; j++) {
			actual = actual.getSig();
		}
		return actual;
	}
	
	public void insertarInicio(Persona p) {
		Nodo n = new Nodo(p);
		
		if (isEmpty()) {
			this.primero = n;
			return;
		}
		
		primero.setPrev(n);
		n.setPrev(null);
		n.setSig(primero);
		
		primero = n;
	}
	
	private Nodo getUltimo() {
		if (isEmpty()) {return null;}
		Nodo actual = primero;
		while (actual.getSig() != null) {
			actual = actual.getSig();
		}
		return actual;
	}
	
	
	public void vaciar() {
		this.primero = null;
	}

}
