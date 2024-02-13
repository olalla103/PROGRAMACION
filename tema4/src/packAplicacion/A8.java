package packAplicacion;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cant, max, min;

		System.out.println("Introduce la cantidad de números:");
		cant = sc.nextInt();
		do {
			System.out.println("Introduce la cifra máxima:");
			max = sc.nextInt();
			System.out.println("Introduce la cifra mínima:");
			min = sc.nextInt();

			if (min > max) {
				System.out.println("Ha puesto el número mayor en el mínimo.");
			}

		} while (min > max);

		System.out.println("\nNúmeros entre " + max + " y " + min + ":");
		numAleatorios(cant, max, min);

		System.out.println("\nNúmeros de 0 a 1:");
		numAleatorios(cant);

		sc.close();

	}

	public static void numAleatorios(int cant, int max, int min) {
		int n;
		for (int i = 0; i < cant; i++) {
			n = (int) (Math.random() * (max - min + 1) + min);
			System.out.println(n);
		}
	}

	public static void numAleatorios(int cant) {
		double n;
		for (int i = 0; i < cant; i++) {
			n = Math.random();
			System.out.println(n);
		}
	}

}
