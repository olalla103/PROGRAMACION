package tema9.amp31;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Llamada implements Comparable<Object> {

	Tarifas tarifa;
	String telfCliente, telfInterlocutor;
	Boolean saliente;
	LocalDate fechaLlamada;
	LocalTime inicio, fin;

	public Llamada(Boolean saliente, String telfCliente, String telfInterlocutor, String fechaLlamada, String inicio,
			String fin, Tarifas tarifa) {
		// FORMATEADORES
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		this.telfCliente = telfCliente;
		this.telfInterlocutor = telfInterlocutor;
		this.fechaLlamada = LocalDate.parse(fechaLlamada, dateFormatter);
		this.inicio = LocalTime.parse(inicio, timeFormatter);
		this.fin = LocalTime.parse(fin, timeFormatter);
		this.tarifa = tarifa;
		this.saliente = saliente;

	}

	// orden por numero de teléfono y duración de la llamada
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (this.getTelfCliente().equals(((Llamada) o).getTelfCliente())) {
			return this.getCantMinutos() - ((Llamada) o).getCantMinutos();
		} else {
			return this.getTelfCliente().compareTo(((Llamada) o).getTelfCliente());
		}
	}

	// coste si la llamada es saliente
	public Double costeLlamada(Llamada o) {
		Double precio = 0.0;
		if (o.getSaliente()) {
			if (this.getTarifa().equals(Tarifas.SEVILLA)) {
				precio = 0.06 * getCantMinutos();
			} else if (this.getTarifa().equals(Tarifas.CADIZ)) {
				precio = 0.05 * getCantMinutos();
			} else if (this.getTarifa().equals(Tarifas.GRANADA)) {
				precio = 0.03 * getCantMinutos();
			} else if (this.getTarifa().equals(Tarifas.HUELVA) || this.getTarifa().equals(Tarifas.JAEN)) {
				precio = 0.02 * getCantMinutos();
			}
		}
		return precio;
	}

	// GETTERS AND SETTERS
	// duracion en minutos de la llamada
	public Tarifas getTarifa() {
		return tarifa;
	}

	public void setTarifa(Tarifas tarifa) {
		this.tarifa = tarifa;
	}

	public Integer getCantMinutos() {
		long minutos = ChronoUnit.MINUTES.between(inicio, fin);
		return (int) minutos;
	}

	public String getTelfCliente() {
		return telfCliente;
	}

	public void setTelfCliente(String telfCliente) {
		this.telfCliente = telfCliente;
	}

	public String getTelfInterlocutor() {
		return telfInterlocutor;
	}

	public void setTelfInterlocutor(String telfInterlocutor) {
		this.telfInterlocutor = telfInterlocutor;
	}

	public Boolean getSaliente() {
		return saliente;
	}

	public void setSaliente(Boolean saliente) {
		this.saliente = saliente;
	}

	public LocalDate getFechaLlamada() {
		return fechaLlamada;
	}

	public void setFechaLlamada(LocalDate fechaLlamada) {
		this.fechaLlamada = fechaLlamada;
	}

	public LocalTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalTime inicio) {
		this.inicio = inicio;
	}

	public LocalTime getFin() {
		return fin;
	}

	public void setFin(LocalTime fin) {
		this.fin = fin;
	}

	// IMPRIME
	@Override
	public String toString() {
		return "Llamada [tarifa=" + tarifa + ", telfCliente=" + telfCliente + ", telfInterlocutor=" + telfInterlocutor
				+ ", saliente=" + saliente + ", fechaLlamada=" + fechaLlamada + ", inicio=" + inicio + ", fin=" + fin
				+ "]";
	}

}
