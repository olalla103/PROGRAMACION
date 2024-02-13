package packActsClase;

import java.util.Scanner;

public class Rombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, cont = 2;

		do {
			System.out.print("Introduce la n de la rombo: ");
			n = sc.nextInt();
		} while (!(n % 2 == 1 && n >= 3));

		for (int i = 0; i < (n / 2) + 1; i++) {
			for (int j = (n / 2) + 1; j < n - i; j++) {
				System.out.print("- ");
			}
			for (int k = 2 * i + 1; k > 0; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n / 2; i > 0; i--) {
			for (int j = 1; j < cont; j++) {
				System.out.print("- ");
			}
			cont++;
			for (int k = i * 2 - 1; k > 0; k--) {
				System.out.print("* ");
				
			}
			System.out.println();

		}

		sc.close();

	}

}
