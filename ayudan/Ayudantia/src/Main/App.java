package Main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

	private static Random RD = new Random();
	private static final Scanner SC = new Scanner(System.in);
	private static Cuenta cuenta; // sin crear la instancia
	private static Ahorro ahorro;
	private static Corriente corriente;
	private static Vista vista;
	
	private static ArrayList<Cuenta> banco = new ArrayList<>();

	public static void main(String[] args) {
		App.iniciar();
	}

	public static void iniciar() {
		String eleccionUser = "";

		do {
			try {
				mostrarMenu();
				System.out.print("Ingrese una opción: ");
				eleccionUser = SC.nextLine();

				switch (eleccionUser) {
				case "1":
					crearCuenta();
					break;
				case "2":

					if (banco.isEmpty()) {
						System.out.println("Primero debes crear una cuenta en nuestro Banco");
						crearCuenta();
						depositar();
					} else {
						depositar();

					}
					break;
				case "3":
					if (banco.isEmpty()) {
						System.out.println("Primero debes crear una cuenta en nuestro Banco");
						crearCuenta();
						retirar();
					} else {
						retirar();

					}
					break;
				case "4":
					if (banco.isEmpty()) {
						System.out.println("Primero debes crear una cuenta en nuestro Banco");
						crearCuenta();
						eliminarCuenta();
					} else {
						eliminarCuenta();

					}

					break;
				case "5":
					if (banco.isEmpty()) {
						System.out.println("Primero debes crear una cuenta en nuestro Banco");
						crearCuenta();
						revisarEstado();
					} else {
						revisarEstado();
					}
					break;
				case "6":
					System.out.println("-" + mostrarGanancias());
					break;
				case "7":
					System.out.println("Hasta luego!!");
					break;
				default:
					System.out.println("Opción inválida.");
				}

			} catch (Exception e) {
				System.out.println("Ocurrió un error.");
			}

		} while (!eleccionUser.equals("7"));
	}

	private static void retirar() {
		// TODO Auto-generated method stub

	}

	private static String mostrarGanancias() {
		return null;

	}

	private static void revisarEstado() {// mostrar la cuenta simplemente

	}

	private static void eliminarCuenta() {

		if (cuenta instanceof Ahorro) {
		} else if (cuenta instanceof Vista) {

		}

	}

	private static void depositar() {
		boolean esDeposito = true;
		int cantidadDeposito = 0;
		System.out.println("¿A que cuenta quieres depositar? \n Corriente \nAhorro \nVista ");
		String AUXcuenta = SC.nextLine().toUpperCase();

		for (Cuenta cuenta : banco) {

			if (cuenta.nombreCuenta().equals(AUXcuenta)) {

				if (cuenta.sePuedeDepositar(cantidadDeposito)) {
					cuenta.depositoCuenta(cantidadDeposito);
				}
			}
		}

	}

	private static void crearCuenta() {
		int estadoSocial = RD.nextInt(1, 100); // RHS
		int numeroCuenta = RD.nextInt(1000000); // number cuenta

		System.out.println("Ingresa que cuenta deseas \n Corriente/Ahorro/Vista");
		String userCuenta = SC.nextLine();
		userCuenta = (userCuenta).toUpperCase();
		System.out.println("Genial, entonces ahora dime tu nombre");
		String userName = SC.nextLine();
		System.out.println("Ahora tu Rut");
		String userRUt = SC.nextLine();

		if (userCuenta.equals("CORRIENTE")) {
			Cuenta cuentaCorriente = new Corriente(userName, userRUt, estadoSocial, numeroCuenta);
			banco.add(cuentaCorriente);
		}

		else if (userCuenta.equals("AHORRO")) {
			Cuenta cuentaAhorro = new Ahorro(userName, userRUt, estadoSocial, numeroCuenta, 0);
			banco.add(cuentaAhorro);
		}

		else if (userCuenta.equals("VISTA")) {
			Cuenta cuentaVista = new Vista(userName, userRUt, estadoSocial, numeroCuenta, 0);
			banco.add(cuentaVista);
		}

		mostrarCuenta();

	}

	private static void mostrarCuenta() {
		System.out.println("=========================================");
		System.out.println("         ESTADO DE LA CUENTA             ");
		System.out.println("=========================================");

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
