package biblioteca;

import java.util.Comparator;

public class OrdenaAutores implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		return ((Libro) o1).getAutor().compareTo(((Libro) o2).getAutor());
	}

}
