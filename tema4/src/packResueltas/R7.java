package packResueltas;

public class R7 {

	public static void main(String[] args) {
		// VARIABLES
		int n = 10;
		System.out.println(numDivisoresPrimos(n));

	}

	public static int numDivisoresPrimos(int n) {
		int cont = 0;
		for (int i = 2; i <= n; i++) {
			if (esPrimo(i) && n % i == 0) {
				cont++;
			}
		}
		return cont;
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
