package winter;

public class Nodo {
	private Persona persona;
	private Nodo sig;
	private Nodo prev;
	
	public Nodo(Persona persona) {
		this.persona = persona;
	}
	
	public Persona getPersona() {
		return this.persona;
	}
	
	public void setPersona(Persona nueva) {
		this.persona = nueva;
	}
	
	public Nodo getSig() {
		return sig;
	}
	
	public Nodo getPrev() {
		return prev;
	}
	
	public void setSig(Nodo n) {
		this.sig = n;
	}
	
	public void setPrev(Nodo n) {
		this.prev = n;
	}
}
