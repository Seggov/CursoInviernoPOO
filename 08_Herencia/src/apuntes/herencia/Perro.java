package apuntes.herencia;

public class Perro extends Mascota {

    public Perro(String nombre, String especie) {
        // super(...) ejecuta el constructor de Mascota.
        super(nombre, especie);
    }

    @Override
    public void hablando() {
        System.out.println("Ladrando en " + VETERINARIA);
    }
}
