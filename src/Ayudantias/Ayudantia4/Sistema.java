package Ayudantias.Ayudantia4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	
	private static final String rutaMuestraMensual = "C:\\Users\\Alumnos\\Desktop\\CursoInviernoPOO\\src\\Ayudantias\\Ayudantia4\\muestras_mensuales.txt";
	private static final String rutaMuestraDiarias = "C:\\Users\\Alumnos\\Desktop\\CursoInviernoPOO\\src\\Ayudantias\\Ayudantia4\\muestras_diarias.txt";
	private final Scanner ENTRADA = new Scanner(System.in);
	private ArrayList muestrasDiarias = new ArrayList();
	
	public void iniciar() {
		int opcion = 0;
		while (opcion != 3) {
			mostrarMenu();
			try {
				System.out.println("Ingrese una opcion: º");
				lecturaMuestras();
                opcion = Integer.parseInt(ENTRADA.nextLine());
                
				
				
			} catch (FileNotFoundException e) {
				// TODO: handle exception
			}

		}

	}

	private void mostrarMenu() {
		System.out.println("============ MENÚ PRINCIPAL ============");
		System.out.println("	1. Cargar muestras diarias");
		System.out.println("	2. Cargar muestras mensuales");
		System.out.println("	3. Salir");
		System.out.println("========================================");
				
	}

	private void lecturaMuestras() throws FileNotFoundException {

		File file = new File(rutaMuestraMensual);
		Scanner sc = new Scanner(file);
	}
	
	private void lecturaMensuales() throws FileNotFoundException {
		File file = new File(rutaMuestraDiarias);
		Scanner sc = new Scanner(file);
	}

}
