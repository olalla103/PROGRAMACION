package tema11.packMoodle2;

import java.util.Arrays;

public class Alumno {
    String dni, nombre, apellidos, direccion;
    Asignatura[] asignaturas = new Asignatura[3];

    public Alumno(String dni, String nombre, String apellidos, String direccion, Asignatura[] asignaturas) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.asignaturas = asignaturas;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + "\n" +
                "NOMBRE: " + nombre + "\n" +
                "APELLIDOS: " + apellidos + "\n" +
                "DIRECCIÍON: " + direccion + "\n" +
                "ASIGNATURAS: " + Arrays.toString(asignaturas);
    }


}
