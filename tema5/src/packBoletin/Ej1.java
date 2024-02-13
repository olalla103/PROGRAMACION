package packBoletin;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] tabla = new int[10];

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un número:");
			tabla[i] = sc.nextInt();
		}
		for (int i = tabla.length - 1; i >= 0; i--) {
			System.out.print(tabla[i] + " ");
		}
		sc.close();

	}

}
