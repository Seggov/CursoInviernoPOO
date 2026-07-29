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
			// Lectura Archivos
			lecturaEmpleados("empleados.csv");
			lecturaProyectos("proyectos.csv");
			lecturaDepartamentos("departamentos.csv");
		
			verificarContraValida();
			
			// Mostrar Departamentos de la Empresa
			System.out.println("DEPARTAMENTOS DE EMPRESA \n");
			mostrarDepartamentos();
			System.out.println("");
			// Mostrar todos los proyectos de la empresa.
			System.out.println("PROYECTOS DE EMPRESA \n");
			mostrarProyectosEmpresa();
			System.out.println("");

			System.out.println("Tienes que cambiar SI O SI EL SUELDO DE UN EMPLEADO ¿A quien eligues? \n ");
			mostrarRoles();
			cambiarSueldo();
			} 
		// ESCEPCIONES  - MANEJO DE ERRORES
		catch (FileNotFoundException e) {
			System.out.println("ERORR DE ARCHIVOS CSV");}
		

	}
	// ID,Nombre,Jefe_ID,Empleados_ID
	// ID,Nombre,Jefe_ID,Empleados_ID

	private void cambiarSueldo() {
		
	}

	private void mostrarRoles() {
		for (int i = 0; i < lista_Trabajadores.length; i++) {
			if (lista_Trabajadores[i]==null) {
				continue;
			}
			
			System.out.println(lista_Trabajadores[i].getID()+"- "+lista_Trabajadores[i].getPuesto()+" sueldo actual |"+lista_Trabajadores[i].getSueldo()+" Hora|");
			
			
		}
	}
		
		
	

	private void mostrarProyectosEmpresa() {
		
		for (int i = 0; i < lista_Proyectos.length; i++) {
			if (lista_Proyectos[i]==null) {
				continue;
			}
			
			System.out.println(lista_Proyectos[i].getId()+"- "+lista_Proyectos[i].getNombre());
			
			
		}
		
	}

	private void mostrarDepartamentos() {
		
		for (int i = 0; i < lista_departamentos.length; i++) {
			if (lista_departamentos[i]==null) {
				continue;
			}
			System.out.println(lista_departamentos[i].getId()+"- "+lista_departamentos[i].getNombre());
		}
	}

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
	
	
	

	private void lecturaProyectos(String ruta) throws FileNotFoundException {

	    File file = new File(ruta);
	    Scanner entrada = new Scanner(file);
	    int contador = 0;

	    while (entrada.hasNextLine()) {

	        String linea = entrada.nextLine();
	        String[] partes = linea.split(",");

	        int id = Integer.parseInt(partes[0]);
	        String nombre = partes[1];
	        double presupuestoProyecto = Double.parseDouble(partes[2]);

	        int liderProyecto = Integer.parseInt(partes[3]);

	        int empleadosProyectos = Integer.parseInt(partes[4].replace("\"", ""));
	        
	        Proyectos proyecto = new Proyectos(
	                id,
	                nombre,
	                presupuestoProyecto,
	                liderProyecto,
	                empleadosProyectos
	        );

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
	        
	        Trabajador trabajador = new Trabajador(
	            id, nombre, rol, sueldo, esJefe, esLider
	        );

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
