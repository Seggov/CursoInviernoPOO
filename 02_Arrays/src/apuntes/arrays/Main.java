package apuntes.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    private final Random RANDOM = new Random();

    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniciar();
    }

    private void iniciar() {
        int n = 5;

        int[] listaNumeros = generarSecuenciaNumeros(n);
        String[] listaPalabras = generarSecuenciaPalabras(n);
        String[] listaVacia = new String[n];

        System.out.println("Numeros: " + Arrays.toString(listaNumeros));
        System.out.println("Palabras: " + Arrays.toString(listaPalabras));
        System.out.println("Array vacio: " + Arrays.toString(listaVacia));

        System.out.println("Suma: " + sumar(listaNumeros));
        System.out.println("Promedio: " + promedio(listaNumeros));
    }

    private int[] generarSecuenciaNumeros(int n) {
        int[] lista = new int[n];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = RANDOM.nextInt(200);
        }

        return lista;
    }

    private String[] generarSecuenciaPalabras(int n) {
        String[] lista = new String[n];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = generarTextoAleatorio();
        }

        return lista;
    }

    private String generarTextoAleatorio() {
        int largo = RANDOM.nextInt(20) + 1;
        String texto = "";

        for (int i = 0; i < largo; i++) {
            char letra = (char) ('a' + RANDOM.nextInt(26));
            texto += letra;
        }

        return texto;
    }

    private int sumar(int[] lista) {
        int suma = 0;

        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }

        return suma;
    }

    private double promedio(int[] lista) {
        if (lista.length == 0) {
            return 0;
        }

        return (double) sumar(lista) / lista.length;
    }
}
