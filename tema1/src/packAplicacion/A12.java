package packAplicacion;

import java.util.Scanner;

public class A12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, falta = 0, m;
		System.out.println("Introduzca el múltiplo: ");
		m = sc.nextInt();
		System.out.println("Introduzca el número: ");
		n = sc.nextInt();
		falta = n % m;
		if (falta == 0) {
			System.out.println("Es múltiplo de " + m + ".");
		} else {
			System.out.println("Hay que sumar " + falta + " para que sea múltiplo de " + m + ".");
		}
		sc.close();

	}

}
