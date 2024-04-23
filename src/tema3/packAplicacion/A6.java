package tema3.packAplicacion;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la altura de la pirámide: ");
		int altura = sc.nextInt();

		for (int i = 1; i <= altura; i++) {
			// Imprimir espacios en blanco
			for (int j = 1; j <= altura - i; j++) {
				System.out.print("-");
			}

			// Imprimir asteriscos y espacios en la misma línea
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			// Ir a la siguiente línea
			System.out.println();
		}
		sc.close();

	}

}
