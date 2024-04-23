package tema3.packResueltas;

import java.util.Scanner;

public class R15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Introduzca un número:");
		n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		
		sc.close();

	}

}
