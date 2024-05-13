package tema12.Propuestas.P5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Date;

public class Clientes {
    Integer id;
    String nombre, edad;
    LocalDate fechaNacimiento;

    public Clientes() {
    }

    public Clientes(Integer id, String nombre, String edad) {
        this.id = id;
        this.nombre = nombre;

        // FORMATEO DE FECHA
        fechaNacimiento = LocalDate.parse(edad, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.edad = fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    // GETTERS AND SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return (int) ChronoUnit.YEARS.between(LocalDate.now(), fechaNacimiento);
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
