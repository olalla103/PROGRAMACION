package tema7.resuelta9;

public class Bombilla {
	private Boolean encendida = false;

	public Bombilla(Boolean encendida) {
		this.encendida = encendida;
	}

	public boolean isEncendida() {
		return encendida;
	}

	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public void eniendeGeneral() {
		encendida = true;
	}

	public void apagaGeneral() {
		encendida = false;
	}

	public void enciendeIndividual(Boolean bombilla) {
		bombilla = true;
	}

	public void apagaIndividual(Boolean bombilla) {
		bombilla = false;
	}

	public void estadoGeneral() {
		if (encendida) {
			System.out.println("Las bombillas están todas encendidas.");
		} else {
			System.out.println("Las bombillas están todas apagadas.");
		}
	}

	public void estadoIndividual(Boolean bombilla) {
		if (bombilla) {
			System.out.println("La bombilla está encendida.");
		} else {
			System.out.println("Las bombilla está apagada.");
		}
	}
}
