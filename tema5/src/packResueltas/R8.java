package packResueltas;

import java.util.Arrays;
import java.util.Scanner;

public class R8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] tabla;
		int n;

		System.out.println("Introduzca cuántas posiciones desea en la tabla:");
		n = sc.nextInt();
		tabla = new int[n];
		rellenaTabla(tabla);
		System.out.println("Tabla sin separar:");
		listarTabla(tabla);
		paresImpares(tabla);

		sc.close();

	}

	public static void paresImpares(int[] tabla) {
		int[] pares = new int[0];
		int[] impares = new int[0];
		for (int e : tabla) {
			if (e % 2 == 0) {
				pares = Arrays.copyOf(pares, pares.length + 1);
				pares[pares.length - 1] = e;
			} else {
				impares = Arrays.copyOf(impares, impares.length + 1);
				impares[impares.length - 1] = e;
			}
		}
		System.out.println("Tabla con pares:");
		Arrays.sort(pares);
		listarTabla(pares);
		System.out.println("Tabla con impares:");
		Arrays.sort(impares);
		listarTabla(impares);
	}

	public static void rellenaTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * (10 - 1 + 1) + 1);
		}

	}

	public static void listarTabla(int[] tabla) {
		System.out.println(Arrays.toString(tabla));
		System.out.println();
	}

}
