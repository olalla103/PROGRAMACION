package amp26;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalendarioExacto a1 = new CalendarioExacto(31, 12, 2004, 23, 59, 59);
		System.out.println(a1.toString());
		a1.incrementasegundo();
		System.out.println(a1.toString());
	}

}
