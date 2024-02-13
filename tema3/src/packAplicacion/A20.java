package packAplicacion;

import java.util.Scanner;

public class A20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, total = 0;

		do {
			System.out.println("Introduzca una cantidad de dinero:");
			n = sc.nextInt();
			total += n;

		} while (n != 0);
		System.out.println("Tiene una cantidad de: " + total + " euros.");

		sc.close();

	}

}
