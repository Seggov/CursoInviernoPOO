package apuntes.referencias;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniciar();
    }

    private void iniciar() {
        Persona original = new Persona("Pedro", 21);

        // NO crea otra Persona.
        // Las dos variables apuntan al mismo objeto.
        Persona mismaReferencia = original;

        mismaReferencia.setEdad(22);

        System.out.println("Original: " + original);
        System.out.println("Misma referencia: " + mismaReferencia);
        System.out.println("Mismo objeto: " + (original == mismaReferencia));

        // Aqui si se crea un objeto nuevo e independiente.
        Persona copiaReal = new Persona(original.getNombre(), original.getEdad());
        copiaReal.setNombre("Copia de Pedro");

        System.out.println();
        System.out.println("Original: " + original);
        System.out.println("Copia real: " + copiaReal);
        System.out.println("Mismo objeto: " + (original == copiaReal));
    }
}
