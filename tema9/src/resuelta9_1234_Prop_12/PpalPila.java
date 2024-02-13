package resuelta9_1234_Prop_12;

import java.util.Scanner;

public class PpalPila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		Lista lista = new Lista();

		System.out.println("Introduzca un número:");
		n = sc.nextInt();
		while (n > 0) {
			lista.empilar(n);
			System.out.println(lista.toString());
			System.out.println("Introduzca un número:");
			n = sc.nextInt();
			lista.desempilar();
		}
		System.out.println(lista.toString());
		sc.close();

	}

}
