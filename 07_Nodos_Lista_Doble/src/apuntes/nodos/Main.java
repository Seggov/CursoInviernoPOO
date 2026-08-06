package apuntes.nodos;

public class Main {

    public static void main(String[] args) {
        ListaDobleNexo lista = new ListaDobleNexo();

        lista.insertarFinal(new Persona("Pedro", "22.222.222-2"));
        lista.insertarFinal(new Persona("Carla", "33.333.333-3"));
        lista.insertarInicio(new Persona("Ana", "11.111.111-1"));

        System.out.println("Conexiones:");
        lista.mostrarConexiones();

        System.out.println();
        System.out.println("Persona índice 1: " + lista.getI(1));
        System.out.println("Buscar RUT: " + lista.buscarRut("33.333.333-3"));

        lista.sort();
        System.out.println();
        System.out.println("Ordenada:");
        System.out.print(lista.mostrar());

        lista.invertir();
        System.out.println();
        System.out.println("Invertida:");
        lista.mostrarConexiones();
    }
}
