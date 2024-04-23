package tema10.packAmp31;

import java.time.LocalDate;

public class Clientes {
	String dni, nombre;
	LocalDate fechaNacimiento;
	Double saldo;

	public Clientes(String dni, String nombre, LocalDate fechaNacimiento, Double saldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.saldo = saldo;
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
