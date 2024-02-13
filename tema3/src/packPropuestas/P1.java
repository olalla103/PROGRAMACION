package packPropuestas;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int edad;
		System.out.println("Introduzca una edad:");
		edad = sc.nextInt();
		while (edad != -1) {
			System.out.println("Introduzca una edad:");
			edad = sc.nextInt();
		}
		sc.close();
	}

}
