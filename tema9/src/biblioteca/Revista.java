package biblioteca;

public class Revista extends LibroORevista {
	Integer numero;

	public Revista(Integer codigo, Integer titulo, Integer anioPublicacion, Integer numero) {
		super(codigo, titulo, anioPublicacion);
		this.numero = numero;
	}

	// GETTERS AND SETTERS
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Revista:" + " " + super.toString() + "  Número de revista: " + numero;
	}

}
