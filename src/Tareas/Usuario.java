package Tareas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Usuario implements Exportable {

    private String name;
    private List<Figura> figuras;

    public Usuario(String name) {
        this.name = name;
        this.figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public String getName() {
        return name;
    }

    @Override
    public void exportarTxt() {
        String archivo = "usuario_" + name.toLowerCase() + ".txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo))) {
            writer.println("Usuario: " + name);
            writer.println("Figuras:");

            for (Figura figura : figuras) {
                writer.println("- " + figura);
            }
        } catch (IOException e) {
            System.out.println("No se pudo exportar el usuario " + name + ": " + e.getMessage());
        }
    }
}
