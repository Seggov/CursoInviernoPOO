package apuntes.herencia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    private List<Mascota> mascotas = new ArrayList<>();

    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniciar();
    }

    private void iniciar() {
        Perro perro = new Perro("Firulais", "Perro");
        Gato gato = new Gato("Garfield", "Gato", true);

        perro.hablando();
        gato.hablando();

        mascotas.add(perro);
        mascotas.add(gato);

        perro.agregarAtencion(new Atencion(new Date(), 15000, perro));
        perro.agregarAtencion(new Atencion(new Date(), 8000, perro));
        gato.agregarAtencion(new Atencion(new Date(), 12000, gato));

        System.out.println();
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota mascota = mascotas.get(i);
            int monto = mascota.calcularMonto();
            System.out.println(mascota.getNombre() + " | Total atenciones: $" + monto);
        }

        System.out.println("Valor extra del gato naranja: " + gato.esNaranjo());
    }
}
