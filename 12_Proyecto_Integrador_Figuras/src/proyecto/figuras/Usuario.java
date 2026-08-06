package proyecto.figuras;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Usuario implements Exportable {
    private String nombre;
    private List<Figura> figuras = new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void exportarTxt() {
        String archivo = "usuario_" + nombre.toLowerCase() + ".txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo))) {
            writer.println("Usuario: " + nombre);
            writer.println("Figuras:");
            for (Figura figura : figuras) {
                writer.println("- " + figura);
            }
        } catch (IOException e) {
            System.out.println("No se pudo exportar el usuario " + nombre + ": " + e.getMessage());
        }
    }
}
