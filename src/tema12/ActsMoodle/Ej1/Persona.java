package tema12.ActsMoodle.Ej1;

import java.io.Serializable;

public class Persona implements Comparable<Persona>, Serializable {
    String nombre;
    Integer edad;

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // GETTERS AND SETTERS
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

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Persona o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
