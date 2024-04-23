package tema2.packResueltas;

import java.util.Scanner;

public class R13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s, m, h;

		System.out.println("Introduzca una cantidad de segundos:");
		s = sc.nextInt();
		s++;
		System.out.println("Introduzca una cantidad de minutos:");
		m = sc.nextInt();
		System.out.println("Introduzca una hora:");
		h = sc.nextInt();

		if (s >= 60) {
			s = 0;
			m++;
		}
		if (m >= 60) {
			m = 0;
			h++;
		}
		if (h == 25) {
			h = 1;
			m = 0;
			s = 0;
		}
		if (h < 1 || h > 24 || m > 60 || s > 60) {
			System.out.println("Hora inválida.");
		} else {
			System.out.println("Son las: " + h + " : " + m + " : " + s);
		}

		sc.close();
	}

}
