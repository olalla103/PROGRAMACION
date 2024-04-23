package tema9.resuelta9_1234_Prop_12;

import java.util.Scanner;

public class PpalCola {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Lista lista = new Lista();

		System.out.println("Introduzca un número:");
		n = sc.nextInt();
		while (n > 0) {
			lista.encolar(n);
			System.out.println(lista.toString());
			System.out.println("Introduzca un número:");
			n = sc.nextInt();
			lista.eliminar();
		}
		System.out.println(lista.toString());
		sc.close();

	}

}
