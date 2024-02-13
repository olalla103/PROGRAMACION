package packResueltas;

import java.util.Scanner;

public class R1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Introduzca un número: ");
		n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("El número introducido es par.");
		} else {
			System.out.println("El número introducido es impar.");
		}
		
		sc.close();

	}

}
