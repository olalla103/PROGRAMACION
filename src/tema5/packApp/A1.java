package tema5.packApp;

import java.util.Arrays;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10 };
		int[] nueva = new int[0];
		nueva = buscarTodos(tabla, 5);
		System.out.println(Arrays.toString(nueva));

	}

	public static int[] buscarTodos(int[] tabla, int clave) {
		int[] indices = new int[0];

		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == clave) {
				indices = Arrays.copyOf(indices, indices.length + 1);
				indices[indices.length - 1] = i;
			}
		}

		return indices;
	}
}
