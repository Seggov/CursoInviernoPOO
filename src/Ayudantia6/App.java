package Ayudantia6;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.util.ArrayList;
import java.util.Scanner;


public class App {

	public static void main(String[] args) throws FileNotFoundException {
		App programa = new App();
		programa.iniciar();
	}
	
	
	//private ArrayList<Alimento> listaAimento = new ArrayList<>();
	
	private void iniciar() throws FileNotFoundException {

		lecturaAchivos("pedidos.txt");
		
	}

	private void lecturaAchivos(String name) throws FileNotFoundException {
		// El do ejecuta el código primero, y después el while pregunta: “¿sigo
		// repitiendo?”
		
		try {

			File archivo = new File(name);
			Scanner lecturaArchivos = new Scanner(archivo);
			String linea = lecturaArchivos.nextLine();
			
			while (lecturaArchivos.hasNextLine()) {
				String[] partes = linea.split(";");
				String hora = partes[0];
				String auxdos = partes[1];
				String[] partesdos = auxdos.split(",");
				
				
				
				
				// 12.50;hamburguesa,papas,fanta
			}
			
		} catch (FileNotFoundException e) {
			
		}
		
		
	}

}
