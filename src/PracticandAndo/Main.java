package PracticandAndo;

/*
 * Conectar nodo1 con nodo2.
 * Conectar nodo2 con nodo3.
 *Usar sig para imprimir desde Pedro hasta Juan. 
 *Después, desde nodo3, usar prev para imprimir Juan → Ana → Pedro.
 * 
 */
public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona("Pedro", "111", 0);
        Persona p2 = new Persona("Ana", "222", 0);
        Persona p3 = new Persona("Juan", "333", 0);

        ListaNodos lista = new ListaNodos();


        lista.agregarFinal(p1);
        lista.agregarFinal(p2);
        lista.agregarFinal(p3);


        System.out.println("Hacia adelante:");

        lista.mostrarAdelante();


        System.out.println("\nHacia atrás:");

        lista.mostrarAtras();
    }
}