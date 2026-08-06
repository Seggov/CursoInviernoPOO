package proyecto.figuras;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public abstract class Figura implements Exportable {

    private List<Punto> puntos = new ArrayList<>();
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPunto(Punto punto) {
        puntos.add(punto);
    }

    public List<Punto> getPuntos() {
        return puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    @Override
    public void exportarTxt() {
        String archivo = nombre.toLowerCase() + ".txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo))) {
            writer.println(this);
        } catch (IOException e) {
            System.out.println("No se pudo exportar " + nombre + ": " + e.getMessage());
        }
    }
}
