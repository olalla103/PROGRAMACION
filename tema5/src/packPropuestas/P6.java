package packPropuestas;

import java.util.Arrays;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = { 12, 27, 33, 38, 72, 92 };
		int borra = 33;
		tabla = borrarTablaOrdenada(tabla, borra);
	}

	public static int[] borrarTablaOrdenada(int[] tabla, int borra) {
		int indiceBorrado;

		indiceBorrado = Arrays.binarySearch(tabla, borra);
		if (indiceBorrado >= 0) {
			System.arraycopy(tabla, indiceBorrado + 1, tabla, indiceBorrado, tabla.length - indiceBorrado - 1);
			tabla = Arrays.copyOf(tabla, tabla.length - 1);
			System.out.println(Arrays.toString(tabla));
		} else {
			System.out.println("El número no se encuentra en la tabla.");
		}
		return tabla;

	}
}
