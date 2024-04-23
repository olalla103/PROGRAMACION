package tema1.packAplicacion;

import java.util.Scanner;

public class A1111111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		double base, totalIva;
		final double iva = 0.21;

		System.out.println("Introduzca la base imponible: ");
		base = sc.nextDouble();
		totalIva = base * iva;
		base += totalIva;
		System.out.println("El totalIva será de " + base + " euros\nSe le impondrá un totalIva de " + totalIva
				+ " euros por el IVA.");
		sc.close();
	}

}
