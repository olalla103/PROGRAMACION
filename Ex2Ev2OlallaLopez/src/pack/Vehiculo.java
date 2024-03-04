package pack;

public abstract class Vehiculo {
	// es estático porque así sabemos en todo momento la cantidad de vehículos que
	// hay en la lista
	static Integer contid = 1;
	String marca, modelo;
	Integer numRuedas, id;
	Boolean alquilado;

	public Vehiculo() {
		super();
		id = contid++;
	}

	public Vehiculo(String marca, String modelo, Integer numRuedas) {
		super();
		id = contid++;
		this.marca = marca;
		this.modelo = modelo;
		this.numRuedas = numRuedas;
		this.alquilado = false;
	}

	// operaciones de alquiler
	public void alquilar() {
		setAlquilado(true);
	}

	public void devolver() {
		setAlquilado(false);
	}

	// GETTERS Y SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(Integer numRuedas) {
		this.numRuedas = numRuedas;
	}

	public Boolean getAlquilado() {
		return alquilado;
	}

	public void setAlquilado(Boolean alquilado) {
		this.alquilado = alquilado;
	}

}
