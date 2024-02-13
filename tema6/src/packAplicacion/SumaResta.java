package packAplicacion;

import java.util.Scanner;

public class SumaResta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] matriz1, matriz2;
		int aX, aY, bX, bY;
		boolean flag = false;

		do {
			System.out.println("Introduzca el tamaño 1 de la matriz 1:");
			aX = sc.nextInt();
			System.out.println("Introduzca el tamaño 2 de la matriz 1:");
			aY = sc.nextInt();
			System.out.println("Introduzca el tamaño 1 de la matriz 2:");
			bX = sc.nextInt();
			System.out.println("Introduzca el tamaño 2 de la matriz 2:");
			bY = sc.nextInt();
			if (aX != bX || aY != bY) {
				System.out.println(
						"No se puede realizar ni una suma ni una resta, la matriz debe tener las mismas dimensiones.");
				System.out.println("Introduzca nuevas dimensiones:\n");
			} else {
				flag = true;
			}

		} while (!flag);
		matriz1 = new int[aX][aY];
		matriz2 = new int[bX][bY];

		rellenaMatriz(matriz1);
		rellenaMatriz(matriz2);
		muestraMatriz(matriz1);
		muestraMatriz(matriz2);
		System.out.println("Suma de matriz 1 y matriz 2:");
		muestraMatriz(suma(matriz1, matriz2));
		System.out.println("Resta de matriz 1 y matriz 2:");
		muestraMatriz(resta(matriz1, matriz2));

		sc.close();
	}

	public static int[][] suma(int[][] m1, int[][] m2) {
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m1[i][j] += m2[i][j];
			}
		}
		return m1;
	}

	public static int[][] resta(int[][] m1, int[][] m2) {
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m1[i][j] -= m2[i][j];
			}
		}
		return m1;
	}

	public static void rellenaMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 9 + 1);
			}
		}
	}

	public static void muestraMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	

}
