package tema12.Resueltas.R14;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Temperatura implements Comparable<Temperatura> {
    Double grados;
    LocalDateTime fechaHora;

    // ME QUEDO HACIENDO LA CLASE
    public Temperatura(Double grados) {
        this.grados = grados;
        this.fechaHora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "grados=" + grados +
                ", fechaHora=" + fechaHora +
                '}';
    }

    public Double getGrados() {
        return grados;
    }

    public void setGrados(Double grados) {
        this.grados = grados;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public int compareTo(Temperatura o) {
        return this.getGrados().compareTo(o.getGrados());
    }
}
