package amp26;

public class CalendarioExacto extends Calendario {

	Integer hora, segundo, minuto;

	CalendarioExacto(int dia, int mes, int anio, Integer hora, Integer minuto, Integer segundo) {
		super(dia, mes, anio);
		if (hora > 23 || hora < 0) {
			System.out.println("No se puede insertar ésta hora.");
		} else {
			this.hora = hora;
		}
		if (minuto < 0 || minuto > 60) {
			System.out.println("No se pueden insertar éstos minutos.");
		} else {
			this.minuto = minuto;
		}
		if (segundo < 0 || segundo > 60) {
			System.out.println("No se pueden insertar éstos minutos.");
		} else {
			this.segundo = segundo;
		}

	}

	public void incrementasegundo() {
		segundo++;
		if (segundo == 60) {
			setSegundo(0);
			minuto++;
			setMinuto(minuto);
			if (minuto == 60) {
				setMinuto(0);
				hora++;
				if (hora > 23) {
					setHora(0);
					incrementarDia();
				}
				setHora(hora);

			}
		}
	}

	public void incrementaMinuto() {
		minuto++;
		if (minuto == 60) {
			setMinuto(0);
			setSegundo(0);
			hora++;
			if (hora == 24) {
				setHora(0);
				setSegundo(0);
				incrementarDia();
			}
		}
	}

	public void incrementarHora() {
		hora++;
		setMinuto(0);
		setSegundo(0);
		if (hora == 24) {
			setHora(0);
		}
	}

	@Override
	public void incrementarDia() {
		// TODO Auto-generated method stub
		super.incrementarDia();
		setHora(0);
		setMinuto(0);
		setSegundo(0);
	}

	@Override
	public void incrementarMes() {
		// TODO Auto-generated method stub
		super.incrementarMes();
		setHora(0);
		setMinuto(0);
		setSegundo(0);
	}

	@Override
	public void incrementarAnio(int cantidad) {
		// TODO Auto-generated method stub
		super.incrementarAnio(cantidad);
		setHora(0);
		setMinuto(0);
		setSegundo(0);
	}

	// EQUALS
	public boolean equals(CalendarioExacto obj) {
		if (this.getDia() == obj.getDia() && this.getMes() == obj.getMes() && this.getAnio() == obj.getAnio()
				&& this.getSegundo() == obj.getSegundo() && this.getMinuto() == obj.getMinuto()
				&& this.getHora() == obj.getHora()) {
			return true;
		} else {
			return false;
		}
	}

	// toString
	public String toString() {
		return "Hoy es " + this.getDia() + " de " + this.getMes() + " del año " + this.getAnio() + " y son las "
				+ this.hora + " : " + this.minuto + " : " + this.segundo;
	}

	// GETTERS AND SETTERS

	public Integer getSegundo() {
		return segundo;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public void setSegundo(Integer segundo) {
		this.segundo = segundo;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		super.mostrar();
	}

	@Override
	public boolean iguales(Calendario otrafecha) {
		// TODO Auto-generated method stub
		return super.iguales(otrafecha);
	}

	@Override
	public int getDia() {
		// TODO Auto-generated method stub
		return super.getDia();
	}

	@Override
	public void setDia(int dia) {
		// TODO Auto-generated method stub
		super.setDia(dia);
	}

	@Override
	public int getMes() {
		// TODO Auto-generated method stub
		return super.getMes();
	}

	@Override
	public void setMes(int mes) {
		// TODO Auto-generated method stub
		super.setMes(mes);
	}

	@Override
	public int getAnio() {
		// TODO Auto-generated method stub
		return super.getAnio();
	}

	@Override
	public void setAnio(int anio) {
		// TODO Auto-generated method stub
		super.setAnio(anio);
	}

}
