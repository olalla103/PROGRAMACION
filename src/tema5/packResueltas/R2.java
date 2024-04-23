package tema5.packResueltas;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un número:");
			numeros[i] = sc.nextInt();

		}
		System.out.println();
		muestraTabla(numeros);
		sc.close();

	}

	public static void muestraTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(tabla[i]);
		}

	}
}
