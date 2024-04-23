package tema1.packAplicacion;

import java.util.Scanner;

public class A17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mm, cm, m, cM, cMm;
		System.out.println("Introduzca una longitud en milímetros: ");
		mm = sc.nextInt();
		System.out.println("Introduzca una longitud en centímetros: ");
		cm = sc.nextInt();
		System.out.println("Introduzca una longitud en metros: ");
		m = sc.nextInt();
		cMm = mm / 10;
		cM = m * 100;
		cm += (cMm + cM);
		System.out.println("El total son " + cm + " centímetros.");
		sc.close();

	}

}
