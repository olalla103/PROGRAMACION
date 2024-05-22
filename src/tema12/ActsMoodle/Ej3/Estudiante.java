package tema12.ActsMoodle.Ej3;

import java.io.Serializable;

public class Estudiante implements Serializable, Comparable<Estudiante> {
    String nombre;
    Integer edad;
    Double promedioNotas;

    public Estudiante(String nombre, Integer edad, Double promedioNotas) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedioNotas = promedioNotas;
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    // ordeno de mayor a menor
    @Override
    public int compareTo(Estudiante o) {
        return o.getEdad().compareTo(this.getEdad());
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", promedioNotas=" + promedioNotas +
                '}';
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(Double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

}
