package tema3.packResueltas;

import java.util.Scanner;

public class R9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Introduzca un número:");
		n = sc.nextInt();

		if (n > 0 && n < 11) {
			for (int i = 0; i <= 10; i++) {
				System.out.println(n + " x " + i + " = " + (n * i));
			}
		} else {
			System.out.println("El número introducido no se encuentra en el rango establecido.");
		}

		sc.close();

	}

}
