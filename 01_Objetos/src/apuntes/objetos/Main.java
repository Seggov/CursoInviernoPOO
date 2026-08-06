package apuntes.objetos;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniciar();
    }

    private void iniciar() {
        // Crear objetos o instancias.
        Persona persona1 = new Persona("Pedro", 21);
        Persona persona2 = new Persona("Ana", 20);

        persona1.mostrarDatos();
        System.out.println();
        persona2.mostrarDatos();

        // Nueva funcionalidad: el propio objeto cambia su edad.
        persona1.cumplirAnios();
        System.out.println();
        System.out.println("Después del cumpleaños: " + persona1.getEdad());
    }
}
