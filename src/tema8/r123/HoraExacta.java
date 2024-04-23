package tema8.r123;

public class HoraExacta extends Hora {
	protected Integer segundo;

	public HoraExacta() {

	}

	public HoraExacta(Integer hora, Integer minuto, Integer segundo) {
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
		if (setSegundos(segundo)) {
			this.segundo = segundo;
		} else {
			System.out.println("La cantidad de segundos introducida es incorrecta.");
		}

	}

	public void incrementaS() {
		// incrementa la hora en un segundo.
		segundo++;
		if (segundo > 59) {
			segundo = 0;
			super.incrementa();
		}
	}

	public boolean equals(Object otraHora) {
		HoraExacta unaHora = (HoraExacta) otraHora;
		if (this.hora == unaHora.hora && this.minuto == unaHora.minuto && this.segundo == unaHora.segundo) {
			return true;
		} else {
			return false;
		}

	}

	public boolean setSegundos(Integer valor) {
		if (valor > 0 && valor < 60) {
			return true;
		} else {
			return false;
		}
	}

}
