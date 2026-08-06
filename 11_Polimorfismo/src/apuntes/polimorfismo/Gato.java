package apuntes.polimorfismo;

public class Gato extends Mascota {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hablar() {
        System.out.println(getNombre() + ": Miau");
    }
}
