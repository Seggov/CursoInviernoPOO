package Prueba_Resi;

import java.util.Random;

public class SistemaRutas {

    private final Random RD = new Random();

    public void iniciar() {

        // Paradero común
        Paradero p1 = new Paradero("Los Bomberos", 0);

        // Paraderos con rutas aleatorias
        Paradero p2 = new Paradero("Mall", RD.nextInt(3) + 1);
        Paradero p3 = new Paradero("Hospital", RD.nextInt(3) + 1);
        Paradero p4 = new Paradero("Universidad", RD.nextInt(3) + 1);
        Paradero p5 = new Paradero("Terminal", RD.nextInt(3) + 1);
        Paradero p6 = new Paradero("Plaza", RD.nextInt(3) + 1);
        Paradero p7 = new Paradero("Municipalidad", RD.nextInt(3) + 1);
        Paradero p8 = new Paradero("Estadio", RD.nextInt(3) + 1);
        Paradero p9 = new Paradero("Aeropuerto", RD.nextInt(3) + 1);
        Paradero p10 = new Paradero("Supermercado", RD.nextInt(3) + 1);


        // Creamos las rutas
        Ruta ruta1 = new Ruta("Ruta 1", p1);
        Ruta ruta2 = new Ruta("Ruta 2", p1);
        Ruta ruta3 = new Ruta("Ruta 3", p1);


        // Vinculamos los paraderos
        guardarParadero(p2, ruta1, ruta2, ruta3);
        guardarParadero(p3, ruta1, ruta2, ruta3);
        guardarParadero(p4, ruta1, ruta2, ruta3);
        guardarParadero(p5, ruta1, ruta2, ruta3);
        guardarParadero(p6, ruta1, ruta2, ruta3);
        guardarParadero(p7, ruta1, ruta2, ruta3);
        guardarParadero(p8, ruta1, ruta2, ruta3);
        guardarParadero(p9, ruta1, ruta2, ruta3);
        guardarParadero(p10, ruta1, ruta2, ruta3);


        // Mostrar rutas
        ruta1.mostrarRuta();
        ruta2.mostrarRuta();
        ruta3.mostrarRuta();


        // Ejemplo invertir Ruta 1
        System.out.println("\n--- RUTA 1 INVERTIDA ---");

        ruta1.invertirRuta();

        ruta1.mostrarRuta();
    }


    private void guardarParadero(
            Paradero p,
            Ruta ruta1,
            Ruta ruta2,
            Ruta ruta3) {

        int identificador = p.getId();

        switch (identificador) {

        case 1:
            ruta1.agregarParadero(p);
            break;

        case 2:
            ruta2.agregarParadero(p);
            break;

        case 3:
            ruta3.agregarParadero(p);
            break;
        }
    }
}