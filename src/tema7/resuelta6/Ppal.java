package tema7.resuelta6;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h, m, s, sM;
		Hora hora = new Hora();

		System.out.println("Introduzca las horas:");
		h = sc.nextInt();
		System.out.println("Introduzca los minutos:");
		m = sc.nextInt();
		System.out.println("Introduzca los segundos:");
		s = sc.nextInt();
		System.out.println("Introduzca los segundos que desea incrementar:");
		sM = sc.nextInt();

		hora.setHora(h);
		hora.setMinutos(m);
		hora.setSegundos(s);

		hora.incrementaSegundos(sM);

		sc.close();

	}

}
