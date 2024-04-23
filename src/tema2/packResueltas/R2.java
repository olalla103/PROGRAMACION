package tema2.packResueltas;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduzca un número: ");
		n1 = sc.nextInt();
		System.out.println("Introduzca un número: ");
		n2 = sc.nextInt();
		if (n1 == n2) {
			System.out.println("Son iguales.");
		} else {
			System.out.println("Son diferentes.");
		}

		sc.close();

	}

}
