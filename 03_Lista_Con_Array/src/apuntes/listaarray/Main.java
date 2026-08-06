package apuntes.listaarray;

import java.util.Arrays;

public class Main {

    private int[] lista = new int[12];
    private int cantidad = 0;

    public static void main(String[] args) {
        Main programa = new Main();
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
            System.out.println("El numero 25 esta en el indice: " + posicion);
        } else {
            System.out.println("El numero 25 no fue encontrado.");
        }

        eliminar(2);
        System.out.println("Lista despues de eliminar el indice 2:");
        mostrarLista();
    }

    private void mostrarLista() {
        System.out.println(Arrays.toString(lista));
        System.out.println("Cantidad de elementos validos: " + cantidad);
    }

    private void insertar(int indice, int elemento) {
        if (indice < 0 || indice > cantidad) {
            System.out.println("Indice invalido.");
            return;
        }

        if (cantidad == lista.length) {
            System.out.println("Lista llena.");
            return;
        }

        // Se recorre de derecha a izquierda para no pisar datos.
        for (int i = cantidad; i > indice; i--) {
            lista[i] = lista[i - 1];
        }

        lista[indice] = elemento;
        cantidad++;
    }

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

    private void eliminar(int indice) {
        if (indice < 0 || indice >= cantidad) {
            System.out.println("Indice invalido.");
            return;
        }

        for (int i = indice; i < cantidad - 1; i++) {
            lista[i] = lista[i + 1];
        }

        cantidad--;
        lista[cantidad] = 0;
    }

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
