package tema8.r123;

public class Hora {
	protected Integer hora, minuto;

	public Hora() {
		super();
	}

	public Hora(Integer hora, Integer minuto) {
		super();
		if (setHora(hora)) {
			this.hora = hora;
		} else {
			System.out.println("La hora introducida es incorrecta.");
		}
		if (setMinutos(minuto)) {
			this.minuto = minuto;
		} else {
			System.out.println("La cantidad de minutos introducida es incorrecta.");
		}

	}

	public void incrementa() {
		// incrementa la hora en un minuto.
		minuto++;
		if (minuto > 59) {
			minuto = 0;
			hora++;
			if (hora > 23) {
				hora = 0;
			}
		}

	}

	public boolean setMinutos(Integer valor) {
		if (valor > 0 && valor < 60) {
			return true;
		} else {
			return false;
		}
	}

	public boolean setHora(Integer valor) {
		if (valor > 0 && valor < 24) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "Son las " + hora + " : " + minuto;
	}

}
