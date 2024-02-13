package packResueltas;

import java.util.Scanner;

public class R9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Introduzca un número comprendido entre 0 y 99999:");
		n = sc.nextInt();
		if (n < 0) {
			System.out.println("El número introducido no es válido.");
		} else if (n < 10) {
			System.out.println("Su número tiene 1 cifra.");
		} else if (n >= 10 && n < 100) {
			System.out.println("Su número tiene 2 cifras.");
		} else if (n >= 100 && n < 1000) {
			System.out.println("Su número tiene 3 cifras.");
		} else if (n >= 1000 && n < 10000) {
			System.out.println("Su número tiene 4 cifras.");
		} else if (n >= 10000 && n < 1000000) {
			System.out.println("Su número tiene 5 cifras.");
		}
		
		sc.close();

	}

}
