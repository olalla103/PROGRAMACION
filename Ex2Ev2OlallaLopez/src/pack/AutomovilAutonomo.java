package pack;

public class AutomovilAutonomo extends Automovil {
	// el número de sensores predeterminado será 3
	Integer numSensores;

	public AutomovilAutonomo(String marca, String modelo, Integer numRuedas) {
		super(marca, modelo, numRuedas);
		this.numSensores = 3;
	}

	public AutomovilAutonomo(String marca, String modelo, Integer numRuedas, Integer numSensores) {
		super(marca, modelo, numRuedas);
		this.numSensores = numSensores;

	}

	@Override
	public String toString() {
		return "Automovil Autónomo  id: " + this.getId() + "  número de sensores: " + numSensores + "  pasajeros: "
				+ pasajeros + "  marca: " + marca + "  modelo: " + modelo + "  número de ruedas: " + numRuedas
				+ "  alquilado: " + alquilado + "\n";
	}

	// GETTERS Y SETTERS
	public Integer getNumSensores() {
		return numSensores;
	}

	public void setNumSensores(Integer numSensores) {
		this.numSensores = numSensores;
	}

}
