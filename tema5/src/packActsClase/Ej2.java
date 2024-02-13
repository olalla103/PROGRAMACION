package packActsClase;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cuentaPares = 0;
		int[] tabla = new int[10];
		tabla = rellenaTablaInt(tabla);

		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] % 2 == 0) {
				cuentaPares++;
			}
		}
		System.out.println("Hay un total de: " + cuentaPares + " números pares.");

	}

	public static int[] rellenaTablaInt(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * (10 - 1 + 1) + 1);
		}
		return tabla;

	}

}
