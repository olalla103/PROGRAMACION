package tema9.resuelta9_56;

import java.util.Scanner;

public class Ppal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Cola cola = new Cola();

		System.out.println("Introduzca un número:");
		n = sc.nextInt();
		while (n > 0) {
			cola.encolar(n);
			System.out.println(cola.toString());
			System.out.println("Introduzca un número:");
			n = sc.nextInt();
			cola.desencolar();
		}
		System.out.println(cola.toString());
		sc.close();
	}
}
