package packAplicacion;

import java.util.Scanner;

public class MatrizTraspuesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int long1, long2;
		int[][] matriz;

		System.out.println("Introduzca la primera longitud:");
		long1 = sc.nextInt();
		System.out.println("Introduzca la segunda longitud:");
		long2 = sc.nextInt();
		matriz = new int[long1][long2];

		rellenaMatriz(matriz);
		muestraMatriz(matriz);
		System.out.println();
		muestraMatriz(traspuesta(matriz, long1, long2));

		sc.close();

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
	}

	public static int[][] traspuesta(int[][] matriz, int long1, int long2) {
		int[][] tras = new int[long2][long1];

		for (int i = 0; i < tras.length; i++) {
			for (int j = 0; j < tras[i].length; j++) {
				tras[i][j] = matriz[j][i];
			}
			System.out.println();
		}
		return tras;
	}
}
