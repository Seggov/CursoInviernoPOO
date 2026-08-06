package apuntes.nodos;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniciar();
    }

    private void iniciar() {
        ListaDobleNexo lista = new ListaDobleNexo();

        lista.insertarFinal(new Persona("22.222.222-2", "Pedro"));
        lista.insertarFinal(new Persona("33.333.333-3", "Carla"));
        lista.insertarInicio(new Persona("11.111.111-1", "Ana"));

        System.out.println("Conexiones iniciales:");
        lista.mostrarConexiones();

        System.out.println();
        System.out.println("Persona del indice 1: " + lista.getI(1));
        System.out.println("Buscar RUT: " + lista.buscarRut("33.333.333-3"));

        lista.sort();
        System.out.println();
        System.out.println("Ordenada:");
        System.out.print(lista.mostrar());

        lista.eliminarPorRut("22.222.222-2");
        System.out.println();
        System.out.println("Despues de eliminar a Pedro:");
        lista.mostrarConexiones();

        lista.invertir();
        System.out.println();
        System.out.println("Invertida:");
        lista.mostrarConexiones();
    }
}
