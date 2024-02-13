package packActsMoodle;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, cont = 0, impar = 0, mI = 0, max = 0;

		System.out.println("Introduzca un número:");
		n = sc.nextInt();
		while (n > 0) {
			if (n % 2 == 0) {
				if (n > max) {
					max = n;
				}
			} else {
				mI += n;
				impar++;
			}
			cont++;

			System.out.println("Introduzca un número:");
			n = sc.nextInt();
		}

		System.out.println("Ha introducido un total de " + cont + " números.\nLa media de los números impares es: "
				+ mI / impar + "\nEl máximo de los números pares es: " + max);
		sc.close();

	}

}
