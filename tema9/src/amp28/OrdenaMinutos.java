package amp28;

import java.util.Comparator;

public class OrdenaMinutos implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Jornada) o2).getCantidadMinutos() - ((Jornada) o1).getCantidadMinutos();
	}

}
