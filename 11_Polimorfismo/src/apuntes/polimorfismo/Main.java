package apuntes.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Perro("Firulais"));
        mascotas.add(new Gato("Garfield"));
        mascotas.add(new Perro("Toby"));

        // El mismo código funciona con todos los tipos de Mascota.
        for (Mascota mascota : mascotas) {
            mascota.hablar();
        }
    }
}
