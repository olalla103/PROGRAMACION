package tema3.packAplicacion;

import java.util.Scanner;

public class A19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, raiz;

		System.out.println("Introduzca un número:");
		n = sc.nextInt();

		//calculamos raíz
		raiz = (int) Math.sqrt(n);
		if (Math.sqrt(raiz) != n) {
			System.out.println("La raíz cuadrada de este número es decimal,\npor lo que su raíz entera sería " + raiz
					+ " y\ntiene de resto " + (n - (int) Math.pow(raiz, 2)));
		}

		sc.close();

	}

}
