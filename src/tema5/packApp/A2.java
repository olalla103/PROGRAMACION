package tema5.packApp;

import java.util.Arrays;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10 };
		desordenar(tabla);

	}

	public static void desordenar(int[] tabla) {
		int[] aux = new int[tabla.length];
		int pos;

		for (int i = 0; i < aux.length; i++) {
			pos = (int) (Math.random() * ((aux.length - 1) - 0 + 1) + 0);
			if (aux[pos] <= 0) {
				aux[pos] = tabla[i];
			} else {
				i--;
			}

		}
		System.out.println(Arrays.toString(aux));

	}
}
