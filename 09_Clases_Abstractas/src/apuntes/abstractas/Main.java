package apuntes.abstractas;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(4);
        Circulo circulo = new Circulo(2);

        cuadrado.mostrarResumen();
        System.out.println();
        circulo.mostrarResumen();
    }
}
