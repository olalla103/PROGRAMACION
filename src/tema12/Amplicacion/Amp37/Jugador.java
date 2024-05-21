package tema12.Amplicacion.Amp37;

public class Jugador {
    Integer dorsal; // clave del mapa
    String dni, nombre;
    Posiciones posicion;
    Double estatura;

    public Jugador(Integer dorsal, String dni, String nombre, Double estatura, Posiciones posicion) {
        this.dorsal = dorsal;
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;
    }

    // GETTERS Y SETTERS
    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
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

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }
}
