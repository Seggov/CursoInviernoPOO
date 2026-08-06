package Tareas;

public class Estrella extends Figura {

    private int puntas;
    private double lado;

    public Estrella(int puntas, double lado) {
        super("Estrella");
        this.puntas = puntas;
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        // TODO: reemplazar por la formula que defina el ejercicio para la estrella.
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        // Una estrella de N puntas tiene 2*N lados en su contorno.
        return 2 * puntas * lado;
    }

    @Override
    public String toString() {
        return "Estrella [puntas=" + puntas + ", lado=" + lado
                + ", area=" + calcularArea() + ", perimetro=" + calcularPerimetro() + "]";
    }
}
