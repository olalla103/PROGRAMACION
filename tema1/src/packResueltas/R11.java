package packResueltas;

import java.util.Scanner;

public class R11 {

	public static void main(String[] args) {
		// VARIABLES
		Scanner sc = new Scanner(System.in);
		double kM, kP, pM = 2.35, pP = 1.95, totalM, totalP, total;

		System.out.println("Introduzca cuántos kilos de manzana ha vendido: ");
		kM = sc.nextDouble();
		System.out.println("Introduzca cuántos kilos de pera ha vendido: ");
		kP = sc.nextDouble();
		totalM = (pM *= kM);
		totalP = (pP *= kP);
		total = totalM + totalP;
		System.out.println(total + " euros");
		
		sc.close();

	}

}
