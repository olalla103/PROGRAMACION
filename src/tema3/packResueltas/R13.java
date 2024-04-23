package tema3.packResueltas;

import java.util.Scanner;

public class R13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nota, aprobado = 0, condicionado = 0, suspenso = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca una nota:");
			nota = sc.nextInt();

			if (nota > 5) {
				aprobado++;
			}
			if (nota == 4) {
				condicionado++;
			}
			if (nota < 4) {
				suspenso++;
			}
		}
		System.out.println("Hay un total de " + aprobado + " alumnos aprobados.\nHay un total de " + suspenso
				+ " alumnos suspensos.\nHay un total de " + condicionado + " alumnos con un 4.");

		sc.close();

	}

}
