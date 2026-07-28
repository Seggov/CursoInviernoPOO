package Ayudantia2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sistema {
	
	
	
	private Trabajador[] lista_Trabajadores = new Trabajador[100];
	private Departamentos[] lista_departamentos = new Departamentos[100];
	private Proyectos[] lista_Proyectos = new Proyectos[100];
	
	
	private String CONTRA = "17";
	
	
	public void Iniciar() {

		try {
			
			lecturaEmpleados("empleados.csv");
			lecturaProyectos("proyectos.csv");
			lecturaDepartamentos("departamentos.csv");
			verificarContraValida();
			
			
			
			
			String name = entradaUsuario();
			
			} 
		// ESCEPCIONES  - MANEJO DE ERRORES
		catch (FileNotFoundException e) {
			System.out.println("ERORR DE ARCHIVOS CSV");}
		catch (Exception e) {
			
		} 

	}
	// ID,Nombre,Jefe_ID,Empleados_ID
	// ID,Nombre,Jefe_ID,Empleados_ID

	private boolean verificarContraValida() {
		return false;
		
	}

	private void lecturaDepartamentos(String ruta)
	        throws FileNotFoundException {

	    File file = new File(ruta);
	    Scanner entrada = new Scanner(file);
	    int contador = 0;

	    while (entrada.hasNextLine()) {

	        String linea = entrada.nextLine();
	        String[] partes =linea.split(",");

	        int id = Integer.parseInt(partes[0]);
	        String nombre = partes[1];
	        int jefeDepartamento = Integer.parseInt(partes[2]);

	        int empleadosDepartamento =Integer.parseInt(partes[3].replace("\"", ""));

	        Departamentos departamento = new Departamentos(id,nombre,jefeDepartamento,empleadosDepartamento);
	        
	        lista_departamentos[contador] = departamento;
	        contador++;
	    }

	    entrada.close();
	}
	
	
	

	private void lecturaProyectos(String string) throws FileNotFoundException {
		File file = new File(string);
		Scanner entrada = new Scanner(file);		
	}

	private void lecturaEmpleados(String string) throws FileNotFoundException {
		
		File file = new File(string);
		Scanner entrada = new Scanner(file);
		int contador = 0;
		
		while (entrada.hasNextLine()) {
			String linea = entrada.nextLine();
			String[] partes = linea.split(";");

			int id = Integer.parseInt(partes[0]); // id
			String nombre = partes[1]; // nombre
			String rol = partes[2]; // rut
			int sueldo = Integer.parseInt(partes[3]); // sueldo
			String aux_jefe = partes[4];
			String aux_lider = partes[5];
			
			boolean esJefe = false; boolean esLider = false;
			
			if (aux_jefe.equals("true")) {
				esJefe = true;
			} else {
				esJefe = false;
			}
			if (aux_lider.equals("true")) {
				esLider = true;
			} else {
				esLider = false;
			}
			
			Trabajador trabajadores = new Trabajador(id,nombre,rol,sueldo,esJefe,esLider);
			lista_Trabajadores[contador] = trabajadores;
			contador++;
		}
	}
	
	
	
	
	private String entradaUsuario() {
		System.out.println("Ingresa el nombre que quieres buscar: ");
		return null;

	}

}
