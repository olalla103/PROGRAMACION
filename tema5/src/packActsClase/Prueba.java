package packActsClase;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] tabla = new int[10];
		// int[] tabla = { 1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10 };
		int n = 0, indicador = 0, pos = 4;
		muestraTabla(tabla);
		System.out.println();
		do {
			System.out.println("Introduce:");
			n = sc.nextInt();
			tabla = insertarPos(tabla, n, pos, indicador);
			muestraTabla(tabla);
			indicador++;
			System.out.println();
		} while (indicador != 10);
		sc.close();

	}

	public static int[] insertarPos(int[] tabla, int n, int pos, int indicador) {
		int[] aux = new int[tabla.length];
		if (indicador == 10) {
			System.out.println("No se pueden insertar más números, la tabla está completa.");
		}
		// muevo los números a la izquierda
		aux[pos] = n;
		for (int i = pos; i < tabla.length - 1; i++) {
			aux[i + 1] = tabla[i];
		}
		indicador++;

		return aux;
	}

	public static void muestraTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}

	}

}
