package tema5.packApp;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] tabla = new int[4][4];

		tabla = rellenaMatriz(tabla);
		muestraMatriz(tabla);

	}

	public static int[][] rellenaMatriz(int[][] tabla) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.println("Introduzca un número:");
				tabla[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return tabla;
	}

	public static void muestraMatriz(int[][] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
	}

}
