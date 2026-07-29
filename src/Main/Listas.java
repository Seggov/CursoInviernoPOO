package Main;

import java.util.Arrays;

public class Listas {

    // Arreglo con capacidad máxima de 12 números.
    private int[] lista = new int[12];

    /*
     * Indica cuántos elementos reales hay guardados.
     * Por ejemplo, si cantidad = 4, los elementos válidos
     * están en las posiciones 0, 1, 2 y 3.
     */
    private int cantidad = 0;

    public static void main(String[] args) {
        Listas programa = new Listas();

        // Agregamos algunos elementos a la lista.
        programa.insertar(0, 1);
        programa.insertar(1, 4);
        programa.insertar(2, 5);
        programa.insertar(3, 6);

        // Inserta 50 en la posición 2.
        programa.insertar(2, 50);

        // Elimina el elemento que está en la posición 1.
        programa.eliminar(1);

        // Muestra el arreglo completo.
        System.out.println(Arrays.toString(programa.lista));
    }

    /**
     * Inserta un elemento en una posición específica de la lista.
     *
     * Antes de insertar, mueve una posición a la derecha todos
     * los elementos que estén desde el índice indicado hacia adelante.
     *
     * Ejemplo:
     * Lista:    [1, 4, 5, 6]
     * insertar(2, 50)
     * Resultado: [1, 4, 50, 5, 6]
     *
     * @param indice posición donde se insertará el elemento.
     * @param elemento número que se desea guardar.
     */
    private void insertar(int indice, int elemento) {

        // Un índice válido puede ir desde 0 hasta cantidad.
        // Se permite cantidad porque se puede agregar al final.
        if (indice < 0 || indice > cantidad) {
            System.out.println("Índice inválido");
            return;
        }

        // Si cantidad es igual al tamaño máximo, ya no hay espacio.
        if (cantidad == lista.length) {
            System.out.println("Lista llena");
            return;
        }

        /*
         * Se recorren los elementos de derecha a izquierda.
         * Esto evita sobrescribir un valor antes de moverlo.
         */
        for (int i = cantidad; i > indice; i--) {
            lista[i] = lista[i - 1];
        }

        // Se guarda el nuevo elemento en la posición solicitada.
        lista[indice] = elemento;

        // Ahora existe un elemento más en la lista.
        cantidad++;
    }

    /**
     * Elimina el elemento de una posición específica.
     *
     * Para eliminarlo, mueve una posición a la izquierda todos los
     * elementos que están después de él.
     *
     * Ejemplo:
     * Lista:     [1, 4, 50, 5, 6]
     * eliminar(1)
     * Resultado: [1, 50, 5, 6]
     *
     * @param indice posición del elemento que se desea eliminar.
     */
    private void eliminar(int indice) {

        // Solo se pueden eliminar posiciones que realmente tienen datos.
        if (indice < 0 || indice >= cantidad) {
            System.out.println("Índice inválido");
            return;
        }

        /*
         * Se copia cada elemento siguiente en la posición anterior.
         * De esa forma se “tapa” el espacio del elemento eliminado.
         */
        for (int i = indice; i < cantidad - 1; i++) {
            lista[i] = lista[i + 1];
        }

        // Disminuye la cantidad porque ahora hay un elemento menos.
        cantidad--;

        // Se limpia el último espacio que quedó repetido.
        lista[cantidad] = 0;
    }

    /**
     * Inserta un elemento manteniendo la lista ordenada de menor a mayor.
     *
     * Este método supone que los elementos que ya están en la lista
     * se encuentran ordenados previamente.
     *
     * Ejemplo:
     * Lista: [1, 4, 5, 8]
     * insertarOrdenado(6)
     * Resultado: [1, 4, 5, 6, 8]
     *
     * @param elemento número que se quiere insertar ordenadamente.
     */
    private void insertarOrdenado(int elemento) {

        // No se puede insertar si no hay espacio.
        if (cantidad == lista.length) {
            System.out.println("Lista llena");
            return;
        }

        int posicion = 0;

        /*
         * Avanza mientras:
         * - Aún existan elementos válidos.
         * - El elemento actual sea menor que el que queremos insertar.
         *
         * Al terminar, posicion indica dónde debe ir el nuevo elemento.
         */
        while (posicion < cantidad && lista[posicion] < elemento) {
            posicion++;
        }

        // Reutilizamos insertar para mover los elementos y guardar el valor.
        insertar(posicion, elemento);
    }
}