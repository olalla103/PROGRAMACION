package packAplicacion;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Introduzca un número: ");
		n = sc.nextInt();

		n = n < 0 ? Math.abs(n) : n;
		System.out.println(n);

		sc.close();

	}

}
