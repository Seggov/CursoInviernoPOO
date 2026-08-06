package Tareas;

public class Calculadora {

    public double calcularArea(Figura figura) {
        return figura.calcularArea();
    }

    public double calcularPerimetro(Figura figura) {
        return figura.calcularPerimetro();
    }

    public boolean verificarSiCabe(Figura figuraA, Figura figuraB) {
        // TODO: esta comparacion depende de la geometria real y de los puntos.
        // Se deja pendiente para no afirmar que comparar solo areas significa "caber".
        return false;
    }
}
