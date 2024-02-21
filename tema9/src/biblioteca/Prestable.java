package biblioteca;

public interface Prestable {
	public void prestar(Libro o);

	public void devolver(Libro o);

	public boolean prestado(Libro o);
}
