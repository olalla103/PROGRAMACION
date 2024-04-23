package tema11.packApp12;

public class Empleado {
	String dni, nombre;
	Double sueldo;

	public Empleado(String dni, String nombre, Double sueldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
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

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

}
