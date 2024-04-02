package packR9;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Registros implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Double temperatura;
	LocalDateTime fechaRegistro;

	public Registros(Double temperatura) {
		this.temperatura = temperatura;

		this.fechaRegistro = LocalDateTime.now();
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public String toString() {
		return "Registros [temperatura=" + temperatura + ", fechaRegistro=" + fechaRegistro + "]";
	}

}
