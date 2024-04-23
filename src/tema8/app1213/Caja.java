package tema8.app1213;

public class Caja {

	// ENUM
	public enum Unidad {
		METROS, CENTIMETROS;
	}

	// VARIABLES
	protected final Integer alto, ancho, fondo;
	protected Unidad unidad;
	protected String etiqueta;

	// CONSTRUCTORES
	public Caja() {
		this.alto = null;
		this.ancho = null;
		this.fondo = null;

	}

	public Caja(Integer alto, Integer ancho, Integer fondo, Unidad unidad) {
		this.alto = alto;
		this.ancho = ancho;
		this.fondo = fondo;
		this.unidad = unidad;

	}

	public double getVolumen() {
		double vol;
		vol = alto * ancho * fondo;
		return vol;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String toString() {
		return "Su caja mide:\n" + alto + " " + unidad + " de alto.\n" + ancho + " " + unidad + " de ancho.\n" + fondo
				+ " " + unidad + " de fondo.\nLa información de la etiqueta es: " + etiqueta
				+ "\n El volumen de su caja es: " + getVolumen() + " " + unidad + " cúbicos.";
	}

}
