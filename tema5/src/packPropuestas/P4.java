
package packPropuestas;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// VARIABLES
		Scanner sc = new Scanner(System.in);
		int n;
		int[] tabla = { 1, 2, 3, 4, 67, 0, 8, 200, 23, 45, 10, 30, 70 };

		// EJECUCIÓN
		muestraTabla(tabla);
		System.out.println();
		System.out.println("Introduzca el número que desea buscar: ");
		n = sc.nextInt();
		buscar(tabla, n);

		sc.close();

	}

	public static void muestraTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}

	}

	public static int buscar(int[] tabla, int clave) {
		boolean encontrado = false;
		int pos = 0;
		
		for (int i = 0; i < tabla.length && !encontrado; i++) {
			if (tabla[i] == clave) {
				encontrado = true;
				pos = i;
			}
		}
		System.out.println("Número encontrado en la posición: " + pos);
		return pos;

	}

}
