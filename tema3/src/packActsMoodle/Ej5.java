package packActsMoodle;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		boolean esPrimo;

		System.out.println("Introduzca un número:");
		n = sc.nextInt();
		for (int i = n; i < n + 5; i++) {
			esPrimo=false;
			for (int j = 2; j < i - 1 && !esPrimo; j++) {
				
				if (i % j == 0) {
					esPrimo = true;
				}

			}
			System.out.print(i + " ->");
			if (esPrimo) {
				System.out.println(" no primo");
			} else {
				System.out.println(" primo");
			}
	

		}

		sc.close();
	}

}
