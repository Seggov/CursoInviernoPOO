package proyecto.figuras;

public class Calculadora {

    public double calcularArea(Figura figura) {
        return figura.calcularArea();
    }

    public double calcularPerimetro(Figura figura) {
        return figura.calcularPerimetro();
    }

    public boolean verificarSiCabe(Figura figuraA, Figura figuraB) {
        // Pendiente: se necesita una regla geométrica concreta del ejercicio.
        return false;
    }
}
