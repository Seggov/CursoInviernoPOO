package proyecto.figuras;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(4);
        Figura triangulo = new Triangulo(4, 3, 3, 5);
        Figura circulo = new Circunferencia(2);
        Figura estrella = new Estrella(5, 2);

        List<Figura> figuras = new ArrayList<>();
        figuras.add(cuadrado);
        figuras.add(triangulo);
        figuras.add(circulo);
        figuras.add(estrella);

        Usuario pedro = new Usuario("Pedro");
        pedro.agregarFigura(cuadrado);
        pedro.agregarFigura(triangulo);

        Calculadora calculadora = new Calculadora();

        // Polimorfismo: el ciclo trabaja con Figura sin preguntar la subclase concreta.
        for (Figura figura : figuras) {
            System.out.println(figura.getNombre());
            System.out.println("Área: " + calculadora.calcularArea(figura));
            System.out.println("Perímetro: " + calculadora.calcularPerimetro(figura));
            System.out.println();
        }

        // Interface: Usuario también sabe exportarse.
        pedro.exportarTxt();
    }
}
