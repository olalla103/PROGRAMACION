package packPropuestas;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// VARIABLES
		Scanner sc = new Scanner(System.in);
		int aforo, nEntradas;
		double precio = 20.0;

		// PROGRAMA
		System.out.println("Introduzca la capacidad total de aforo:");
		aforo = sc.nextInt();
		System.out.println("Introduzca la cantidad de entradas vendidas:");
		nEntradas = sc.nextInt();
		if ((nEntradas * 0.2) < aforo) {
			System.out.println("Se cancela el concierto");
		} else if ((nEntradas * 0.5) < aforo) {
			precio = precio - (precio * 0.25);
		}
		sc.close();

	}

}
