package actAsociacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Socio implements Comparable<Object> {

	Integer ID = 0, ultID = 0;
	String nombre;
	LocalDate fechaNacimiento;
	Integer max;

	public Socio() {
		// TODO Auto-generated constructor stub
	}

	public Socio(String nombre, String fechaNacimiento) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.ID = ultID + 1;
		this.nombre = nombre;
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatter);

	}

	// GETTERS AND SETTERS

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatter);
	}

	public Integer getEdad() {
		return LocalDate.now().getYear() - fechaNacimiento.getYear();
	}

	@Override
	public String toString() {
		return "Socio ID: " + this.ID + " nombre: " + nombre + ", fechaNacimiento: " + fechaNacimiento;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.getID() - ((Socio) o).getID();
	}

}
