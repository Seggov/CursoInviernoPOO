package Apuntes.Objetos;

public class Objetos {

    public static void main(String[] args) {
        Objetos programa = new Objetos();
        programa.iniciar();
    }

    private void iniciar() {

        // Crear objetos o instancias
        Persona persona1 = new Persona("Pedro", 21);
        Persona persona2 = new Persona("Ana", 20);

        persona1.mostrarDatos();
        persona2.mostrarDatos();
    }
}