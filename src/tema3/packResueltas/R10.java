package tema3.packResueltas;

public class R10 {

	public static void main(String[] args) {

		int n = 0;

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1) {
				n += i;
			}
		}
		System.out.println("La suma de todos los números impares hasta 10 es: " + n);
	}

}
