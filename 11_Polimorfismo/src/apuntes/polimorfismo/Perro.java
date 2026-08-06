package apuntes.polimorfismo;

public class Perro extends Mascota {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hablando() {
        System.out.println(getNombre() + ": Guau");
    }
}
