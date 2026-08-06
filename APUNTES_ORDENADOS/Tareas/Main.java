package Apuntes.Tareas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main programa = new Main();
		programa.inciarCiclo();
		
	}
	
	public void inciarCiclo() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		
		String seleccionador = sc.nextLine();
		
		switch (seleccionador) {
		case "1":
			
			
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;

		default:
			System.out.println("Saliendo. No se encontro la Opcion");
			break;
		}
		
		sc.close();
		
	}

}
