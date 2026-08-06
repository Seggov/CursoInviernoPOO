package Apuntes.MinimoNodos;

public class Main {

    public static void main(String[] args) {

        ListaDobleNexo lista = new ListaDobleNexo();

        Persona persona1 = new Persona(
                "Ana",
                "11.111.111-1"
        );

        Persona persona2 = new Persona(
                "Pedro",
                "22.222.222-2"
        );

        Persona persona3 = new Persona(
                "Carla",
                "33.333.333-3"
        );

        Nodo nodo1 = new Nodo(persona1);
        Nodo nodo2 = new Nodo(persona2);
        Nodo nodo3 = new Nodo(persona3);

        lista.insertarFinal(nodo1);
        lista.insertarFinal(nodo2);
        lista.insertarFinal(nodo3);

        lista.mostrarDatos();
    }
}
