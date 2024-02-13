package packPropuestas;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int longitud, n, contCero = 0, contP = 0, contN = 0;
		int[] tabla;
		double mediaP = 0, mediaN = 0;

		System.out.println("Introduzca la longitud de la tabla:");
		longitud = sc.nextInt();
		tabla = new int[longitud];

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un número:");
			n = sc.nextInt();
			tabla[i] = n;

			if (n == 0) {
				contCero++;
			}
			if (n > 0) {
				mediaP += n;
				contP++;
			} else {
				mediaN += n;
				contN++;
			}

		}
		System.out.println("Se han introducido un total de " + contCero
				+ " ceros.\nLa media de los números positivos introducidos es: " + mediaPN(mediaP, contP)
				+ "\nLa media de los números negativos introducidos es:" + mediaPN(mediaN, contN));

		sc.close();

	}

	public static double mediaPN(double media, int cont) {
		media = media / cont;

		return media;
	}

}
