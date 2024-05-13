package tema12.Resueltas.R11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable<Socio> {
    String dni, nombre, fechAlta;
    LocalDate alta;

    public Socio(String dni, String nombre, String fechAlta) {
        this.dni = dni;
        this.nombre = nombre;

        // FORMATEO DE FECHA
        alta = LocalDate.parse(fechAlta, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.fechAlta = alta.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public Socio(String dni) {
    }

    public Socio(String dni, String nombre) {
    }


    // COMPARADOR BASADO EN EL DNI
    @Override
    public int compareTo(Socio o) {
        return this.getDni().compareTo(o.getDni());
    }

    // GETTERS AND SETTERS
    //TIEMPO QUE LLEVA SIENDO SOCIO
    public Integer getAntiguedad() {
        return (int) ChronoUnit.YEARS.between(LocalDate.now(), alta);
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechAlta() {
        return fechAlta;
    }

    public void setFechAlta(String fechAlta) {
        this.fechAlta = fechAlta;
    }

    public LocalDate getAlta() {
        return alta;
    }

    public void setAlta(LocalDate alta) {
        this.alta = alta;
    }
}
