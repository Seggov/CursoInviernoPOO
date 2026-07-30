package Ayudantia2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Sistema {

	private Trabajador[] lista_Trabajadores = new Trabajador[100];
	private Departamentos[] lista_departamentos = new Departamentos[100];
	private Proyectos[] lista_Proyectos = new Proyectos[100];
	private final Scanner ENTRADA = new Scanner(System.in);

	private String CONTRA = "17";

	public void Iniciar() {

		try {
			System.out.println("Antes de nada necesitamos comprobar la seguridad. Ingresa tu clave:");
			String aux_contra = ENTRADA.nextLine();
			if (esCorrecto(aux_contra)) {

				lecturaEmpleados("empleados.csv");
				lecturaProyectos("proyectos.csv");
				lecturaDepartamentos("departamentos.csv");

				mostrarDepartamentos();
				mostrarProyectosEmpresa();

				while (esCambiar()) {

					mostrarRoles();

					System.out.println("Indica el ID del empleado:");
					int id = Integer.parseInt(ENTRADA.nextLine());

					System.out.println("Indica el nuevo sueldo:");
					double nuevoSueldo = Double.parseDouble(ENTRADA.nextLine());

					while (esNegativo(nuevoSueldo)) {
						System.out.println("Error: el sueldo no puede ser negativo.");

						nuevoSueldo = Double.parseDouble(ENTRADA.nextLine());
					}

					cambiarSueldo(id, nuevoSueldo);

					System.out.println("Sueldo actualizado.");
					mostrarRoles();
				}

				System.out.println("Ingrese el nombre completo del empleado:");

				String nombreEmpleado = ENTRADA.nextLine();
				buscarEmpleado(nombreEmpleado);

			} else {
				System.out.println("Contraseña incorrecta.");
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error: no se encontraron los archivos CSV.");
		}
		ENTRADA.close();
	}

	private boolean esCorrecto(String password) {
		return password.equals(CONTRA);
	}

	private void buscarEmpleado(String entradaEmpleado) {
		int aux_identificador = 0;
		String aux_departamento = "";
		String aux_proyectos = "";
		for (int i = 0; i < lista_Trabajadores.length; i++) {
			String auxNOMBRE_trabajador = lista_Trabajadores[i].getNombre();

			if (auxNOMBRE_trabajador.equals(entradaEmpleado)) {
				aux_identificador = lista_Trabajadores[i].getID();
			}
		}

		for (int i = 0; i < lista_Proyectos.length; i++) {
			int[] aux_lista = lista_Proyectos[i].getEmpleadosProyectos();
			for (int j = 0; j < aux_lista.length; j++) {
				if (aux_identificador == aux_lista[j]) {
					aux_proyectos = lista_Proyectos[i].getNombre();
				}
			}
		}

		for (int i = 0; i < lista_departamentos.length; i++) {
			int[] aux_lista = lista_departamentos[i].getEmpleadoDepartamento();
			for (int j = 0; j < aux_lista.length; j++) {
				if (aux_identificador == aux_lista[j]) {
					aux_departamento = lista_departamentos[i].getNombre();
				}
			}

		}

	}

	private boolean esNegativo(double usuarioNuevoSueldo) {
		if (usuarioNuevoSueldo > 0.1) {
			return false;
		}
		return true;
	}

	private boolean esCambiar() {
		System.out.println("¿Quieres cambiar un sueldo?\n(1) Si\n(2) No");
		String opcion = ENTRADA.nextLine();
		return opcion.equals("1");
	}
	// ID,Nombre,Jefe_ID,Empleados_ID
	// ID,Nombre,Jefe_ID,Empleados_ID

	private void cambiarSueldo(int identificador, double sueldoNuevo) {

		for (int i = 0; i < lista_Trabajadores.length; i++) {
			if (lista_Trabajadores[i] == null) {
				continue;
			} else if ((lista_Trabajadores[i].getID()) == (identificador)) {
				lista_Trabajadores[i].setSueldo(sueldoNuevo);
			}
		}
	}

	private void mostrarRoles() {
		for (int i = 0; i < lista_Trabajadores.length; i++) {
			if (lista_Trabajadores[i] == null) {
				continue;
			}

			System.out.println(lista_Trabajadores[i].getID() + "- " + lista_Trabajadores[i].getPuesto()
					+ " sueldo actual |" + lista_Trabajadores[i].getSueldo() + " Hora|");

		}
	}

	private void mostrarProyectosEmpresa() {

		for (int i = 0; i < lista_Proyectos.length; i++) {
			if (lista_Proyectos[i] == null) {
				continue;
			}

			System.out.println(lista_Proyectos[i].getId() + "- " + lista_Proyectos[i].getNombre());

		}

	}

	private void mostrarDepartamentos() {

		for (int i = 0; i < lista_departamentos.length; i++) {
			if (lista_departamentos[i] == null) {
				continue;
			}
			System.out.println(lista_departamentos[i].getId() + "- " + lista_departamentos[i].getNombre());
		}
	}

	private boolean verificarContraValida() {
		return false;

	}

	private void lecturaDepartamentos(String ruta) throws FileNotFoundException {

		File file = new File(ruta);
		Scanner entrada = new Scanner(file);
		int contador = 0;
		int[] listaEmpleadosDepartamentos = new int[10];

		while (entrada.hasNextLine()) {

			String linea = entrada.nextLine();
			String[] partes = linea.split(",");

			int id = Integer.parseInt(partes[0]);
			String nombre = partes[1];
			int jefeDepartamento = Integer.parseInt(partes[2]);

			int empleadosDepartamento = Integer.parseInt(partes[3].replace("\"", ""));
			listaEmpleadosDepartamentos[contador] = empleadosDepartamento;

			Departamentos departamento = new Departamentos(id, nombre, jefeDepartamento, listaEmpleadosDepartamentos);

			lista_departamentos[contador] = departamento;
			contador++;
		}

		entrada.close();
	}

	private void lecturaProyectos(String ruta) throws FileNotFoundException {

		File file = new File(ruta);
		Scanner entrada = new Scanner(file);
		int contador = 0;
		int[] listaEmpleadosProyecto = new int[10];
		;
		while (entrada.hasNextLine()) {

			String linea = entrada.nextLine();
			String[] partes = linea.split(",");

			int id = Integer.parseInt(partes[0]);
			String nombre = partes[1];
			double presupuestoProyecto = Double.parseDouble(partes[2]);

			int liderProyecto = Integer.parseInt(partes[3]);

			int empleadosProyectos = Integer.parseInt(partes[4].replace("\"", ""));

			listaEmpleadosProyecto[contador] = empleadosProyectos;
			Proyectos proyecto = new Proyectos(id, nombre, presupuestoProyecto, liderProyecto, listaEmpleadosProyecto);

			lista_Proyectos[contador] = proyecto;
			contador++;
		}
		entrada.close();
	}

	private void lecturaEmpleados(String ruta) throws FileNotFoundException {

		File file = new File(ruta);
		Scanner entrada = new Scanner(file);
		int contador = 0;

		entrada.nextLine();

		while (entrada.hasNextLine()) {
			String linea = entrada.nextLine();
			String[] partes = linea.split(",");

			int id = Integer.parseInt(partes[0]);
			String nombre = partes[1];
			String rol = partes[2];

			int sueldo = (int) Double.parseDouble(partes[3]);

			boolean esJefe = Boolean.parseBoolean(partes[4]);
			boolean esLider = Boolean.parseBoolean(partes[5]);

			Trabajador trabajador = new Trabajador(id, nombre, rol, sueldo, esJefe, esLider);

			lista_Trabajadores[contador] = trabajador;
			contador++;
		}

		entrada.close();
	}

	private String entradaUsuario() {
		System.out.println("Ingresa el nombre que quieres buscar: ");
		return null;

	}

}
