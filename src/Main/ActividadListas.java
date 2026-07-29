package Main;

import java.util.Arrays;
import java.util.Random;

public class ActividadListas {
	
    private final Random RANDOM = new Random();

    public static void main(String[] args) {
        ActividadListas programa = new ActividadListas();
        programa.iniciar();
    }

    private void iniciar() {
    	System.err.println(163%9);
        int n = 5;
        	
        int[] listaNumeros = generarSecuenciaNumeros(n);
        String[] listaPalabras = generarSecuenciaPalabras(n);
        String[] listaVacia = new String[n];

        System.out.println(Arrays.toString(listaNumeros));

        System.out.println(Arrays.toString(listaPalabras));

        System.out.println(Arrays.toString(listaVacia));
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
}