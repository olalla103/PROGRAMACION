package tema3.packActsMoodle;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Introduzca una altura para el reloj de arena:");
			n = sc.nextInt();
		} while (n < 3 || n % 2 != 1);

		for (int i = 0; i < n; i++) {
			for (int j = n; j > 0; j--) {
				for (int k = 0; k < n; k++) {
					System.out.println("*");
				}
			}
			System.out.println();
		}

		sc.close();

	}

}
