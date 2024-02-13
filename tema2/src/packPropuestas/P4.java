package packPropuestas;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;

		System.out.println("Introduzca un número: ");
		n1 = sc.nextInt();
		System.out.println("Introduzca un número: ");
		n2 = sc.nextInt();

		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		sc.close();

	}

}
