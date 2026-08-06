package apuntes.nodos;

public class Nodo {
    private Persona persona;
    private Nodo sig;
    private Nodo prev;

    public Nodo(Persona persona) {
        this.persona = persona;
        this.sig = null;
        this.prev = null;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getPrev() {
        return prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }
}
