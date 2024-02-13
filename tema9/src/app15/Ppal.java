package app15;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer op, n, cola;
		SuperCola drake = new SuperCola();

		do {
			System.out.println(
					"Introduzca la opción que quiere hacer:\n1. Introducir número en la cola.\n2. Eliminar número de la cola:");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Introduzca en qué cola desea encolar: ");
				cola = sc.nextInt();
				System.out.println("Introduzca el elemento que desea encolar:");
				n = sc.nextInt();
				drake.encolar(n, cola);
				// System.out.println(cola1.tos)
				break;
			case 2:
				System.out.println("Introduzca en qué cola desea desencolar: ");
				cola = sc.nextInt();
				drake.desencolar(cola);
				break;
			}
		} while (op != 5);

		sc.close();

	}

}
