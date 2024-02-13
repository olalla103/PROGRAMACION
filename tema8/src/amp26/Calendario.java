package amp26;

public class Calendario {
	private int dia, mes, anio;

	Calendario(int dia, int mes, int anio) {

		if (dia > 0 && dia < 32) {
			if (mes == 2 && (dia < 30)) {
				this.dia = dia;
			} else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 10 || mes == 12) && (dia < 32)) {
				this.dia = dia;
			} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 31)) {
				this.dia = dia;
			} else {
				System.out.println("El día no es correcto.");
			}
		} else {
			System.out.println("El día no es correcto.");
		}

		if (mes < 13 && mes > 0) {
			this.mes = mes;
		} else {
			System.out.println("El mes no es correcto.");
		}

		if (anio > 0) {
			this.anio = anio;
		} else {
			System.out.println("El año no es correcto.");
		}

	}

	public void incrementarDia() {
		dia++;
		if ((dia == 30) && mes == 2) {
			incrementarMes();
			dia = 1;
		} else if ((dia == 31) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
			incrementarMes();
			dia = 1;
		} else if ((dia == 32) && ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 10 || mes == 12))) {
			incrementarMes();
			dia = 1;
		}

	}

	public void incrementarMes() {
		mes++;
		if (mes > 12) {
			mes = 1;
			anio++;
		}
	}

	public void incrementarAnio(int cantidad) {
		anio += cantidad;
	}

	public void mostrar() {
		System.out.println(dia + " / " + mes + " / " + anio);
	}

	public boolean iguales(Calendario otrafecha) {
		if (otrafecha.dia == dia && otrafecha.mes == mes && otrafecha.anio == anio) {
			return true;
		} else {
			return false;
		}
	}

	// GETTERS AND SETTERS
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
}
