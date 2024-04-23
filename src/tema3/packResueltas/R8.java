package tema3.packResueltas;

import java.util.Scanner;

public class R8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, total = 0, media = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca un número:");
			n = sc.nextInt();
			total += n;
			media = i;
		}
		System.out.println("La media de los números introducidos es: " + (total / media));

		sc.close();
	}

}
