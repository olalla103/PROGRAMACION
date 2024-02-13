package packResueltas;

public class R6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 456;
		System.out.println(esPrimo(n));
	}

	public static boolean esPrimo(int n) {
		boolean primo = true;
		int i = 2;
		if (n < 2) {
			primo = false;
		}
		while (i < n && primo == true) {
			if (n % i == 0) {
				primo = false;
			}
			i++;

		}
		return primo;
	}

}
