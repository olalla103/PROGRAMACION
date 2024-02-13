package packApp;

import java.util.Arrays;
import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] tabla = new int[0];
		int sueldo;

		System.out.println("Introduzca su sueldo, si quiere parar, introduzca -1");
		sueldo = sc.nextInt();
		while (sueldo != -1) {
			tabla = rellena(tabla, sueldo);
			System.out.println("Introduzca su sueldo, si quiere parar, introduzca -1");
			sueldo = sc.nextInt();
		}
		System.out.println("Sueldos de menor a mayor:");
		listarReves(tabla);
		System.out.println("\nEl sueldo máximo es: " + max(tabla) + "\nEl sueldo menor es: " + min(tabla));
		System.out.println("\nLa media de los sueldos es: " + media(tabla));

		sc.close();

	}

	public static int[] rellena(int[] tabla, int n) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = n;
		return tabla;
	}

	public static void listarReves(int[] tabla) {
		Arrays.sort(tabla);
		for (int i = tabla.length - 1; i > 0; i--) {
			System.out.print(tabla[i] + " ");
		}

	}

	public static int max(int[] tabla) {
		int max = 0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] > max) {
				max = tabla[i];
			}
		}

		return max;
	}

	public static int min(int[] tabla) {
		int min = max(tabla);
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] < min) {
				min = tabla[i];
			}
		}
		return min;
	}

	public static int media(int[] tabla) {
		int media = 0;
		for (int i = 0; i < tabla.length; i++) {
			media += tabla[i];
		}
		media = media / tabla.length;
		return media;
	}

}
