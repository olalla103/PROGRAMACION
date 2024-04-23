package Ex2Ev2OlallaLopez.pack;

public class Automovil extends Vehiculo {
	// por defecto son 2
	Integer pasajeros;

	public Automovil(String marca, String modelo, Integer numRuedas) {
		super(marca, modelo, numRuedas);
		this.pasajeros = 2;
	}

	public Automovil(String marca, String modelo, Integer numRuedas, Integer pasajeros) {
		super(marca, modelo, numRuedas);
		this.pasajeros = pasajeros;
	}

	@Override
	public String toString() {
		return "Automóvil: id: " + this.getId() + "  pasajeros: " + pasajeros + "  marca: " + marca + "  modelo: "
				+ modelo + "  número de ruedas: " + numRuedas + "  alquilado: " + alquilado + "\n";
	}

	// GETTERS Y SETTERS
	public Integer getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Integer pasajeros) {
		this.pasajeros = pasajeros;
	}

}
