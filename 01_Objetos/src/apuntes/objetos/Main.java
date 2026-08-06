package apuntes.objetos;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniciar();
    }

    private void iniciar() {
        // Crear objetos o instancias a partir de la clase Persona.
        Persona persona1 = new Persona("Pedro", 21);
        Persona persona2 = new Persona("Ana", 20);

        persona1.mostrarDatos();
        System.out.println();
        persona2.mostrarDatos();

        // El objeto puede modificar su propio estado mediante un metodo.
        persona1.cumplirAnios();
        System.out.println();
        System.out.println(persona1.getNombre() + " ahora tiene " + persona1.getEdad() + " anios.");
    }
}
