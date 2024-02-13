package packActsClase;

import java.util.Scanner;

public class PiramideVacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Introduzca un n:");
		n = sc.nextInt();

		for (int i =0 ; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				if (k == 1 || i == n || k == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}

			System.out.println("");
		}
		sc.close();

	}

}
