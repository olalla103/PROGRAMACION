package packResueltas;

public class R4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = { 1, 2, 3, 4, 5, 80, 97, 65, 4342, 14 };
		System.out.println(maximo(tabla));

	}

	public static int maximo(int[] tabla) {
		int max = 0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] > max) {
				max = tabla[i];
			}
		}
		return max;
	}
}
