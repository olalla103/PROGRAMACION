package tema11.packMoodle1;

public class Alumno {
	String nombre, dni;
	Pares[] pares;

	public Alumno(String nombre, String dni, Pares[] pares) {
		this.nombre = nombre;
		this.dni = dni;
		if (pares.length > 5) {
			this.pares = pares;
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

	public void setPares(Pares[] pares) {
		this.pares = pares;
	}

}
