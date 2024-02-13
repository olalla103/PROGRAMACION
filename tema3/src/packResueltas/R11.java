package packResueltas;

import java.util.Scanner;

public class R11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, n2 = 0;

		System.out.println("Introduzca un número: ");
		n = sc.nextInt();
		for (int i = n; i > 0; i--) {
			n2 += i;

		}
		System.out.println(n * n2);
		sc.close();
	}

}
