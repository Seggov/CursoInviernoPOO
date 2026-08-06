package apuntes.interfaces;

public class Factura implements Exportable {
    private int numero;

    public Factura(int numero) {
        this.numero = numero;
    }

    @Override
    public void exportar() {
        System.out.println("Exportando factura N° " + numero);
    }
}
