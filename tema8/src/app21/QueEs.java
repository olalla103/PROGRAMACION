package app21;

public class QueEs {

	public static boolean esNumero(Object ob) {
		if (ob.getClass() == Integer.class) {
			return true;
		} else if (ob.getClass() == Double.class) {
			return true;
		} else if (ob.getClass() == Long.class) {
			return true;
		} else if (ob.getClass() == Float.class) {
			return true;
		} else {
			return false;
		}

	}

	public boolean sumar(Object ob1, Object ob2) {
		// también se puede hacer con ob1.getClass().getName()
		// java.lang.String
		if (ob1.getClass().getName().equals("java.lang.String")
				&& ob2.getClass().getName().equals("java.lang.String")) {
			System.out.println((String) ob1 + (String) ob2);
			return true;
		} else if (ob1.getClass().getName().equals("java.lang.Number")
				&& ob2.getClass().getName().equals("java.lang.Number")) {
			System.out.println((Double) ob1 + (Double) ob2);
			return true;
		} else {
			return false;
		}
	}
}
