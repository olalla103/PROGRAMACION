package tema3.packAplicacion;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, i = 2;
		boolean esPrimo = true;

		System.out.println("Introduzca un número:");
		n = sc.nextInt();

		while (i < n && esPrimo) {
			if (n % i == 0) {
				esPrimo = false;
			}
			i++;
		}
		System.out.print(n + " ->");
		if (esPrimo) {
			System.out.println(" primo");
		} else {
			System.out.println(" no primo");
		}

		sc.close();

	}

}
