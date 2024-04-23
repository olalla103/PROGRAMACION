package tema8.r123;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hora h1 = new Hora(23, 59);
		HoraExacta h2 = new HoraExacta(23, 59, 59);
		HoraExacta h3 = new HoraExacta(23, 59, 59);
		h1.incrementa();
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h2.equals(h3));

	}

}
