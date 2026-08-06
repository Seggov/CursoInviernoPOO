package apuntes.interfaces;

public class Main {
    public static void main(String[] args) {
        Informe informe = new Informe("Resultados del semestre");
        Factura factura = new Factura(1001);

        informe.exportar();
        factura.exportar();
    }
}
