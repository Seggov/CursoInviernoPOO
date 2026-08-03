package Prueba_Resi;

public class ListaParaderos {

    private Nodo primero;

    public ListaParaderos() {
        this.primero = null;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public void agregarFinal(Paradero p) {

        Nodo nuevo = new Nodo(p);

        if (isEmpty()) {
            primero = nuevo;
            return;
        }

        Nodo ultimo = getUltimo();

        ultimo.setSig(nuevo);
        nuevo.setPrev(ultimo);
    }


    private Nodo getUltimo() {

        if (isEmpty()) {
            return null;
        }

        Nodo actual = primero;

        while (actual.getSig() != null) {
            actual = actual.getSig();
        }

        return actual;
    }


    public void mostrarParaderos() {

        Nodo actual = primero;

        while (actual != null) {

            System.out.println(actual.getParadero());

            actual = actual.getSig();
        }
    }


    public int cantidad() {

        int contador = 0;

        Nodo actual = primero;

        while (actual != null) {

            contador++;

            actual = actual.getSig();
        }

        return contador;
    }


    public void invertirLaRuta() {

        if (isEmpty()) {
            return;
        }

        Nodo actual = primero;
        Nodo ultimo = getUltimo();

        while (actual != null) {

            Nodo siguiente = actual.getSig();

            // intercambiamos las referencias
            actual.setSig(actual.getPrev());
            actual.setPrev(siguiente);

            actual = siguiente;
        }

        // el antiguo último ahora es el primero
        primero = ultimo;
    }
}