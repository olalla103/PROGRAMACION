package tema5.packPropuestas;

import java.util.Arrays;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		insercionOrdenada(tabla, 5);

	}

	public static void insercionOrdenada(int[] tabla, int nuevo) {
		int indiceInsercion = Arrays.binarySearch(tabla, nuevo);

		if (indiceInsercion < 0) {
			indiceInsercion = -indiceInsercion - 1;
		}
		int[] copia = new int[tabla.length + 1];
		System.arraycopy(tabla, 0, copia, 0, indiceInsercion);
		System.arraycopy(tabla, indiceInsercion, copia, indiceInsercion + 1, tabla.length - indiceInsercion);
		copia[indiceInsercion] = nuevo;
		tabla = copia;
		System.out.println(Arrays.toString(tabla));
	}
}
