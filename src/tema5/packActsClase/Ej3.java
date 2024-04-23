package tema5.packActsClase;

public class Ej3 {

	public static void main(String[] args) {
		// VARIABLES
		int max = 0, min = 0;
		double media = 0;
		int[] tabla = new int[10];
		tabla = rellenaTablaInt(tabla);
		max = tabla[0];
		min = tabla[0];
		
		for (int i = 1; i < tabla.length; i++) {
			if (tabla[i] > max) {
				max = tabla[i];
			}
			if (tabla[i] < min) {
				min = tabla[i];
			}

		}

		muestraTabla(tabla);
		System.out.println(
				"El mínimo es: " + min + "\nEl máximo es: " + max + "\nLa media es: " + (media / tabla.length));

	}

	public static void muestraTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(tabla[i]);
		}

	}

	public static int[] rellenaTablaInt(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * (10 - 1 + 1) + 1);
		}
		return tabla;

	}
}
