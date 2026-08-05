package Ayudantia6;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.util.ArrayList;
import java.util.Scanner;


public class App {

	public static void main(String[] args) throws FileNotFoundException {
		App programa = new App();
		programa.iniciar();
	}
	
	
	private ArrayList<String> listaAimento = new ArrayList<>();
	
	private void iniciar() throws FileNotFoundException {

		lecturaAchivos("pedidos.txt");
		
	}
	

	
	
	
	private void lecturaAchivos(String name) throws FileNotFoundException {
		// El do ejecuta el código primero, y después el while pregunta: “¿sigo
		// repitiendo?”
		
		try {
			int aux = 0;
			do {
				Scanner SC = new Scanner(System.in);
				menu();
				int aux_usuario = SC.nextInt();
				aux=aux_usuario;
				
				if (aux==1) {
					procesarPedido(SC);
					mostrarPedidos();
				}
				else if (aux==2) {
					borrarPedido();
				}
				
				SC.close();
			} while (!(aux == 3));
			
			
			
			
			File archivo = new File(name);
			Scanner lecturaArchivos = new Scanner(archivo);
			String linea = lecturaArchivos.nextLine();
			int cantidadElementos = 0;
			while (lecturaArchivos.hasNextLine()) {
				
				String[] partes = linea.split(";");
				String hora = partes[0];
				String auxdos = partes[1];
				String[] partesdos = auxdos.split(",");
				
				
				cantidadElementos = cantidadElementos(partesdos);
						
				guardarElementos(partesdos); 
				
				
				
				
				// 12.50;hamburguesa,papas,fanta
			}
			
		} catch (FileNotFoundException e) {
			
		}
		
		
	}
	

	private void borrarPedido() {
		System.out.println("Borrando .. ");
		listaAimento.remove(-1);
	}





	private boolean procesarPedido(Scanner sC) {
		mostrarPedidos();
		System.out.println("= ¿Confirmas? = \n (1) si \n (2) no");
		String auz_b = sC.nextLine();
		if (auz_b=="1") {
			return false;
		}
		return true;
		
	}





	private void mostrarPedidos() {
		// TODO Auto-generated method stub
		
	}





	private void menu() {
		System.out.println("=== SISTEMA DE PEDIDOS ===");
		System.out.println("Pedidos pendientes: 5");
		System.out.println("Pedidos procesados: 0");
		System.out.println("1. Procesar siguiente pedido");
		System.out.println("2. Deshacer ultimo pedido");
		System.out.println("3. Salir");

		
	}

	private void guardarElementos(String[] partesdos) {
		for (int i = 0; i < partesdos.length; i++) {
			
			listaAimento.add(partesdos[i]);
		}
	}


	private int cantidadElementos(String[] partesdos) {
		int auxContador = 0;
		for (int i = 0; i < partesdos.length; i++) {
			auxContador++;
		}
		return auxContador;
	}

}
