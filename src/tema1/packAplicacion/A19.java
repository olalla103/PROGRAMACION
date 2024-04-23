package tema1.packAplicacion;

import java.util.Scanner;

public class A19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final double eMa = 20.0, eMe = 15.5;
		int cMayores, cMenores;
		double total;
		
		System.out.println("Introduzca cuántas entradas de adultos necesita:");
		cMayores = sc.nextInt();
		System.out.println("Introduzca cuántas entradas de niños necesita:");
		cMenores = sc.nextInt();
		cMayores *= eMa;
		cMenores *= eMe;
		total = cMayores + cMenores;
		if (total >= 100) {
			total = total - (total * 0.05);
			System.out.println("Descuento!\nEl precio de las entradas es: " + total);
		} else {
			System.out.println("El precio de las entradas es: " + total);
		}

		sc.close();

	}

}
