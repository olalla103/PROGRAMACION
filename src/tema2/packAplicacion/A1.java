package tema2.packAplicacion;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int u, d, c, um, x1, x2, n;

		System.out.println("Dime un número comprendido entre 0 y 9999");
		n = sc.nextInt();

		u = n % 10;
		x1 = n / 10;
		d = x1 % 10;
		x2 = x1 / 10;
		c = x2 % 10;
		um = x2 / 10;

		if (n >= 0 && n <= 9) {
			System.out.println("El número no puede ser capiúa ya que solo tiene 1 cifra.");
		} else if (um == 0 && c == 0) {
			if (d == u) {
				System.out.println("El número es capicúa.");
			} else {
				System.out.println("El número no es capicúa.");
			}
		} else if (um == 0) {
			if (c == u) {
				System.out.println("El número es capicúa.");
			} else {
				System.out.println("El número no es capicúa.");
			}
		} else {
			if (um == u && d == c) {
				System.out.println("El número es capicúa.");
			} else {
				System.out.println("El número no es capicúa.");
			}
		}
		sc.close();

	}

}
