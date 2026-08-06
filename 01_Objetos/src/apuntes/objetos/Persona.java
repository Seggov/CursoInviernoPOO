package apuntes.objetos;

public class Persona {

    // Atributos: datos que pertenecen a cada objeto Persona.
    private String nombre;
    private int edad;

    // Constructor: se ejecuta cuando usamos new Persona(...).
    public Persona(String nombre, int edad) {
        // this.nombre = atributo del objeto actual.
        // nombre      = parametro recibido por el constructor.
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void cumplirAnios() {
        edad++;
    }
}
