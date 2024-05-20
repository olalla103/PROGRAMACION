package tema12.Resueltas.R16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Academico implements Comparable<Academico> {
    String nombre, fechaIngreso;
    LocalDate alta;

    public Academico(String nombre, String fechaIngreso) {
        this.nombre = nombre;

        // FORMATEO DE FECHA
        alta = LocalDate.parse(fechaIngreso, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.fechaIngreso = alta.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getAlta() {
        return alta;
    }

    public void setAlta(LocalDate alta) {
        this.alta = alta;
    }

    @Override
    public int compareTo(Academico o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
