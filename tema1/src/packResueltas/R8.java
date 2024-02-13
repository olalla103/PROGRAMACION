package packResueltas;

import java.util.Scanner;

public class R8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int edad;
		boolean mayor;
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt();
		mayor = edad >= 18;
		System.out.println(mayor);

		sc.close();
	}

}
