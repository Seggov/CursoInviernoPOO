package PruebaProgramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

	private ArrayList<Cartas> listaCartas = new ArrayList<>();

	public void iniciar() {
		Scanner sc = new Scanner(System.in);

		try {
			lecturaArchivo();
			menu();
			String user = sc.nextLine();

			while (!user.equals("6")) {
				switch (user) {
				case "1":
					break;
				case "2":
					break;
				case "3":
					break;
				case "4":
					break;
				case "5":
					break;

				default:
					System.out.println("Saliendo, no se entiende lo que entraste: " + user);

				}
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}

	}

	private void menu() {
		System.out.println("""
								===== MENU =====
				1. Mostrar todas las piezas del inventario
				2. Crear una exposicion tematica
				3. Crear una exposicion de rareza
				4. Mostrar todas las exposiciones y sus piezas
				5. Buscar una pieza por codigo en el inventario y mostrar las exposiciones a las que pertenece
				6. Salir
								"""

		);

	}

	private void lecturaArchivo() throws FileNotFoundException {
		File file = new File("piezas.txt");
		Scanner arch = new Scanner(file);

		while (arch.hasNextLine()) {
			String linea = arch.nextLine();
			String[] partes = linea.split(";");

			if (partes[0].equals("COMIC")) {
				String codigo = partes[1];
				String nombre = partes[2];
				String anio = partes[3];
				int valor = Integer.parseInt(partes[4]);
				String rareza = partes[5];
				String editorial = partes[6];
				int numeroEdition = Integer.parseInt(partes[7]);

					Comic comis = new Comic(codigo, nombre, anio, valor, rareza, editorial, numeroEdition);
				
				listaCartas.add(carts);

			} else if (partes[0].equals("CARTA")) {
				String codigo = partes[1];
				String nombre = partes[2];
				String anio = partes[3];
				int valor = Integer.parseInt(partes[4]);
				String rareza = partes[5];
				String editorial = partes[6];
				int numeroEdition = Integer.parseInt(partes[7]);

				Cartas carts = new Cartas(codigo, nombre, anio, valor, rareza, editorial, numeroEdition);

				listaCartas.add(carts);

			}

		}

	}

}
