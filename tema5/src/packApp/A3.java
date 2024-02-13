package packApp;

import java.util.Arrays;

public class A3 {

	public static void main(String[] args) {
		int[] tabla = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10 };
		tabla = desordenar(tabla);
		System.out.println(Arrays.toString(tabla));

	}

	public static int[] desordenar(int[] tabla) {
		int[] aux = new int[tabla.length];
		int pos;

		for (int i = 0; i < tabla.length; i++) {
			pos = (int) (Math.random() * ((aux.length - 1) - 0 + 1) + 0);
			if (aux[pos] <= 0) {
				aux[pos] = tabla[i];
			} else {
				i--;
			}

		}
		return aux;

	}

}
