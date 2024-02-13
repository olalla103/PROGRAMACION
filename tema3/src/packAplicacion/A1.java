package packAplicacion;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, resultado = 0;

		System.out.println("Introduzca un número:");
		n = sc.nextInt();

		while (n > 0) {
			resultado = n % 2;
			System.out.print(resultado + " ");
			n = n / 2;
		}

		sc.close();

	}

}
