package tema7.resuelta3_5;

public class Gestor {
	static String telf;
	public String nombre;
	Double importeMax = 10000.0;

	public Gestor() {

	}

	public Gestor(String nombre, String telf) {
		this.nombre = nombre;
		Gestor.telf = telf;
	}

	public Gestor(String nombre, String telf, Double importeMax) {
		super();
		this.nombre = nombre;
		Gestor.telf = telf;
		this.importeMax = importeMax;
	}

	// getters y setters
	public static String getTelf() {
		return telf;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getImporteMax() {
		return importeMax;
	}

	public void setImporteMax(Double importeMax) {
		this.importeMax = importeMax;
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombre + "\nTeléfono: " + telf + "\nImporte máximo: " + importeMax;
	}

}
