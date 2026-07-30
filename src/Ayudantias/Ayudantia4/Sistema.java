package Ayudantias.Ayudantia4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	
	
	public void iniciar() {
		try {
			mostrarMenu();
			lecturaMuestras();
			ArrayList<E>

		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}

	}

	private void mostrarMenu() {
		System.out.println("============ MENÚ PRINCIPAL ============");
		System.out.println("		1. Cargar muestras diarias");
		System.out.println("		2. Cargar muestras mensuales");
		System.out.println("		3. Salir");
		System.out.println("========================================");
				
	}

	private void lecturaMuestras() throws FileNotFoundException {

		File file = new File("muestras_diarias.txt");
		Scanner sc = new Scanner(file);
	}
	
	private void lecturaMensuales() throws FileNotFoundException {
		File file = new File("muestras_mensuales.txt");
		Scanner sc = new Scanner(file);
	}

}
