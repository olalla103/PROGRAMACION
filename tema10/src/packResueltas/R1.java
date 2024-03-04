package packResueltas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class R1 {
	public static void main(String[] args) {
		leerEntero();
	}

	public static Integer leerEntero() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean flag = true;

		while (flag) {
			try {
				System.out.println("Introduzca un número:");
				n = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("El carácter introducido no es un número.");
				flag = false;
			}
		}
		sc.close();
		return n;
	}

}
