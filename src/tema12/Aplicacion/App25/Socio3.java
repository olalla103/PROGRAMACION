package tema12.Aplicacion.App25;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class Socio3 implements Comparable<Socio3> {
    String apodo; // clave
    String nombre, fechaIngreso;
    LocalDate alta;

    public Socio3(String apodo, String nombre, String fechaIngreso) {
        this.apodo = apodo;
        this.nombre = nombre;

        // FORMATEO DE FECHA
        alta = LocalDate.parse(fechaIngreso, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.fechaIngreso = alta.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public Socio3(String nombre, String fechaIngreso) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
    }

    // ORDENACION NATURAL POR APODO
    @Override
    public int compareTo(Socio3 o) {
        return this.getApodo().compareTo(o.getApodo());
    }

    @Override
    public String toString() {
        return "Socio3{" +
                "apodo='" + apodo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

    // GETTERS Y SETTERS
    public Integer getAntiguedad() {
        return (int) (ChronoUnit.DAYS.between(LocalDate.now(), this.getAlta()));
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
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


}
