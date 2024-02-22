package biblioteca;

import java.util.Arrays;

public class Biblioteca {
	Publicacion[] publicacion = new Publicacion[0];

	public void altaLibro(Publicacion publi) {
		publicacion = Arrays.copyOf(publicacion, publicacion.length + 1);
		publicacion[publicacion.length - 1] = publi;

	}

	public void bajaLibro(Integer codigo) {
		for (int i = 0; i < publicacion.length; i++) {
			if (publicacion[i].getCodigo().equals(codigo) && publicacion[i] instanceof Libro) {
				for (int j = i; j < publicacion.length - 1; j++) {
					publicacion[j] = publicacion[j + 1];
				}
				publicacion = Arrays.copyOf(publicacion, publicacion.length - 1);
			}
		}
		Publicacion.numTotalPublicacion--;

	}

	public void datosLibro(Integer codigo) {
		boolean flag = false;
		for (int i = 0; i < publicacion.length; i++) {
			if (publicacion[i].getCodigo() == codigo && publicacion[i] instanceof Libro && !flag) {
				System.out.println(publicacion[i].toString());
				flag = true;
			}
		}

	}

	public void listadoLibrosPrestados() {
		for (int i = 0; i < publicacion.length; i++) {
			if (publicacion[i] instanceof Libro) {
				if (((Libro) (this.publicacion[i])).getPrestado() == true) {
					System.out.println(publicacion[i] + " ");
				}

			}
		}
	}

	public void listadoLibrosNoPrestados() {
		for (int i = 0; i < publicacion.length; i++) {
			if (publicacion[i] instanceof Libro) {
				if (((Libro) (this.publicacion[i])).getPrestado() == false) {
					System.out.println(publicacion[i] + " ");
				}

			}
		}
	}

	public void listadOrdenado() {
		Arrays.sort(publicacion);
	}

	public void listaLibrosOrdenadosAutores() {
		OrdenaAutores ordenaAutores = new OrdenaAutores();
		Libro[] libros = new Libro[0];
		for (int i = 0; i < publicacion.length; i++) {
			if (publicacion[i] instanceof Libro) {
				libros = Arrays.copyOf(libros, libros.length + 1);
				libros[libros.length - 1] = (Libro) publicacion[i];
			}
		}
		Arrays.sort(libros, ordenaAutores);
		System.out.println(Arrays.toString(libros));

	}

	public void numPublicaciones() {
		if (publicacion.length == 0) {
			System.out.println("No hay publicaciones existentes.");
		} else {
			System.out.println(publicacion[0].getNumPublicacion());
		}
	}

	@Override
	public String toString() {
		return "Biblioteca publicación: " + Arrays.toString(publicacion);
	}

}
