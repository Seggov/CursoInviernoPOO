package apuntes.herencia;

import java.util.ArrayList;
import java.util.List;

public class Mascota {

    protected static final String VETERINARIA = "Los UCNIN";

    private String nombre;
    private String especie;
    private List<Atencion> atenciones = new ArrayList<>();

    public Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public void hablar() {
        System.out.println("La mascota hace un sonido");
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void agregarAtencion(Atencion atencion) {
        atenciones.add(atencion);
    }

    public int calcularMonto() {
        int total = 0;
        for (Atencion atencion : atenciones) {
            total += atencion.getMonto();
        }
        return total;
    }
}
