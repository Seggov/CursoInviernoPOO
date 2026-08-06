package apuntes.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniciar();
    }

    private void iniciar() {
        List<Mascota> mascotas = new ArrayList<>();

        mascotas.add(new Perro("Firulais"));
        mascotas.add(new Gato("Garfield"));
        mascotas.add(new Perro("Toby"));

        // Todas se guardan como Mascota, pero Java ejecuta
        // el metodo del objeto real: Perro o Gato.
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota mascota = mascotas.get(i);
            mascota.hablando();
        }
    }
}
