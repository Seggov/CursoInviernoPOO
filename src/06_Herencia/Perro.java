package Apuntes.Herencia;

public class Perro extends Mascota {

    public Perro(String nombre, String especie) {
        super(nombre, especie);
    }

    @Override
    public void hablando() {
        System.out.println("Ladrando en " + VETERINARIA);
    }

}