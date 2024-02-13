package packAplicacion;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h, m, s, incremento;

		System.out.println("Introduzca una hora:");
		h = sc.nextInt();
		System.out.println("Introduzca unos minutos:");
		m = sc.nextInt();
		System.out.println("Introduzca unos segundos:");
		s = sc.nextInt();
		System.out.println("Introduzca cuántos segundos desea incrementar la hora:");
		incremento = sc.nextInt();

		if (h > 24 || m > 59 || s > 59) {
			System.out.println("La hora introducida no es correcta.");
		}
		// SEGUNDOS
		s = s + incremento;
		if (s > 59) {
			m++;
			s = s - 60;
		}

		// MINUTOS
		if (m > 59) {
			h++;
			m = m - 60;
		}

		// HORAS
		if (h > 23) {
			m = 0;
			s = 0;
			h = h - 23;
		}
		System.out.println(h + " : " + m + " : " + s);

		sc.close();

	}

}
