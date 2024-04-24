package tema11.packMoodle1;

public class Alumno {
    String nombre, dni;
    Pares[] pares = new Pares[5];

    public Alumno(String dni, String nombre, Pares[] pares) {
        if (pares.length == 5) {
            this.nombre = nombre;
            this.dni = dni;
            this.pares = pares;
        } else {
            System.out.println("El alumno debe tener 5 notas.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Pares[] getPares() {
        return pares;
    }

}
