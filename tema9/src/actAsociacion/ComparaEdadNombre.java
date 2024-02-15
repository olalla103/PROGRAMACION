package actAsociacion;

import java.util.Comparator;

public class ComparaEdadNombre implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		if (((Socio) o1).getEdad() == ((Socio) o2).getEdad()) {
			return ((Socio) o1).getnombre().compareTo(((Socio) o2).getnombre());
		} else {
			return ((Socio) o1).getEdad().compareTo((((Socio) o2).getEdad()));
		}
	}

}
