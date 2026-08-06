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

    public void insertarInicio(Persona persona) {
        Nodo nuevo = new Nodo(persona);

        if (isEmpty()) {
            primero = nuevo;
            return;
        }

        nuevo.setSig(primero);
        primero.setPrev(nuevo);
        primero = nuevo;
    }

    public void insertarFinal(Persona persona) {
        Nodo nuevo = new Nodo(persona);

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

        if (nodo == null) {
            return null;
        }

        return nodo.getPersona();
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
            String anterior = "null";
            String siguiente = "null";

            if (actual.getPrev() != null) {
                anterior = actual.getPrev().getPersona().getNombre();
            }

            if (actual.getSig() != null) {
                siguiente = actual.getSig().getPersona().getNombre();
            }

            System.out.println(anterior + " <- "
                    + actual.getPersona().getNombre()
                    + " -> " + siguiente);

            actual = actual.getSig();
        }
    }

    public void sort() {
        // Para mantener el ejemplo sencillo, se intercambian las Personas
        // y no los enlaces entre nodos.
        for (int i = 0; i < size() - 1; i++) {
            Nodo nodoI = getNodoI(i);

            for (int j = i + 1; j < size(); j++) {
                Nodo nodoJ = getNodoI(j);

                if (nodoI.getPersona().compareTo(nodoJ.getPersona()) > 0) {
                    Persona temporal = nodoI.getPersona();
                    nodoI.setPersona(nodoJ.getPersona());
                    nodoJ.setPersona(temporal);
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

    public boolean eliminarPorRut(String rut) {
        Nodo actual = primero;

        while (actual != null) {
            if (actual.getPersona().getRut().equals(rut)) {
                Nodo anterior = actual.getPrev();
                Nodo siguiente = actual.getSig();

                if (anterior == null) {
                    primero = siguiente;
                } else {
                    anterior.setSig(siguiente);
                }

                if (siguiente != null) {
                    siguiente.setPrev(anterior);
                }

                return true;
            }

            actual = actual.getSig();
        }

        return false;
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
