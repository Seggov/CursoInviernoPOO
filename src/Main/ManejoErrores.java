package Main;

import java.util.Scanner;

public class ManejoErrores {

	private static Scanner SC = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		ManejoErrores programa = new ManejoErrores();
		programa.Iniciar();
		
	}

	private void Iniciar() {
		
		try {
			entradaUsuario();
		} catch (Exception e) {
			System.out.println("ERORR 404");
		}
	}

	private void entradaUsuario() {
		System.out.println("Ingresa tu nombre: "); String usuario = SC.nextLine();

	}

}
