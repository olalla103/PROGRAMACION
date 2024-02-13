package packResueltas;

public class R1 {

	public static void main(String[] args) {
		// VARIABLES
		int[] aleatorios = new int[10];
		int n, total = 0;

		// RELLENAMOS LA TABLA CON NÚMEROS ALEATORIOS
		for (int i = 0; i < aleatorios.length; i++) {
			n = (int) (Math.random() * (100 - 1 + 1) + 1);
			aleatorios[i] = n;
			total += aleatorios[i];
		}
		System.out.println(total);
	}

}
