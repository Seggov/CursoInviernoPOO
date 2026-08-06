package apuntes.polimorfismo;

public class Gato extends Mascota {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hablando() {
        System.out.println(getNombre() + ": Miau");
    }
}
