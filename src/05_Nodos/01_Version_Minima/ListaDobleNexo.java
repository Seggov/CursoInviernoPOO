package Apuntes.MinimoNodos;

public class ListaDobleNexo {

    private Nodo primero;

    public ListaDobleNexo() {
        primero = null;
    }

    public void insertarFinal(Nodo nuevo) {

        if (primero == null) {
            primero = nuevo;
            return;
        }

        Nodo actual = primero;

        while (actual.getSig() != null) {
            actual = actual.getSig();
        }

        actual.setSig(nuevo);
        nuevo.setPrev(actual);
    }

    public void insertarInicio(Persona p) {
        Nodo n = new Nodo(p);

        if (isEmpty()) {
            primero = n;
            return;
        }

        n.setSig(primero);
        primero.setPrev(n);
        primero = n;
    }		

    private boolean isEmpty() {
        return primero == null;
    }

    private int size() {
        int contador = 0;
        Nodo actual = primero;

        while (actual != null) {
            contador++;
            actual = actual.getSig();
        }

        return contador;
    }

    public Persona getI(int index) {

        if (index < 0 || index >= size()) {
            return null;
        }

        Nodo actual = primero;

        for (int i = 0; i < index; i++) {
            actual = actual.getSig();
        }

        return actual.getPersona();
    }

    public void mostrarDatos() {

        Nodo actual = primero;

        while (actual != null) {

            String anterior;
            String siguiente;

            if (actual.getPrev() == null) {
                anterior = "null";
            } else {
                anterior = actual.getPrev().getPersona().getNombre();
            }

            if (actual.getSig() == null) {
                siguiente = "null";
            } else {
                siguiente = actual.getSig().getPersona().getNombre();
            }

            System.out.println(
                    anterior
                    + " <- "
                    + actual.getPersona().getNombre()
                    + " -> "
                    + siguiente
            );

            actual = actual.getSig();
        }
    }
}