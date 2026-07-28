package Main;

import java.io.File;
import java.util.Scanner;

public class ManejoErrores {

	private static Scanner SC = new Scanner(System.in);
	
	public static void main(String[] args) {
		ManejoErrores programa = new ManejoErrores();
		programa.Iniciar();
		
	}

	private void Iniciar() {
		
		try {
			lecturaArchivos("data.txt");
			String name = entradaUsuario();
			verificarSiesta(name);
		} catch (Exception e) {
			System.out.println("ERORR 404");
		}
	}

	private void lecturaArchivos(String string) {
		File FILE = new File(string);
		
		String linea = SC.nextLine();
		while (SC.hasNextLine()) {
			
		}
		
	}

	private void verificarSiesta(String name) {
		
	}

	private String entradaUsuario() {
		System.out.println("Ingresa el nombre que quieres buscar: "); String usuario = SC.nextLine();
		return usuario;
		
	}

}
