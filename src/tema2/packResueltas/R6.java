package tema2.packResueltas;

import java.util.Scanner;

public class R6 {

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
			if (n1 > n2) {
				System.out.println();
				System.out.println(n2 + "\n" + n1);

			} else {
				System.out.println();
				System.out.println(n1 + "\n" + n2);
			}
		}
		sc.close();

	}

}
