package tema2.packResueltas;

import java.util.Scanner;

public class R7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Introduzca un número: ");
		a = sc.nextInt();
		System.out.println("Introduzca un número: ");
		b = sc.nextInt();
		System.out.println("Introduzca un número: ");
		c = sc.nextInt();

		if (a > b && b > c && a > c) {
			System.out.println(a + " " + b + " " + c);
		} else if (a > b && c > b && a > c) {
			System.out.println(a + " " + c + " " + b);
		} else if (b > a && a > c && b > c) {
			System.out.println(b + " " + a + " " + c);
		} else if (b > a && c > a && b > c) {
			System.out.println(b + " " + c + " " + a);
		} else if (c > a && a > b && c > b) {
			System.out.println(c + " " + a + " " + b);
		} else if (c > a && b > a && c > b) {
			System.out.println(c + " " + b + " " + a);
		}
		sc.close();

	}

}
