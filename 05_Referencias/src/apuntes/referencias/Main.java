package apuntes.referencias;

public class Main {

    public static void main(String[] args) {
        Persona original = new Persona("Pedro");

        // NO crea otro objeto. Ambas variables apuntan al mismo objeto.
        Persona mismaReferencia = original;

        mismaReferencia.setNombre("Pedro modificado");
        System.out.println("Original: " + original);
        System.out.println("Misma referencia: " + mismaReferencia);
        System.out.println("¿Mismo objeto? " + (original == mismaReferencia));

        // Aquí sí se crea un segundo objeto independiente.
        Persona copiaReal = new Persona(original.getNombre());
        copiaReal.setNombre("Copia independiente");

        System.out.println();
        System.out.println("Original después de cambiar la copia: " + original);
        System.out.println("Copia real: " + copiaReal);
        System.out.println("¿Mismo objeto? " + (original == copiaReal));
    }
}
