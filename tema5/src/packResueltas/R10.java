package packResueltas;

import java.util.Arrays;

public class R10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = { 1, 2, 3, 4, 5, 6, -1, 0, 7, 8 };
		listarTabla(tabla);
		tabla = eliminarMayores(tabla, 4);
		listarTabla(tabla);
	}

	public static int[] eliminarMayores(int[] tabla, int valor) {
		int[] copia = Arrays.copyOf(tabla, tabla.length);
		int i = 0;

		while (i < copia.length) {
			if (copia[i] > valor) {
				copia[i] = copia[copia.length - 1];
				copia = Arrays.copyOf(copia, copia.length - 1);
			} else {
				i++;
			}
		}
		return copia;
	}

	public static void listarTabla(int[] tabla) {
		System.out.println(Arrays.toString(tabla));

	}

}
