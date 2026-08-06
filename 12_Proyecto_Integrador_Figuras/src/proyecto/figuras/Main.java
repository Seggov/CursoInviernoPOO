package proyecto.figuras;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        programa.inciarCiclo();
    }

    public void inciarCiclo() {
        Figura cuadrado = new Cuadrado(4);
        Figura triangulo = new Triangulo(4, 3, 3, 5);
        Figura circulo = new Circunferencia(2);
        Figura estrella = new Estrella(5, 2);

        List<Figura> figuras = new ArrayList<>();
        figuras.add(cuadrado);
        figuras.add(triangulo);
        figuras.add(circulo);
        figuras.add(estrella);

        Usuario userA = new Usuario("Pedro");
        Usuario userB = new Usuario("Vale");
        Usuario userC = new Usuario("Antonio");

        userA.agregarFigura(triangulo);
        userB.agregarFigura(cuadrado);
        userC.agregarFigura(circulo);
        userC.agregarFigura(estrella);

        Calculadora calculadora = new Calculadora();

        // Polimorfismo: el mismo ciclo trabaja con cualquier Figura.
        for (Figura figura : figuras) {
            System.out.println(figura.getNombre());
            System.out.println("Area: " + calculadora.calcularArea(figura));
            System.out.println("Perimetro: " + calculadora.calcularPerimetro(figura));
            System.out.println();
        }

        // Interfaces: tanto Usuario como Figura implementan Exportable.
        Exportable exportable = userA;
        exportable.exportarTxt();

        System.out.println("Se exporto el usuario " + userA.getName() + ".");
    }
}
