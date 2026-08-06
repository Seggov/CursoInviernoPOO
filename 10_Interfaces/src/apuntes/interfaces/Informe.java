package apuntes.interfaces;

public class Informe implements Exportable {

    private String titulo;

    public Informe(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void exportarTxt() {
        System.out.println("Exportando informe: " + titulo + ".txt");
    }
}
