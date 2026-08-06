package apuntes.interfaces;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniciar();
    }

    private void iniciar() {
        Informe informe = new Informe("Resultados del semestre");
        Factura factura = new Factura(1001);

        informe.exportarTxt();
        factura.exportarTxt();

        System.out.println();
        ejecutarExportacion(informe);
        ejecutarExportacion(factura);
    }

    private void ejecutarExportacion(Exportable elemento) {
        System.out.print("Desde una referencia Exportable -> ");
        elemento.exportarTxt();
    }
}
