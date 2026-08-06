package apuntes.abstractas;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniciar();
    }

    private void iniciar() {
        Cuadrado cuadrado = new Cuadrado(4);
        Circulo circulo = new Circulo(2);

        cuadrado.mostrarResumen();
        System.out.println();
        circulo.mostrarResumen();

        // Esto NO seria valido:
        // Figura figura = new Figura("Figura");
    }
}
