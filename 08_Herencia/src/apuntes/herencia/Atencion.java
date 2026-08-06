package apuntes.herencia;

import java.util.Date;

public class Atencion {

    private Date fecha;
    private int monto;
    private Mascota mascota;

    public Atencion(Date fecha, int monto, Mascota mascota) {
        this.fecha = fecha;
        this.monto = monto;
        this.mascota = mascota;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getMonto() {
        return monto;
    }

    public Mascota getMascota() {
        return mascota;
    }
}
