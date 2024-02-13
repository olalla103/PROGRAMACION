package packArrays;

public class Act8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = { 1, 2, 3, 4, 5 };
		int i = 0, suma = 0;
		sumaVectores(tabla, i, suma);

	}

	public static void sumaVectores(int[] tabla, int i, int suma) {

		if (i == tabla.length - 1) {
			suma += tabla[i];
			System.out.println(suma);
		} else {
			suma += tabla[i];
			i++;
			sumaVectores(tabla, i, suma);

		}
	}
}
