package tema11.packMoodle2;

import java.util.Arrays;

public class Asignatura {
    String nombre;
    Double[] notas = new Double[3];

    public Asignatura(String nombre, Double[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + nombre + "\n" +
                "NOTAS: " + Arrays.toString(notas);
    }
}
