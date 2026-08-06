package apuntes.abstractas;

public abstract class Figura {

    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // No tiene cuerpo: cada figura concreta debe decidir cómo calcularlo.
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    // Método normal compartido por todas las hijas.
    public void mostrarResumen() {
        System.out.println(nombre);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
