package packResueltas;

import java.util.Scanner;

public class R3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int longitud;
		int[] tabla;

		System.out.println("Introduzca la longitud:");
		longitud = sc.nextInt();
		tabla = new int[longitud];

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un número:");
			tabla[i] = sc.nextInt();
		}
		System.out.println();
		muestraTablaAlReves(tabla);

		sc.close();

	}

	public static int[] rellenaTablaInt(int n, int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = n;
		}
		return tabla;

	}

	public static void muestraTablaAlReves(int[] tabla) {
		for (int i = tabla.length - 1; i >= 0; i--) {
			System.out.println(tabla[i]);
		}

	}
}
