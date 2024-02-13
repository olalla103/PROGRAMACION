package packResueltas;

import java.util.Scanner;

public class R3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt();

		System.out.println("El año que viene tendrá " + (edad + 1) + " años");
		sc.close();
	}

}
