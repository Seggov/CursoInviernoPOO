package Nodos;

import java.util.Scanner;

public class Main {

    private final Scanner SC = new Scanner(System.in);
    private final ListaDobleNexo lista = new ListaDobleNexo();

    public static void main(String[] args) {

        Main programa = new Main();
        programa.iniciar();
    }

    private void iniciar() {

        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {

                case 1:
                    insertarAlInicio();
                    break;

                case 2:
                    insertarAlFinal();
                    break;

                case 3:
                    System.out.println("\n--- PERSONAS ---");
                    System.out.println(lista.mostrarDatos());
                    break;

                case 4:
                    System.out.println(
                            "Cantidad de personas: " + lista.size()
                    );
                    break;

                case 5:
                    mostrarEstadoLista();
                    break;

                case 6:
                    buscarPersona();
                    break;

                case 7:
                    eliminarPersona();
                    break;

                case 8:
                    lista.vaciar();
                    System.out.println("La lista fue vaciada.");
                    break;

                case 9:
                    lista.sort();
                    System.out.println(
                            "La lista fue ordenada por nombre."
                    );
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 0);

        SC.close();
    }

    private void mostrarMenu() {

        System.out.println("\n========== MENÚ ==========");
        System.out.println("1. Insertar persona al inicio");
        System.out.println("2. Insertar persona al final");
        System.out.println("3. Mostrar personas");
        System.out.println("4. Mostrar cantidad de personas");
        System.out.println("5. Saber si la lista está vacía");
        System.out.println("6. Buscar persona por RUT");
        System.out.println("7. Eliminar persona por RUT");
        System.out.println("8. Vaciar lista");
        System.out.println("9. Ordenar por nombre");
        System.out.println("0. Salir");
        System.out.println("==========================");
    }

    private void insertarAlInicio() {

        Persona persona = solicitarPersona();
        Nodo nuevo = new Nodo(persona);

        lista.insertarInicio(nuevo);

        System.out.println("Persona insertada al inicio.");
    }

    private void insertarAlFinal() {

        Persona persona = solicitarPersona();
        Nodo nuevo = new Nodo(persona);

        lista.insertarFinal(nuevo);

        System.out.println("Persona insertada al final.");
    }

    private Persona solicitarPersona() {

        System.out.print("Ingrese nombre: ");
        String nombre = SC.nextLine();

        System.out.print("Ingrese RUT: ");
        String rut = SC.nextLine();

        return new Persona(nombre, rut);
    }

    private void mostrarEstadoLista() {

        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("La lista contiene personas.");
        }
    }

    private void buscarPersona() {

        System.out.print("Ingrese el RUT que desea buscar: ");
        String rut = SC.nextLine();

        Persona encontrada = lista.buscarRut(rut);

        if (encontrada == null) {
            System.out.println("No se encontró la persona.");
        } else {
            System.out.println("Persona encontrada:");
            System.out.println(encontrada);
        }
    }

    private void eliminarPersona() {

        System.out.print("Ingrese el RUT que desea eliminar: ");
        String rut = SC.nextLine();

        boolean eliminado = lista.eliminarPorRut(rut);

        if (eliminado) {
            System.out.println("Persona eliminada correctamente.");
        } else {
            System.out.println("No se encontró ese RUT.");
        }
    }

    private int leerEntero(String mensaje) {

        while (true) {

            try {
                System.out.print(mensaje);
                return Integer.parseInt(SC.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número entero.");
            }
        }
    }
}
