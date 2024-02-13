package packAplicacion;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double base, altura, area;

		System.out.println("Introduzca la base:");
		base = sc.nextDouble();
		System.out.println("Introduzca la altura:");
		altura = sc.nextDouble();

		if (base < 0 || altura < 0) {
			System.out.println("No se puede ejecutar el programa, algún número introducido es negativo.");
		} else {
			area = base * altura / 2;
			System.out.println("El área de su triángulo es: " + area);
		}
		sc.close();

	}

}
