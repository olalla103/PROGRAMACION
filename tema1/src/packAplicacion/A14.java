package packAplicacion;

import java.util.Scanner;

public class A14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int base, altura;
		double area;
		System.out.println("Introduzca la base del triángulo: ");
		base = sc.nextInt();
		System.out.println("Introduzca la altura del triángulo: ");
		altura = sc.nextInt();

		area = (double) (base * altura) / 2;
		System.out.println("El área de su triángulo es: " + area);
		sc.close();
	}

}
