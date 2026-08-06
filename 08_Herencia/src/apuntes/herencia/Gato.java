package apuntes.herencia;

public class Gato extends Mascota {

    private boolean esNaranja;

    public Gato(String nombre, String especie, boolean esNaranja) {
        super(nombre, especie);
        this.esNaranja = esNaranja;
    }

    @Override
    public void hablando() {
        System.out.println("Miau en " + VETERINARIA);
    }

    public int esNaranjo() {
        int factor = esNaranja ? 1 : 0;
        return 200 * factor;
    }
}
