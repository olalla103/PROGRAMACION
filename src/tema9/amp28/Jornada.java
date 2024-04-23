package tema9.amp28;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Jornada implements Comparable<Object> {

	LocalDate fecha;
	LocalTime horaEntrada, horaSalida;
	String dni;

	public Jornada(String fecha, String horaEntrada, String horaSalida, String dni) {
		// Formateadores de fecha y hora
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

		// Parsear la cadena de fecha en LocalDate usando el formateador
		this.fecha = LocalDate.parse(fecha, formatter);

		// Parsear las cadenas de hora en LocalTime usando el formateador
		this.horaEntrada = LocalTime.parse(horaEntrada, timeFormatter);
		this.horaSalida = LocalTime.parse(horaSalida, timeFormatter);

		this.dni = dni;
	}

	// criterio de orden natural
	@Override
	public int compareTo(Object o) {
		Jornada jornada = (Jornada) o;
		return this.dni.compareTo(jornada.dni);
	}

	@Override
	public String toString() {
		return "Jornada \nFecha:" + fecha + " Cantidad de minutos trabajados: " + getCantidadMinutos() + " DNI: " + dni;
	}

	// GETTERS AND SETTERS

	// minutos
	public Integer getCantidadMinutos() {
		Integer minutos;
		minutos = horaSalida.getHour() - horaEntrada.getHour();
		minutos *= 60;
		return minutos;
	}

	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public LocalTime getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}

}
