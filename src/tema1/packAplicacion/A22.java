package tema1.packAplicacion;

import java.util.Scanner;

public class A22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double metros;
		int centimetros;
		System.out.println("Introduzca la cantidad en metros: ");
		metros = sc.nextDouble();
		centimetros = (int) metros * 100;
		System.out.println("Lo ha lanzado un total de " + centimetros + " centímetros.");

		sc.close();

	}

}
