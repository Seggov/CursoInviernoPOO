package Prueba_Resi;

public class Nodo {

    private Paradero paradero;
    private Nodo sig;
    private Nodo prev;

    public Nodo(Paradero paradero) {
        this.paradero = paradero;
    }

    public Paradero getParadero() {
        return paradero;
    }

    public Nodo getSig() {
        return sig;
    }

    public Nodo getPrev() {
        return prev;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }
}