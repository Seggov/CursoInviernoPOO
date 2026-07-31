package Ayudantias.Ayudantia4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

	private static final String rutaMuestraMensual = "muestras_mensuales.txt";

	private static final String rutaMuestraDiarias = "muestras_diarias.txt";
	private final Scanner ENTRADA = new Scanner(System.in);

	private ArrayList<String> muestrasDiarias = new ArrayList<>();
	private ArrayList<String> muestrasMensuales = new ArrayList<>();

	public void iniciar() {

		int opcion = 0;

		while (opcion != 3) {

			mostrarMenu();

			try {
				System.out.println("Ingrese una opción:");
				opcion = Integer.parseInt(ENTRADA.nextLine());

				switch (opcion) {

				case 1:
					lecturaDiarias();
					break;

				case 2:
					lecturaMensuales();
					break;

				case 3:
					System.out.println("Programa finalizado.");
					break;

				default:
					System.out.println("Opción inválida.");
				}

			} catch (FileNotFoundException e) {
				System.out.println("No se encontró el archivo.");
			} catch (NumberFormatException e) {
				System.out.println("Debes ingresar un número.");
			}
		}
	}

	private void mostrarMenu() {
		System.out.println("============ MENÚ PRINCIPAL ============");
		System.out.println("1. Cargar muestras diarias");
		System.out.println("2. Cargar muestras mensuales");
		System.out.println("3. Salir");
		System.out.println("========================================");
	}

	private void lecturaDiarias() throws FileNotFoundException {

		File file = new File(rutaMuestraDiarias);
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			String linea = sc.nextLine();
			muestrasDiarias.add(linea);
			System.out.println(linea);
		}

		sc.close();

		System.out.println("Muestras diarias cargadas.");
	}

	private void lecturaMensuales() throws FileNotFoundException {

		File file = new File(rutaMuestraMensual);
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			String linea = sc.nextLine();
			muestrasMensuales.add(linea);
			System.out.println(linea);
		}

		sc.close();

		System.out.println("Muestras mensuales cargadas.");
	}
}