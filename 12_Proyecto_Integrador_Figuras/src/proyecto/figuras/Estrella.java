package proyecto.figuras;

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
        // Pendiente: falta una regla geometrica completa para el area
        // segun como se defina la estrella en el ejercicio.
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * puntas * lado;
    }

    @Override
    public String toString() {
        return "Estrella [puntas=" + puntas + ", lado=" + lado
                + ", area=" + calcularArea()
                + ", perimetro=" + calcularPerimetro() + "]";
    }
}
