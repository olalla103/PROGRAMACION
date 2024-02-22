package biblioteca;

public class Libro extends Publicacion implements Prestable {
	Boolean prestado;
	String autor;

	public Libro(Integer codigo, String titulo, Integer anioPublicacion, String autor) {
		super(codigo, titulo, anioPublicacion);
		this.prestado = false;
		this.autor = autor;
	}

	// GETTERS AND SETTERS
	public Boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(Boolean prestado) {
		this.prestado = prestado;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public void prestar(Libro o) {
		if (prestado(o)) {
			System.out.println("No se puede prestar este libro, se encuentra ya prestado.");
		} else {
			System.out.println("Se puede llevar el libro.");
			o.setPrestado(true);
		}
	}

	@Override
	public void devolver(Libro o) {
		if (prestado(o)) {
			System.out.println("Ha devuelto el libro.");
			o.setPrestado(false);
		} else {
			System.out.println("Ese libro no se encontraba en préstamo");
		}

	}

	@Override
	public boolean prestado(Libro o) {
		if (o.getPrestado()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Libro: " + super.toString() + " Prestado: " + prestado;
	}

}
