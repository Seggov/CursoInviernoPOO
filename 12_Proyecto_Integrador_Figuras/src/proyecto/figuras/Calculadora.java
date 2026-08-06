package proyecto.figuras;

public class Calculadora {

    public double calcularArea(Figura figura) {
        return figura.calcularArea();
    }

    public double calcularPerimetro(Figura figura) {
        return figura.calcularPerimetro();
    }

    public boolean verificarSiCabe(Figura figuraA, Figura figuraB) {
        // Se conserva como pendiente porque comparar solamente las areas
        // no demuestra geometricamente que una figura quepa dentro de otra.
        return false;
    }
}
