package apuntes.herencia;

public class Perro extends Mascota {

    public Perro(String nombre) {
        // super llama al constructor de Mascota.
        super(nombre, "Perro");
    }

    @Override
    public void hablar() {
        System.out.println("Guau desde " + VETERINARIA);
    }
}
