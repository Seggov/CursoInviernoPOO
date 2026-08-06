package apuntes.herencia;

public class Gato extends Mascota {

    private boolean esNaranja;

    public Gato(String nombre, boolean esNaranja) {
        super(nombre, "Gato");
        this.esNaranja = esNaranja;
    }

    @Override
    public void hablar() {
        System.out.println("Miau desde " + VETERINARIA);
    }

    public boolean isEsNaranja() {
        return esNaranja;
    }
}
