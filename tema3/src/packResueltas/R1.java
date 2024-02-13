package packResueltas;

import java.util.Scanner;

public class R1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Introduzca un número:");
		n = sc.nextInt();

		while (n != 0) {
			if (n > 0) {
				System.out.println("Número positivo.");
			} else {
				System.out.println("Número negativo.");
			}
			if (n % 2 == 0) {
				System.out.println("Es par.");
			} else {
				System.out.println("Es impar.");
			}
			System.out.println("Su cuadrado es: "+Math.pow(n, 2));

			System.out.println("Introduzca un número:");
			n = sc.nextInt();
		}
		sc.close();
	}

}
