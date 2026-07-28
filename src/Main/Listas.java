package Main;

import java.util.Arrays;

public class Listas {

    private int[] lista = {1, 4, 5, 6, 7, 23, 56, 25, 7, 43, 3, 0};

    public static void main(String[] args) {
        Listas programa = new Listas();
        programa.iniciar();
    }

    private void iniciar() {
        insertar(3, 50);
        eliminar(5);

        System.out.println(Arrays.toString(lista));
    }



    private void insertar(int indice, int elemento) {
        if (indice < 0 || indice >= lista.length) {
            System.out.println("Índice inválido");
            return;
        }

        if (lista[lista.length - 1] != 0) {
            System.out.println("Lista llena");
            return;
        }

        for (int i = lista.length - 1; i > indice; i--) {
            lista[i] = lista[i - 1];
        }

        lista[indice] = elemento;
    }

    private void eliminar(int indice) {
        if (indice < 0 || indice >= lista.length) {
            System.out.println("Índice inválido");
            return;
        }

        for (int i = indice; i < lista.length - 1; i++) {
            lista[i] = lista[i + 1];
        }

        lista[lista.length - 1] = 0;
    }

    private void insertarOrdenado(int elemento) {
        int cantidad = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != 0) {
                cantidad++;
            }
        }

        if (cantidad == lista.length) {
            System.out.println("Lista llena");
            return;
        }

        int posicion = cantidad;

        for (int i = 0; i < cantidad; i++) {
            if (elemento < lista[i]) {
                posicion = i;
                break;
            }
        }

        for (int i = cantidad; i > posicion; i--) {
            lista[i] = lista[i - 1];
        }

        lista[posicion] = elemento;
    }
}