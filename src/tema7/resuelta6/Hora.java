package tema7.resuelta6;

public class Hora {
	private Integer hora, minutos, segundos;

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		if (hora > 23 || hora < 0) {
			System.out.println("No se puede insertar ésta hora.");
		} else {
			this.hora = hora;
		}
	}

	public Integer getMinutos() {
		return minutos;
	}

	public void setMinutos(Integer minutos) {
		if (minutos < 0 || minutos > 60) {
			System.out.println("No se pueden insertar éstos minutos.");
		} else {
			this.minutos = minutos;
		}
	}

	public Integer getSegundos() {
		return segundos;
	}

	public void setSegundos(Integer segundos) {
		if (segundos < 0 || segundos > 60) {
			System.out.println("No se pueden insertar éstos minutos.");
		} else {
			this.segundos = segundos;
		}
	}

	public void incrementaSegundos(Integer sM) {
		segundos += sM;
		segundos = (Integer) (Math.abs(segundos - 60));
		if (segundos == 0) {
			setSegundos(0);
			minutos++;
			setMinutos(minutos);
			if (minutos == 60) {
				setMinutos(0);
				hora++;
				if (hora > 23) {
					hora = 0;
				}
				setHora(hora);

			}
		}
		System.out.println("La hora final es: " + getHora() + " : " + getMinutos() + " : " + getSegundos());
	}

}
