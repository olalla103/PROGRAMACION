package pack;

import java.util.Scanner;

public class Temperaturas {

	public static void main(String[] args) {
		// VARIABLES
		Scanner sc = new Scanner(System.in);
		double t1, t2, t3, t4;

		System.out.println("Introduzca la temperatura 1");
		t1 = sc.nextDouble();
		System.out.println("Introduzca la temperatura 2");
		t2 = sc.nextDouble();
		System.out.println("Introduzca la temperatura 3");
		t3 = sc.nextDouble();
		System.out.println("Introduzca la temperatura 4");
		t4 = sc.nextDouble();
		double tTotal = (t1 + t2 + t3 + t4) / 4;

		// Imprimimos
		System.out.println("La media de las temperaturas es: " + tTotal + " °C");
		sc.close();
	}

}
