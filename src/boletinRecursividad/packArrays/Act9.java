package boletinRecursividad.packArrays;

public class Act9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = { 1, 2, 3, 4, 5 };
		int i = 0, max = 0, min = tabla.length - 1;
		maxMin(tabla, i, max, min);

	}

	public static void maxMin(int[] tabla, int i, int max, int min) {
		if (i == tabla.length) {
			System.out.println("El máximo es: " + max + "\nEl mínimo es: " + min);
		} else {
			if (tabla[i] > max) {
				max = tabla[i];
			}
			if (tabla[i] < min) {
				min = tabla[i];
			}
			i++;
			maxMin(tabla, i, max, min);

		}
	}

}
