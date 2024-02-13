package app21;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Conjunto a = new Conjunto();
		Conjunto c = new Conjunto(b);
		System.out.println(a.insertarConjunto(c));
		System.out.println(a.insertarElemento(10));
		a.muestra();
		a.eliminarConjunto(c);
		a.muestra();
		a.eliminarElemento(10);
		a.muestra();

	}

}
