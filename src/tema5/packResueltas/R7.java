package tema5.packResueltas;

import java.util.Arrays;

public class R7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = { 1, 2, 2, 3, 4, 4, 5, 6, 8, 9, 10, 10 };
		System.out.println(Arrays.toString(tabla));
		System.out.println();
		tabla = sinRepetidos(tabla);
		System.out.println(Arrays.toString(tabla));

	}

	public static int[] sinRepetidos(int[] tabla) {
		int[] aux = new int[0];

		for (int i = 0; i < tabla.length; i++) {
			if (buscar(aux, tabla[i]) == -1) {
				aux = Arrays.copyOf(aux, aux.length + 1);
				aux[aux.length - 1] = tabla[i];
			}

		}
		return aux;
	}

	public static int buscar(int[] tabla, int clave) {
		boolean encontrado = false;
		int pos = -1;

		for (int i = 0; i < tabla.length && !encontrado; i++) {
			if (tabla[i] == clave) {
				encontrado = true;
				pos = i;
			}
		}
		return pos;
	}

}
