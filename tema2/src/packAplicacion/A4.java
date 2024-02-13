	package packAplicacion;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,  decenas, unidades;

		System.out.println("Introduzca un número:");
		n = sc.nextInt();
		decenas = n / 10;
		unidades = n % 10;

		if (n >= 11 && n <= 19) {
			switch (n) {
			case 11:
				System.out.print("Once");
				break;

			case 12:
				System.out.print("Doce");
				break;

			case 13:
				System.out.print("Trece");
				break;

			case 14:
				System.out.print("Catorce");
				break;

			case 15:
				System.out.print("Quince");
				break;

			case 16:
				System.out.print("Dieciséis");
				break;

			case 17:
				System.out.print("Diecisiete");
				break;

			case 18:
				System.out.print("Dieciocho");
				break;

			case 19:
				System.out.print("Diecinueve");
				break;
			}
		}
		switch (decenas) {
		case 2:
			if (n > 20 && n < 30) {
				System.out.print("Veinti");
			} else {
				System.out.print("Veinte");
			}
			break;

		case 3:
			if (n > 30 && n < 40) {
				System.out.print("Treinta y ");
			} else {
				System.out.print("Treinta");
			}
			break;

		case 4:
			if (n > 40 && n < 50) {
				System.out.print("Cuarenta y ");
			} else {
				System.out.print("Cuarenta");
			}
			break;

		case 5:
			if (n > 50 && n < 60) {
				System.out.print("Cincuenta y ");
			} else {
				System.out.print("Cincuenta");
			}
			break;

		case 6:
			if (n > 60 && n < 70) {
				System.out.print("Sesenta y ");
			} else {
				System.out.print("Sesenta");
			}
			break;

		case 7:
			if (n > 70 && n < 80) {
				System.out.print("Setenta y ");
			} else {
				System.out.print("Setenta");
			}
			break;

		case 8:
			if (n > 80 && n < 90) {
				System.out.print("Ochenta y ");
			} else {
				System.out.print("Ochenta");
			}
			break;

		case 9:
			if (n > 90 && n < 100) {
				System.out.print("Noventa y ");
			} else {
				System.out.print("Noventa");
			}
			break;

		}

		switch (unidades) {
		case 1:
			System.out.print("Uno");
			break;

		case 2:
			System.out.print("Dos");
			break;

		case 3:
			System.out.print("Tres");
			break;

		case 4:
			System.out.print("Cuatro");
			break;

		case 5:
			System.out.print("Cinco");
			break;

		case 6:
			System.out.print("Seis");
			break;

		case 7:
			System.out.print("Siete");
			break;

		case 8:
			System.out.print("Ocho");
			break;

		case 9:
			System.out.print("Nueve");
			break;

		case 10:
			System.out.print("Diez");
			break;

		}

		sc.close();

	}

}
