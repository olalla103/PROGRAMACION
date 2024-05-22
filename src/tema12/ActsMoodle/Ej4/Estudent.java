package tema12.ActsMoodle.Ej4;

public class Estudent {
    private static int contadorID = 0; // Variable estática para llevar el conteo de IDs
    String nombre;
    String carrera;
    Integer edad;
    Integer numID;
    Double promedio;

    public Estudent(String nombre, String carrera, Integer edad, Double promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
        this.promedio = promedio;
        this.numID = ++contadorID;
    }

    public Estudent(Integer numID) {
        this.numID = numID;
    }

    public Estudent(Double promedio, Integer numID) {
        this.promedio = promedio;
        this.numID = numID;
    }

    // GETTERS AND SETTERS
    public static int getContadorID() {
        return contadorID;
    }

    public static void setContadorID(int contadorID) {
        Estudent.contadorID = contadorID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getNumID() {
        return numID;
    }

    public void setNumID(Integer numID) {
        this.numID = numID;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudent{" +
                "nombre='" + nombre + '\'' +
                ", carrera='" + carrera + '\'' +
                ", edad=" + edad +
                ", numID=" + numID +
                ", promedio=" + promedio +
                '}';
    }
}
