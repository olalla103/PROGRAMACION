package tema5.packResueltas;

import java.util.Arrays;
import java.util.Scanner;

public class R6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] boleto = new int[6];
		int[] resultado = { 4, 2, 1, 5, 8, 2 };

		// resultado = rellenaTabla(resultado.length);
		muestraTabla(resultado);
		System.out.println();

		for (int i = 0; i < boleto.length; i++) {
			System.out.println("Introduzca un número:");
			boleto[i] = sc.nextInt();
		}
		System.out.println("Ha acertado un total de: " + compara(boleto, resultado) + " números.");

		sc.close();

	}

	public static int compara(int[] tabla1, int[] tabla2) {
		int acierto = 0;
		boolean encontrado = false;
		Arrays.sort(tabla2);

		for (int i = 0; i < tabla2.length; i++) {
			encontrado = false;
			for (int j = 0; j < tabla1.length && !encontrado; j++) {
				if (tabla2[i] == tabla1[j]) {
					acierto++;
					encontrado = true;
				}

			}
			/*
			 * if (acierto == tabla2.length) { System.out.println("Ha ganado la lotería!");
			 * }
			 */
		}

		return acierto;

	}

	public static int[] rellenaTabla(int longitud) {
		int[] tabla = new int[longitud];
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * (10 - 1 + 1) + 1);

		}
		return tabla;

	}

	public static void muestraTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}

	}

}
