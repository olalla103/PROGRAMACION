package packResueltas;

import java.util.Arrays;

public class R5 {

	public static void main(String[] args) {
		// VARIABLES
		int longitud = 10, fin = 100;

		// LLAMADA A LA FUNCIÓN
		rellenaPares(longitud, fin);

	}

	public static int[] rellenaPares(int longitud, int fin) {
		int[] tabla = new int[longitud];
		int n;

		for (int i = 0; i < tabla.length; i++) {
			do {
				n = (int) (Math.random() * (fin - 2) + 2);
			} while (n % 2 != 0);

			tabla[i] = n;

		}
		Arrays.sort(tabla);
		muestraTabla(tabla);

		return tabla;
	}

	public static void muestraTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}

	}

}
