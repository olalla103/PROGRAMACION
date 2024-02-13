package packResueltas;

import java.util.Scanner;

public class R4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nacimiento = 0, actual = 0, edad = 0;

		System.out.println("Introduzca su año de nacimiento: ");
		nacimiento = sc.nextInt();
		System.out.println("Introduzca el año actual: ");
		actual = sc.nextInt();
		edad = actual - nacimiento;

		System.out.println("En este momento tiene " + edad + " años.");
		sc.close();

	}

}
