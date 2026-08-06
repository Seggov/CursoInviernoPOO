package apuntes.abstractas;

public abstract class Figura {

    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Metodo abstracto: se declara, pero no tiene cuerpo aqui.
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    // Metodo normal: todas las figuras lo heredan ya implementado.
    public void mostrarResumen() {
        System.out.println(nombre);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}
