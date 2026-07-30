package Tareas.Nodos;


public class ListaDobleNexo {

    private Nodo primero;

    public ListaDobleNexo() {
        primero = null;
    }

    public void insertarFinal(Nodo nuevo) {

        if (nuevo == null) {
            return;
        }

        /*
         * Dejamos al nodo sin conexiones anteriores.
         * Esto evita que venga conectado a otra lista.
         */
        nuevo.setSiguiente(null);
        nuevo.setAnterior(null);

        // Caso 1: la lista está vacía
        if (isEmpty()) {
            primero = nuevo;
            return;
        }

        // Caso 2: ya existen nodos
        Nodo actual = primero;

        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }

        // actual es el último nodo
        actual.setSiguiente(nuevo);
        nuevo.setAnterior(actual);
    }

    public void insertarInicio(Nodo nuevo) {

        if (nuevo == null) {
            return;
        }

        nuevo.setAnterior(null);

        // Caso 1: lista vacía
        if (isEmpty()) {
            nuevo.setSiguiente(null);
            primero = nuevo;
            return;
        }

        // Caso 2: ya existen nodos
        nuevo.setSiguiente(primero);
        primero.setAnterior(nuevo);
        primero = nuevo;
    }

    public String mostrarDatos() {

        if (isEmpty()) {
            return "La lista está vacía.";
        }

        String resultado = "";
        Nodo actual = primero;

        while (actual != null) {
            resultado += actual.getPersona().toString() + "\n";
            actual = actual.getSiguiente();
        }

        return resultado;
    }

    public int size() {

        int contador = 0;
        Nodo actual = primero;

        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }

        return contador;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public Persona buscarRut(String rutBuscado) {

        Nodo actual = primero;

        while (actual != null) {

            String rutActual = actual.getPersona().getRut();

            if (rutActual.equalsIgnoreCase(rutBuscado)) {
                return actual.getPersona();
            }

            actual = actual.getSiguiente();
        }

        return null;
    }

    public boolean eliminarPorRut(String rutBuscado) {

        Nodo actual = primero;

        // Buscar el nodo que tiene el RUT
        while (actual != null
                && !actual.getPersona()
                        .getRut()
                        .equalsIgnoreCase(rutBuscado)) {

            actual = actual.getSiguiente();
        }

        // No se encontró
        if (actual == null) {
            return false;
        }

        Nodo nodoAnterior = actual.getAnterior();
        Nodo nodoSiguiente = actual.getSiguiente();

        /*
         * Si no tiene anterior, significa que es
         * el primer nodo de la lista.
         */
        if (nodoAnterior == null) {
            primero = nodoSiguiente;
        } else {
            nodoAnterior.setSiguiente(nodoSiguiente);
        }

        /*
         * Si tiene siguiente, hacemos que el siguiente
         * apunte hacia el nodo anterior.
         */
        if (nodoSiguiente != null) {
            nodoSiguiente.setAnterior(nodoAnterior);
        }

        // Desconectamos completamente el nodo eliminado
        actual.setAnterior(null);
        actual.setSiguiente(null);

        return true;
    }

    public void vaciar() {
        primero = null;
    }

    public void sort() {

        if (isEmpty() || primero.getSiguiente() == null) {
            return;
        }

        boolean huboIntercambio;

        do {
            huboIntercambio = false;

            Nodo actual = primero;

            while (actual.getSiguiente() != null) {

                Nodo siguiente = actual.getSiguiente();

                Persona personaActual = actual.getPersona();
                Persona personaSiguiente = siguiente.getPersona();

                /*
                 * Si compareTo devuelve un número positivo,
                 * están en el orden incorrecto.
                 */
                if (personaActual.compareTo(personaSiguiente) > 0) {

                    actual.setPersona(personaSiguiente);
                    siguiente.setPersona(personaActual);

                    huboIntercambio = true;
                }

                actual = actual.getSiguiente();
            }

        } while (huboIntercambio);
    }
}
