package actAsociacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Socio {
	/*
	 * Realizar un menú de opciones para llevar el mantenimiento de una asociación
	 * de forma que de cada socio los datos son: un ID, un nombre y una fecha de
	 * nacimiento. El ID es el campo clave y no se puede repetir, de tipo numérico.
	 * Además, se desea conocer cuál es el número de socios que tiene la asociación.
	 * Las operaciones que se van a realizar son: - Alta de socio (comprobar que el
	 * ID sea único) - Eliminación de socio (solicita el ID que quiera eliminar) -
	 * Consultar el nº de socios existentes - Consultar los datos de un socio en
	 * concreto (solicita ID) - Modificar la fecha de nacimiento (solicita ID) -
	 * Listado ordenado por ID (criterio de ordenación natural) - Listado ordenado
	 * por la edad y en caso de la misma edad, se ordenará por el nombre del socio -
	 * Salir
	 */

	static Integer ID = 0;
	String nombreString;
	LocalDate fechaNacimiento;
	ConjuntoSocio tabla = new ConjuntoSocio();

	public Socio() {
		// TODO Auto-generated constructor stub
	}

	public Socio(String nombre, String fechaNacimiento) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		ID++;
		this.nombreString = nombre;
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatter);

	}

	public void alta(Object ob) {
		Socio socio = (Socio) ob;
		tabla.nuevoSocio(socio);

	}

	// GETTERS AND SETTERS

	public static Integer getID() {
		return ID;
	}

	public static void setID(Integer iD) {
		ID = iD;
	}

	public String getNombreString() {
		return nombreString;
	}

	public void setNombreString(String nombreString) {
		this.nombreString = nombreString;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Socio [nombreString=" + nombreString + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
