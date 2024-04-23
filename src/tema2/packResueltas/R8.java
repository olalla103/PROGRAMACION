package tema2.packResueltas;

import java.util.Scanner;

public class R8 {

	public static void main(String[] args) {
		// variables y scanner
		Scanner sc = new Scanner(System.in);
		double r1, a, b, c, x1, x2;

		// Programa
		System.out.println("Introduzca un número: ");
		a = sc.nextDouble();
		System.out.println("Introduzca un número: ");
		b = sc.nextDouble();
		System.out.println("Introduzca un número: ");
		c = sc.nextDouble();

		r1 = -b + Math.sqrt(b * b - 4 * a * c);
		if (r1 < 0) {
			System.out.println("No existen soluciones reales.");
		} else {
			if (a == 0) {
				System.out.println("No es una ecuación de segundo grado.");
			} else {
				x1 = (-b + Math.sqrt(r1)) / (2 * a);
				x2 = (-b - Math.sqrt(r1)) / (2 * a);
				System.out.println("Solución 1: " + x1 + "\nSolución 2: " + x2);
			}

		}
		sc.close();

	}

}
