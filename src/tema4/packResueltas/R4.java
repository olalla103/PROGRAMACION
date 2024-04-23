package tema4.packResueltas;

import java.util.Scanner;

public class R4 {

	public static void main(String[] args) {
		// VARIABLES Y SCANNER
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduzca un número:");
		n1 = sc.nextInt();
		System.out.println("Introduzca un número:");
		n2 = sc.nextInt();
		System.out.println("El máximo de ambos números es: " + maxMin(n1, n2));

		sc.close();

	}

	public static int maxMin(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}

}
