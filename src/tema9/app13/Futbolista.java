package tema9.app13;

public class Futbolista implements Comparable<Object> {
	protected String dni, nombre;
	protected Integer edad, numGoles;

	public Futbolista(String dni, String nombre, Integer edad, Integer numGoles) {

		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.numGoles = numGoles;
	}

	public boolean equals(Object ob) {
		Futbolista f2 = (Futbolista) ob;
		if (this.dni.equals(f2.dni)) {
			return true;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Futbolista dni: " + dni + " nombre: " + nombre + " edad: " + edad + " numGoles: " + numGoles + "\n";
	}

	public int compareTo(Object o) {
		int resultado;

		resultado = this.dni.compareToIgnoreCase(((Futbolista) o).dni);

		return resultado;
	}

	// GETTERS AND SETTERS

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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getNumGoles() {
		return numGoles;
	}

	public void setNumGoles(Integer numGoles) {
		this.numGoles = numGoles;
	}

}
