package tema12.Aplicacion.App16;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio2 implements Serializable, Comparable<Socio2> {
    String dni, nombre, fechAlta;
    LocalDate alta;

    public Socio2(String dni, String nombre, String fechAlta) {
        this.dni = dni;
        this.nombre = nombre;

        // FORMATEO DE FECHA
        alta = LocalDate.parse(fechAlta, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.fechAlta = alta.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public Socio2(String dni) {
        this.dni = dni;
    }

    public Socio2(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    // ORDENA POR NOMBRE
    @Override
    public int compareTo(Socio2 o) {
        return this.getDni().compareTo(o.getDni());
    }

    // TOSTRING
    @Override
    public String toString() {
        return "Socio{" +
                "dni: " + dni + "\t" +
                " nombre: " + nombre + "\t" +
                " antigüedad: " + getAntiguedad();
    }

    // GETTERS AND SETTERS
    //TIEMPO QUE LLEVA SIENDO SOCIO
    public Integer getAntiguedad() {
        return (int) ChronoUnit.YEARS.between(alta, LocalDate.now());
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


