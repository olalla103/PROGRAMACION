package tema7.resuelta8;

public class Sintonizador {
	private Double frecuencia = 80.0;

	public Sintonizador(Double frecuencia) {
		if (compruebaFrecuencia(frecuencia)) {
			this.frecuencia = frecuencia;
		} else {
			System.out.println("No puede usar esa frecuencia, no está permitida.");
		}
	}

	public Double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(Double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public void aumenta() {
		if (compruebaFrecuencia(frecuencia + 0.5)) {
			setFrecuencia(frecuencia + 0.5);
			System.out.println(frecuencia);
		} else {
			System.out.println("No se puede aumentar más.");
		}

	}

	public void baja() {
		if (compruebaFrecuencia(frecuencia - 0.5)) {
			setFrecuencia(frecuencia - 0.5);
			System.out.println(frecuencia);
		} else {
			System.out.println("No se puede bajar más.");
		}
	}

	public boolean compruebaFrecuencia(Double fc) {
		if (frecuencia > 80.0 || frecuencia < 108.0) {

			return true;
		} else {
			if (frecuencia > 108.0) {
				setFrecuencia(80.0);
			} else if (frecuencia < 80.0) {
				setFrecuencia(108.0);
			}
			return false;
		}
	}
}
