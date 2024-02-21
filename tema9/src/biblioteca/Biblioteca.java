package biblioteca;

import java.util.Arrays;

public class Biblioteca {
	LibroORevista[] publicacion = new LibroORevista[0];

	public void altaLibro(LibroORevista publi) {
		publicacion = Arrays.copyOf(publicacion, publicacion.length + 1);
		publicacion[publicacion.length - 1] = publi;

	}

	public void bajaLibro(Integer codigo) {
		for (int i = 0; i < publicacion.length; i++) {
			if (publicacion[i].getCodigo().equals(codigo)) {
				for (int j = i; j < publicacion.length - 1; j++) {
					publicacion[j] = publicacion[j + 1];
				}
				publicacion = Arrays.copyOf(publicacion, publicacion.length - 1);
			}
		}

	}

}
