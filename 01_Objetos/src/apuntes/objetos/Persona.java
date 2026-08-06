package apuntes.objetos;

public class Persona {

    // private protege los datos para que se modifiquen desde métodos controlados.
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        // this.nombre = atributo del objeto.
        // nombre      = parámetro recibido.
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
