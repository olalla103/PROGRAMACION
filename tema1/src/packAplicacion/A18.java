package packAplicacion;

import java.util.Scanner;

public class A18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int hormiga = 6, arana = 8, cochinilla = 14;
		int cH, cA, cC, totalP;
		
		System.out.println("Introduzca cuántas hormigas tiene: ");
		cH = sc.nextInt();
		System.out.println("Introduzca cuántas arañas tiene: ");
		cA = sc.nextInt();
		System.out.println("Introduzca cuántas cochinillas tiene: ");
		cC = sc.nextInt();
		totalP = (cH * hormiga) + (cA + arana) + (cC + cochinilla);
		System.out.println("Hay un total de " + totalP + " patas.");

		sc.close();

	}

}
