package Main;

import java.util.Random;
import java.util.Scanner;

public class Matriz {

    private int filas;
    private int columnas;
    private int[][] matriz;
    
    private final Scanner SC = new Scanner(System.in);
    private final Random RANDOM = new Random();

    public static void main(String[] args) {
        Matriz programa = new Matriz();
        programa.iniciar();
    }

    private void iniciar() {
        ingresarDimensiones();

        matriz = new int[filas][columnas];
        
        llenarMatriz();
        mostrarMatriz();

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
                System.out.println(""+matriz[fila][columna]);
            }

            System.out.println();
        }
    }
}