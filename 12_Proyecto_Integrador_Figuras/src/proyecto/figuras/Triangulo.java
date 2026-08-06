package proyecto.figuras;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double ladoB;
    private double ladoC;

    public Triangulo(double base, double altura, double ladoB, double ladoC) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        return base + ladoB + ladoC;
    }

    @Override
    public String toString() {
        return "Triangulo [area=" + calcularArea()
                + ", perimetro=" + calcularPerimetro() + "]";
    }
}
