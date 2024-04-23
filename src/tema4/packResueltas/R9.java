package tema4.packResueltas;

public class R9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 3, n2 = 3, n3 = 3;
		System.out.println("El máximo es: " + maxMin(n1, n2, n3));

	}

	public static int maxMin(int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3) {
			return n1;
		} else if (n2 > n1 && n2 > n3) {
			return n2;
		} else if (n3 > n1 && n3 > n2) {
			return n3;
		} else {
			return n1;
		}
	}
}
