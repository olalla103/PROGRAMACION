package packPropuestas;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, a = 0, b;

		System.out.println("Introduzca un número positivo:");
		n = sc.nextInt();
		b = n;
		
		for (int i = b; i > 0; i--) {
			a = b % 10;
			System.out.println(a);
			b = b / 10;
			i = b + 1;

		}
		
		sc.close();

	}

}
