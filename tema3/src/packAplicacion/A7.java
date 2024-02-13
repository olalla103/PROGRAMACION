package packAplicacion;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, diva = 0, divb = 0;
		boolean flag = false;

		System.out.println("Introduzca un número:");
		a = sc.nextInt();
		System.out.println("Introduzca un número:");
		b = sc.nextInt();

		if (a < b) {
			for (int i = b; i > 0 && !flag; i--) {
				diva = a % i;
				divb = b % i;
				if (diva == divb) {
					System.out.println(i);
					flag = true;
				}
			}
		} else {
			for (int i = a; i > 0 && !flag; i--) {
				diva = a % i;
				divb = b % i;
				if (diva == divb) {
					System.out.println(i);
					flag = true;
				}
			}

		}

		sc.close();

	}

}
