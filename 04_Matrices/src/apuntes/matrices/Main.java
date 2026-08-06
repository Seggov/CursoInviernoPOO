package apuntes.matrices;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private int filas;
    private int columnas;
    private int[][] matriz;

    private final Scanner SC = new Scanner(System.in);
    private final Random RANDOM = new Random();

    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniciar();
    }

    private void iniciar() {
        ingresarDimensiones();

        matriz = new int[filas][columnas];

        llenarMatriz();
        mostrarMatriz();
        System.out.println("Suma total: " + sumarMatriz());

        SC.close();
    }

    private void ingresarDimensiones() {
        System.out.print("Ingrese cantidad de filas: ");
        filas = SC.nextInt();

        System.out.print("Ingrese cantidad de columnas: ");
        columnas = SC.nextInt();
    }

    private void llenarMatriz() {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = RANDOM.nextInt(12);
            }
        }
    }

    private void mostrarMatriz() {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                // print mantiene los datos de una fila en la misma linea.
                System.out.print(matriz[fila][columna] + " ");
            }

            // Al terminar una fila, saltamos a la siguiente linea.
            System.out.println();
        }
    }

    private int sumarMatriz() {
        int suma = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                suma += matriz[fila][columna];
            }
        }

        return suma;
    }
}
