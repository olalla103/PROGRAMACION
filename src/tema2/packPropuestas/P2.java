package tema2.packPropuestas;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Introduzca un número: ");
		n = sc.nextInt();
		if (n > 0) {
			System.out.println("Es positivo.");
		} else {
			System.out.println("Es negativo.");
		}

		sc.close();
	}

}
