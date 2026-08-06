package apuntes.listaarray;

import java.util.Arrays;

public class ListaConArray {
    private int[] lista = new int[12];
    private int cantidad = 0;

    public static void main(String[] args) {
        ListaConArray programa = new ListaConArray();
        programa.iniciar();
    }

    private void iniciar() {
        insertarOrdenado(25);
        insertarOrdenado(7);
        insertarOrdenado(56);
        insertarOrdenado(3);
        insertarOrdenado(43);

        System.out.println("Lista ordenada:");
        mostrarLista();

        int posicion = buscarBinaria(25);
        if (posicion != -1) {
            System.out.println("El número 25 está en el índice: " + posicion);
        } else {
            System.out.println("El número 25 no fue encontrado.");
        }

        eliminar(2);
        System.out.println("Lista después de eliminar el índice 2:");
        mostrarLista();
    }

    /** Muestra el arreglo completo y cuántos datos son válidos. */
    private void mostrarLista() {
        System.out.println(Arrays.toString(lista));
        System.out.println("Cantidad de elementos: " + cantidad);
    }

    /**
     * Inserta un elemento en un índice específico.
     * Para hacer espacio mueve a la derecha los elementos posteriores.
     */
    private void insertar(int indice, int elemento) {
        if (indice < 0 || indice > cantidad) {
            System.out.println("Índice inválido.");
            return;
        }

        if (cantidad == lista.length) {
            System.out.println("Lista llena.");
            return;
        }

        // De derecha a izquierda para no sobrescribir datos antes de moverlos.
        for (int i = cantidad; i > indice; i--) {
            lista[i] = lista[i - 1];
        }

        lista[indice] = elemento;
        cantidad++;
    }

    /** Inserta manteniendo la lista ordenada de menor a mayor. */
    private void insertarOrdenado(int elemento) {
        if (cantidad == lista.length) {
            System.out.println("Lista llena.");
            return;
        }

        int posicion = 0;
        while (posicion < cantidad && lista[posicion] < elemento) {
            posicion++;
        }

        insertar(posicion, elemento);
    }

    /** Elimina por índice y mueve a la izquierda lo que queda después. */
    private void eliminar(int indice) {
        if (indice < 0 || indice >= cantidad) {
            System.out.println("Índice inválido.");
            return;
        }

        for (int i = indice; i < cantidad - 1; i++) {
            lista[i] = lista[i + 1];
        }

        cantidad--;
        lista[cantidad] = 0;
    }

    /** Busca en una lista ordenada, descartando la mitad en cada paso. */
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
