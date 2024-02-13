package app13;

import java.util.Comparator;

public class ComparaEdadNombres implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if (((Futbolista) o1).getEdad() == ((Futbolista) o2).getEdad()) {

			return ((Futbolista) o1).getNombre().compareTo(((Futbolista) o2).getNombre());
		} else {
			return ((Futbolista) o1).getEdad() - ((Futbolista) o2).getEdad();
		}

	}

}
