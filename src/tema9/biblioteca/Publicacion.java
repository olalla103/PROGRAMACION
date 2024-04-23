package tema9.biblioteca;

public class Publicacion implements Comparable<Object> {
	static Integer numTotalPublicacion = 0;
	Integer codigo, anioPublicacion;
	String titulo;

	public Publicacion(Integer codigo, String titulo, Integer anioPublicacion) {
		super();
		numTotalPublicacion++;
		this.codigo = codigo;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}

	// GETTERS AND SETTERS
	public Integer getNumPublicacion() {
		return numTotalPublicacion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(Integer anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + ", título: " + titulo + ", Año de Publicación: " + anioPublicacion + " ";
	}

	@Override
	public int compareTo(Object o) {
		return this.getCodigo() - ((Publicacion) o).getCodigo();
	}

}
