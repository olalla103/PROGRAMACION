package packResueltas;

import java.util.Scanner;

public class R10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Introduzca una nota sin decimales:");
		n = sc.nextInt();
		switch (n) {
		case 0, 1, 2, 3, 4:
			System.out.println("Nota insuficiente.");
			break;
		case 5, 6:
			System.out.println("Nota suficiente.");
			break;

		case 7, 8:
			System.out.println("Notable.");
			break;

		case 9, 10:
			System.out.println("Sobresaliente.");
			break;

		default:
			System.out.println("Esa nota no está entre 0 y 10.");

		}
		sc.close();

	}

}
