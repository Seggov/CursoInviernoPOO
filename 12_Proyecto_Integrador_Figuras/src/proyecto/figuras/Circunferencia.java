package proyecto.figuras;

public class Circunferencia extends Figura {
    private double radio;

    public Circunferencia(double radio) {
        super("Circunferencia");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circunferencia [radio=" + radio + ", area=" + calcularArea()
                + ", perimetro=" + calcularPerimetro() + "]";
    }
}
