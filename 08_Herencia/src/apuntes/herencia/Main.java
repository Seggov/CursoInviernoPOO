package apuntes.herencia;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Perro perro = new Perro("Firulais");
        Gato gato = new Gato("Garfield", true);

        perro.hablar();
        gato.hablar();

        perro.agregarAtencion(new Atencion(LocalDate.now(), 15000));
        perro.agregarAtencion(new Atencion(LocalDate.now(), 8000));

        System.out.println("Monto de " + perro.getNombre() + ": $" + perro.calcularMonto());
        System.out.println("Especie del gato: " + gato.getEspecie());
    }
}
