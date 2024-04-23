package tema2.packResueltas;

import java.util.Scanner;

public class R4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n;
		System.out.println("Introduzca un número decimal:");
		n = sc.nextDouble();
		if (-1 < n && n < 1 && n != 0) {
			System.out.println("Es cercano a 0");
		} else {
			System.out.println("No es cercano a 0");
		}

		sc.close();

	}

}
