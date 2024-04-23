package tema4.packBoletinRecursividad;

import java.util.Scanner;

public class Act2 {
	/*
	 * 2. Lee dos números (positivos) y pasarlos a un método recursivo que obtenga
	 * la multiplicación de ambos y la devuelva al principal (sin utilizar el
	 * operador de la multiplicación).
	 */

	public static void main(String[] args) {
		// VARIABLES
		Scanner sc = new Scanner(System.in);
		int a, b;

		// EJECUCIÓN
		do {
			System.out.println("Introduzca un número:");
			a = sc.nextInt();
			System.out.println("Introduzca un número:");
			b = sc.nextInt();
		} while (a < 0 && b < 0);
		System.out.println(multiplica(a, b));

		sc.close();
	}

	public static int multiplica(int a, int b) {
		int cont = 0, resultado = 0;
		if (cont != b) {
			cont++;
			resultado = a + multiplica(a, b);
		} else {
			resultado = 1;		

		}
		return resultado;

	}

}
