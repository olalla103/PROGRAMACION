package tema8.app14151617181920;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista l1 = new Lista();
		Lista l2 = new Lista();
		l1.aniadir(10);
		l1.aniadir(0);
		l1.aniadir(4);
		l1.aniadir(20);
		l2.aniadir(16);
		l2.aniadir(9);
		l2.aniadir(4);
		l2.aniadir(20);

//		System.out.println(l1.toString());
//		System.out.println(l2.toString());
//		System.out.println(l2.equals(l1));

		// Aplicación 16
		ColaDoble colaDoble = new ColaDoble();
		colaDoble.encolar(10);
		colaDoble.encolar(30);
		colaDoble.encolarPpio(20);
		System.out.println(colaDoble.toString());

		// Aplicación 19
		Conjunto conjunto = new Conjunto();
		Conjunto conjunto2 = new Conjunto();
		conjunto.aniadir(10);
		conjunto.aniadir(20);
		conjunto2.aniadir(10);
		conjunto2.aniadir(10);
		System.out.println(conjunto.equals(conjunto2));
	}

}
