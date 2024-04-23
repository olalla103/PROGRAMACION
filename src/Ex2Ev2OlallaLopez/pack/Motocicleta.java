package Ex2Ev2OlallaLopez.pack;

public class Motocicleta extends Vehiculo {
	// por defecto es falso
	Boolean sidecar;

	public Motocicleta(String marca, String modelo, Integer numRuedas) {
		super(marca, modelo, numRuedas);
		this.sidecar = false;

	}

	public Motocicleta(String marca, String modelo, Integer numRuedas, Boolean sidecar) {
		super(marca, modelo, numRuedas);
		this.sidecar = sidecar;

	}

	@Override
	public String toString() {
		return "Motocicleta id: " + this.getId() + "  sidecar: " + sidecar + "  marca: " + marca + "  modelo: " + modelo
				+ "  numRuedas: " + numRuedas + "  alquilado: " + alquilado + "\n";
	}

	// GETTERS Y SETTERS
	public Boolean getSidecar() {
		return sidecar;
	}

	public void setSidecar(Boolean sidecar) {
		this.sidecar = sidecar;
	}

}
