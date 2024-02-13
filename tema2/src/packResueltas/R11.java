package packResueltas;

import java.util.Scanner;

public class R11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Introduzca un número del 1 al 7:");
		n = sc.nextInt();

		switch (n) {
		case 1:
			System.out.println("Lunes.");
			break;
		case 2:
			System.out.println("Martes.");
			break;
		case 3:
			System.out.println("Miércoles.");
			break;
		case 4:
			System.out.println("Jueves.");
			break;
		case 5:
			System.out.println("Viernes.");
			break;
		case 6:
			System.out.println("Sábado.");
			break;
		case 7:
			System.out.println("Domingo.");
			break;
		default:
			System.out.println("El número introducido no es correcto.");
		}
		sc.close();

	}

}
