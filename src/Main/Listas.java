package Main;

import java.util.Arrays;

public class Listas {

    /*
     * Arreglo que almacena los elementos de la lista.
     * Tiene una capacidad máxima de 12 valores.
     */
    private int[] lista = new int[12];

    /*
     * Indica cuántos elementos reales hay en la lista.
     * Las posiciones desde 0 hasta cantidad - 1 contienen datos válidos.
     */
    private int cantidad = 0;

    public static void main(String[] args) {
        Listas programa = new Listas();
        programa.iniciar();
    }

    /**
     * Ejecuta ejemplos de inserción ordenada, eliminación y búsqueda binaria.
     */
    private void iniciar() {

        /*
         * Se insertan ordenadamente para que la lista quede:
         * [3, 7, 25, 43, 56]
         */
        insertarOrdenado(25);
        insertarOrdenado(7);
        insertarOrdenado(56);
        insertarOrdenado(3);
        insertarOrdenado(43);

        System.out.println("Lista ordenada:");
        mostrarLista();

        /*
         * Busca el número 25.
         * La búsqueda binaria funciona solamente sobre una lista ordenada.
         */
        int posicion = buscarBinaria(25);

        if (posicion != -1) {
            System.out.println("El número 25 está en el índice: " + posicion);
        } else {
            System.out.println("El número 25 no fue encontrado.");
        }

        // Elimina el valor que está en el índice 2: el número 25.
        eliminar(2);

        System.out.println("Lista después de eliminar el índice 2:");
        mostrarLista();
    }

    /**
     * Muestra el arreglo completo y la cantidad de elementos válidos.
     */
    private void mostrarLista() {
        System.out.println(Arrays.toString(lista));
        System.out.println("Cantidad de elementos: " + cantidad);
    }

    /**
     * Inserta un elemento en un índice específico.
     *
     * Para hacer espacio, desplaza una posición a la derecha todos los
     * elementos ubicados desde el índice indicado hacia adelante.
     *
     * Ejemplo:
     * Lista: [1, 4, 5, 6]
     * insertar(2, 50)
     * Resultado: [1, 4, 50, 5, 6]
     *
     * @param indice posición donde se insertará el elemento.
     * @param elemento número que se desea insertar.
     */
    private void insertar(int indice, int elemento) {

        // Es válido insertar desde el índice 0 hasta cantidad.
        if (indice < 0 || indice > cantidad) {
            System.out.println("Índice inválido.");
            return;
        }

        // Si cantidad llegó al tamaño del arreglo, no queda espacio.
        if (cantidad == lista.length) {
            System.out.println("Lista llena.");
            return;
        }

        /*
         * El recorrido es de derecha a izquierda.
         * Así no se sobrescribe un elemento antes de moverlo.
         */
        for (int i = cantidad; i > indice; i--) {
            lista[i] = lista[i - 1];
        }

        lista[indice] = elemento;
        cantidad++;
    }

    /**
     * Inserta un elemento manteniendo la lista ordenada de menor a mayor.
     *
     * Busca la posición adecuada y utiliza insertar() para desplazar
     * los valores y guardar el nuevo elemento.
     *
     * @param elemento número que se desea insertar ordenadamente.
     */
    private void insertarOrdenado(int elemento) {

        if (cantidad == lista.length) {
            System.out.println("Lista llena.");
            return;
        }

        int posicion = 0;

        /*
         * Avanza mientras el valor actual sea menor que el nuevo elemento.
         * Al terminar, posicion corresponde al lugar correcto para insertarlo.
         */
        while (posicion < cantidad && lista[posicion] < elemento) {
            posicion++;
        }

        insertar(posicion, elemento);
    }

    /**
     * Elimina el elemento ubicado en el índice recibido.
     *
     * Los elementos posteriores se desplazan una posición a la izquierda
     * para cubrir el espacio que dejó el elemento eliminado.
     *
     * Ejemplo:
     * Lista: [10, 20, 30, 40]
     * eliminar(1)
     * Resultado: [10, 30, 40]
     *
     * @param indice posición del elemento que se desea eliminar.
     */
    private void eliminar(int indice) {

        if (indice < 0 || indice >= cantidad) {
            System.out.println("Índice inválido.");
            return;
        }

        /*
         * Cada elemento posterior toma el lugar del anterior.
         */
        for (int i = indice; i < cantidad - 1; i++) {
            lista[i] = lista[i + 1];
        }

        cantidad--;

        // Limpia la última posición que quedó repetida.
        lista[cantidad] = 0;
    }

    /**
     * Busca un número en una lista ordenada mediante búsqueda binaria.
     *
     * En cada iteración revisa el elemento central:
     * - Si es el elemento buscado, retorna su posición.
     * - Si el buscado es menor, continúa en la mitad izquierda.
     * - Si el buscado es mayor, continúa en la mitad derecha.
     *
     * @param elemento número que se desea buscar.
     * @return el índice del elemento si existe; -1 si no existe.
     */
    private int buscarBinaria(int elemento) {

        int inicio = 0;
        int fin = cantidad - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (lista[medio] == elemento) {
                return medio;
            }

            if (elemento < lista[medio]) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }

        return -1;
    }
}