package apuntes.herencia;

import java.time.LocalDate;

public class Atencion {
    private LocalDate fecha;
    private int monto;

    public Atencion(LocalDate fecha, int monto) {
        this.fecha = fecha;
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getMonto() {
        return monto;
    }
}
