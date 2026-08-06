package apuntes.interfaces;

public class Informe implements Exportable {
    private String titulo;

    public Informe(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void exportar() {
        System.out.println("Exportando informe: " + titulo);
    }
}
