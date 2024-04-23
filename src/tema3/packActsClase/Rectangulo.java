package tema3.packActsClase;

import java.util.Scanner;

public class Rectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Introduzca un número:");
		n = sc.nextInt();

		if (n % 2 == 0) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n * 2; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		} else {
			System.out.println("El número introducido debe ser par.");
		}
		sc.close();

	}

}
