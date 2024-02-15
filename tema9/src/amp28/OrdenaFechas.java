package amp28;

import java.util.Comparator;

public class OrdenaFechas implements Comparator<Object> {

	// Si el dni y es igual, pasamos a la fecha de la jornada
	@Override
	public int compare(Object o1, Object o2) {
		if (((Jornada) o1).dni.compareTo(((Jornada) o2).dni) == 0) {
			return ((Jornada) o1).fecha.compareTo(((Jornada) o2).fecha);
		} else {
			return ((Jornada) o1).dni.compareTo(((Jornada) o2).dni);
		}
	}

}
