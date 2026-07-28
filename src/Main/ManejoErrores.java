package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ManejoErrores {

	private static Scanner SC = new Scanner(System.in);
	private static String[] lista_nombres = new String[100];
	private static int[] lista_sueldos = new int[100];

	
	public static void main(String[] args) {
		ManejoErrores programa = new ManejoErrores();
		programa.Iniciar();

	}

	private void Iniciar() {

		try {
			lecturaArchivos("data.txt");
			String name = entradaUsuario();
		} catch (FileNotFoundException e) {
			System.out.println("ERORR 404");
		}

	}

	private void lecturaArchivos(String string) throws FileNotFoundException {
		File file = new File(string);
		Scanner entrada = new Scanner(file);
		int contador = 0;
		while (entrada.hasNextLine()) {
			contador++;
			String linea = SC.nextLine();
			String[] partes = linea.split(";");
			
			int id = Integer.parseInt(partes[0]); // id
			String nombre = partes[1]; // nombre 
			String rol = partes[2]; // rut
			int sueldo = Integer.parseInt(partes[3]); // sueldo
			String aux_jefe = partes[4];
			String aux_lider = partes[5]; 
			
			if (aux_jefe.equals("true")) {
				boolean esJefe = true;}
			else {boolean esJefe = false;}
			if (aux_lider.equals("true")) {
				boolean esLider = true;
			}else {boolean esLider = false;}
			lista_nombres[contador] = nombre;
			lista_sueldos[contador] = sueldo;
		}
	}

	

	

	private String entradaUsuario() {
		System.out.println("Ingresa el nombre que quieres buscar: ");
		String usuario = SC.nextLine();
		return usuario;

	}

}
