package tema9.resuelta9_78_propuesta34;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable<Object> {
	protected Integer id;
	protected String nombre;
	protected LocalDate fechaNacimiento;

	public Socio(Integer id, String nombre, String fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
	}

	public int edad() {
		return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
	}

	@Override
	public int compareTo(Object ob) {
		// EJEMPLO 1 (resuelta 7)
//		int resultado;
//		Socio otroSocio = (Socio) o;
//
//		if (this.id < otroSocio.id) {
//			resultado = -1;
//		} else if (this.id > otroSocio.id) {
//			resultado = 1;
//		} else {
//			resultado = 0;
//		}
//		return resultado;

		// EJEMPLO 2 (prouesta 3)
		// return this.id - ((Socio) ob).id;

		// ORDENAMOS POR ORDEN ALFABÉTICO (resuelta 8)
		return this.nombre.compareTo(((Socio) ob).nombre);

	}

	@Override
	public String toString() {
		return "Id:" + id + " nombre:" + nombre + " fechaNacimiento:" + fechaNacimiento + "\n";
	}

}
