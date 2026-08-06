package Main;

import java.util.Random;
import java.util.Scanner;

public class App {

	private static Sistema sistema = new SistemaImpl();
	private static Random RD = new Random();
	private static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		App.iniciar();
	}

	public static void iniciar() {
		String eleccionUSer = "";
		int cantidad = 0;
		int nivelE = 0;
		try {
			do {
				mostrarMenu();
				eleccionUSer = SC.nextLine();
				switch (eleccionUSer) {
				case "1":
					crearCuenta();
					break;
				case "2":
					depositar();
					break;
				case "3":
					retirar();
					break;
				case "4":
					eliminarCuenta();
					break;
				case "5":
					revisarEstado();
					break;
				case "6":
					System.out.println("-"+mostrarGanancias());
					break;
				case "7":
					System.out.println("Hasta Luego!!");
					break;
				default:
					System.out.println("Opcion invaldia");
					eleccionUSer = "8";
					break;
				}
				cantidad = SC.nextInt();
				nivelE = SC.nextInt();
			} while (eleccionUSer.equals("8"));
		} catch (Exception e) {

		}
	}

	private static void revisarEstado() {
		
	}

	private static void eliminarCuenta() {
		// TODO Auto-generated method stub
		
	}

	private static void retirar() {
		// TODO Auto-generated method stub
		
	}

	private static void depositar() {
		// TODO Auto-generated method stub
		
	}

	private static void crearCuenta() {
		int estadoSocial = RD.nextInt(1,100); // RHS
		int numeroCuenta = RD.nextInt(1000000); // number cuenta
		
		System.out.println("=========================================");
		System.out.println("         ESTADO DE LA CUENTA             ");
		System.out.println("=========================================");
		System.out.println(" Variable [estadoSocial] : " + estadoSocial);
		System.out.println(" Variable [numeroCuenta] : " + numeroCuenta);
		System.out.println("=========================================");		
	}

	private static String mostrarGanancias() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void mostrarMenu() {
		System.out.println("=== Sistema Bancario ===");
		System.out.println("1. Crear cuenta");
		System.out.println("2. Depositar");
		System.out.println("3. Retirar");
		System.out.println("4. Eliminar cuenta");
		System.out.println("5. Revisar estado");
		System.out.println("6. Mostrar ganancias");
		System.out.println("7. Mostrar gastos");
		System.out.println("8. Salir");
	}

}
