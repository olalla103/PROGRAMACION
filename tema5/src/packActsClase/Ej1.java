package packActsClase;

public class Ej1 {

	public static void main(String[] args) {
		// VARIABLES
		int[] tabla = new int[10];
		rellenaTablaInt(tabla);
		muestraTabla(tabla);

	}

	public static int[] rellenaTablaInt(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = i;
		}
		return tabla;

	}

	public static void muestraTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(tabla[i]);
		}

	}
}
