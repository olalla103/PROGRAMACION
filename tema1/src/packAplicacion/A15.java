package packAplicacion;

import java.util.Scanner;

public class A15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b, c, total;
		final int x;
		System.out.println("Introduzca el valor de x: ");
		x = sc.nextInt();
		System.out.println("Introduzca el valor de a: ");
		a = sc.nextInt();
		System.out.println("Introduzca el valor de b: ");
		b = sc.nextInt();
		System.out.println("Introduzca el valor de c: ");
		c = sc.nextInt();
		total = (a * Math.pow(x, 2)) + b * x + c;
		System.out.println("El valor de y es: " + total);

		sc.close();

	}

}
