package apuntes.nodos;

public class ListaDobleNexo {

    private Nodo primero;

    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        int contador = 0;
        Nodo actual = primero;

        while (actual != null) {
            contador++;
            actual = actual.getSig();
        }
        return contador;
    }

    public void insertarInicio(Persona p) {
        Nodo nuevo = new Nodo(p);

        if (isEmpty()) {
            primero = nuevo;
            return;
        }

        nuevo.setSig(primero);
        primero.setPrev(nuevo);
        primero = nuevo;
    }

    public void insertarFinal(Persona p) {
        Nodo nuevo = new Nodo(p);

        if (isEmpty()) {
            primero = nuevo;
            return;
        }

        Nodo ultimo = getUltimo();
        ultimo.setSig(nuevo);
        nuevo.setPrev(ultimo);
    }

    public Persona getI(int index) {
        Nodo nodo = getNodoI(index);
        return nodo == null ? null : nodo.getPersona();
    }

    public Persona buscarRut(String rut) {
        Nodo actual = primero;

        while (actual != null) {
            if (actual.getPersona().getRut().equals(rut)) {
                return actual.getPersona();
            }
            actual = actual.getSig();
        }
        return null;
    }

    public String mostrar() {
        String salida = "";
        Nodo actual = primero;

        while (actual != null) {
            salida += actual.getPersona() + System.lineSeparator();
            actual = actual.getSig();
        }
        return salida;
    }

    public void mostrarConexiones() {
        Nodo actual = primero;

        while (actual != null) {
            String anterior = actual.getPrev() == null
                    ? "null"
                    : actual.getPrev().getPersona().getNombre();

            String siguiente = actual.getSig() == null
                    ? "null"
                    : actual.getSig().getPersona().getNombre();

            System.out.println(anterior + " <- "
                    + actual.getPersona().getNombre()
                    + " -> " + siguiente);

            actual = actual.getSig();
        }
    }

    public void sort() {
        // Orden sencillo: intercambia las Personas, no los enlaces de los nodos.
        for (int i = 0; i < size() - 1; i++) {
            Nodo ni = getNodoI(i);

            for (int j = i + 1; j < size(); j++) {
                Nodo nj = getNodoI(j);

                if (ni.getPersona().compareTo(nj.getPersona()) > 0) {
                    Persona temporal = ni.getPersona();
                    ni.setPersona(nj.getPersona());
                    nj.setPersona(temporal);
                }
            }
        }
    }

    public void invertir() {
        Nodo actual = primero;
        Nodo nuevoPrimero = null;

        while (actual != null) {
            Nodo siguienteOriginal = actual.getSig();

            actual.setSig(actual.getPrev());
            actual.setPrev(siguienteOriginal);

            nuevoPrimero = actual;
            actual = siguienteOriginal;
        }

        primero = nuevoPrimero;
    }

    public void vaciar() {
        primero = null;
    }

    private Nodo getNodoI(int index) {
        if (index < 0 || index >= size()) {
            return null;
        }

        Nodo actual = primero;
        for (int i = 0; i < index; i++) {
            actual = actual.getSig();
        }
        return actual;
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
}
