package Prueba_Resi;

public class Ruta {

    private String nombre;
    private ListaParaderos paraderos;

    public Ruta(String nombre, Paradero inicial) {

        this.nombre = nombre;
        this.paraderos = new ListaParaderos();

        paraderos.agregarFinal(inicial);
    }


    public String getNombre() {
        return nombre;
    }


    public void agregarParadero(Paradero p) {

        paraderos.agregarFinal(p);
    }


    public void mostrarRuta() {

        System.out.println("\nRuta: " + nombre);

        paraderos.mostrarParaderos();

        System.out.println("Cantidad: " + paraderos.cantidad());
    }


    public void invertirRuta() {

        paraderos.invertirLaRuta();
    }
}