package apuntes.linkedlist;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniciar();
    }

    private void iniciar() {
        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Sofia");
        System.out.println("Inicial: " + nombres);

        nombres.addFirst("Juan");
        nombres.addLast("Carlos");
        System.out.println("Con inicio y final: " + nombres);

        nombres.remove("Ana");
        System.out.println("Sin Ana: " + nombres);

        System.out.println("Primero: " + nombres.getFirst());
        System.out.println("Ultimo: " + nombres.getLast());
        System.out.println("Cantidad: " + nombres.size());
        System.out.println("Contiene Pedro: " + nombres.contains("Pedro"));
    }
}
