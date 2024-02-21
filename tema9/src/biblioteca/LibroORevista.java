package biblioteca;

public class LibroORevista {
	Integer codigo, titulo, anioPublicacion;

	public LibroORevista(Integer codigo, Integer titulo, Integer anioPublicacion) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}

	// GETTERS AND SETTERS
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getTitulo() {
		return titulo;
	}

	public void setTitulo(Integer titulo) {
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

}
