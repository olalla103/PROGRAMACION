package packResueltas;

import java.util.Scanner;

public class R12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota;
		boolean suspenso = false;

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca una nota:");
			nota = sc.nextInt();

			if (nota < 5) {
				suspenso = true;
			}
		}
		System.out.println("¿Hay algún suspenso? " + suspenso);
		
		sc.close();

	}

}
