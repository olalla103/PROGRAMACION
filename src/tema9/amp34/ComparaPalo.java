package tema9.amp34;

import java.util.Comparator;

public class ComparaPalo implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		if (((Carta) o1).numero.compareTo(((Carta) o2).numero) == 1) {
			return ((Carta) o1).elegido.compareTo(((Carta) o2).elegido);
		} else {
			return ((Carta) o1).numero.compareTo(((Carta) o2).numero);
		}
	}
}
 