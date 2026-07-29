package Main;

import java.util.Scanner;

public class AlgoritmoDV {

	public static void main(String[] args) {
		AlgoritmoDV programa = new AlgoritmoDV();
		programa.iniciar();
	}

	private void iniciar() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("RUT sin puntos ni guion");
		int rutString = sc.nextInt();
		System.out.println(rutString);
		
		
		
	}

}
