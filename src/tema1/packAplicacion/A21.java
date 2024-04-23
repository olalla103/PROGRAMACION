package tema1.packAplicacion;

import java.util.Scanner;

public class A21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;

		System.out.println("Introduzca un número: ");
		a = sc.nextInt();
		System.out.println("Introduzca un número: ");
		b = sc.nextInt();
		if (a == b) {
			System.out.println("Son iguales.");
		} else {
			System.out.println("No son iguales.");
		}
		sc.close();

	}

}
