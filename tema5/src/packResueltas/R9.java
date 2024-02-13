package packResueltas;

import java.util.Arrays;
import java.util.Scanner;

public class R9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] puntuaciones = new int[5];
		int n;
		int cont = 0;
		boolean flag = false;

		do {
			System.out.println("Introduzca una puntuación:");
			n = sc.nextInt();
			puntuaciones[cont] = n;
			cont++;
			if (cont == 5) {
				System.out.println(
						"Introduzca si desea introducir programadores de exhibición\nIntroduzca 0 si NO lo desea\nIntroduzca 1 SI lo desea:");
				n = sc.nextInt();
				if (n == 1) {
					System.out.println("Introduzca una puntuación:");
					n = sc.nextInt();
					while (n != -1) {
						puntuaciones = rellenaExhibicion(puntuaciones, n);
						System.out.println("Introduzca una puntuación:");
						n = sc.nextInt();
						if (n == -1) {
							flag = true;
							ordenaTabla(puntuaciones);
						}
					}

				} else if (n == 0) {
					ordenaTabla(puntuaciones);
					flag = true;
				} else {
					System.out.println("Ha introducido un número no válido.");
					flag = true;
				}
			}
		} while (!flag);

		sc.close();
	}

	public static int[] rellenaExhibicion(int[] tabla, int puntuacion) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = puntuacion;

		return tabla;
	}

	public static void ordenaTabla(int[] tabla) {
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla));

	}

}
