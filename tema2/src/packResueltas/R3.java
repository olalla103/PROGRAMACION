package packResueltas;

import java.util.Scanner;

public class R3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduzca un número: ");
		n1 = sc.nextInt();
		System.out.println("Introduzca un número: ");
		n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println(n1 + " es mayor que " + n2);
		} else {
			System.out.println(n2 + " es mayor que " + n1);
		}

		sc.close();

	}

}
