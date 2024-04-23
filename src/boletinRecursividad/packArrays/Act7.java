package boletinRecursividad.packArrays;

public class Act7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = { 1, 2, 3, 4, 5 };
		int i = tabla.length - 1;
		muestraTabla(tabla, i);

	}

	public static void muestraTabla(int[] tabla, int i) {
		if (i == 0) {
			System.out.print(tabla[i]);
		} else {
			System.out.print(tabla[i] + " ");
			i--;
			muestraTabla(tabla, i);

		}
	}
}
