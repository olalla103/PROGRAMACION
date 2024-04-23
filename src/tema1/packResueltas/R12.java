package tema1.packResueltas;

import java.util.Scanner;

public class R12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Introduzca un número cualquiera, tanto negativo como positivo: ");
		n = sc.nextInt();
		System.out.println("El valor absoluto de su número es: " + Math.abs(n));

		sc.close();
	}

}
