package biblioteca;

public class Libro extends LibroORevista implements Prestable {
	Boolean prestado;

	public Libro(Integer codigo, Integer titulo, Integer anioPublicacion) {
		super(codigo, titulo, anioPublicacion);
		this.prestado = false;
	}

	// GETTERS AND SETTERS
	public Boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(Boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Libro: " + super.toString() + " Prestado: " + prestado;
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

}
