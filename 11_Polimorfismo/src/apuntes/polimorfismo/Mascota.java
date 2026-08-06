package apuntes.polimorfismo;

public class Mascota {

    private String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void hablando() {
        System.out.println(nombre + " hace un sonido");
    }
}
