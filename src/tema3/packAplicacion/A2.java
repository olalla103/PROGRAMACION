package tema3.packAplicacion;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, resultado = 0, cont = 0, res = 0, total = 0;

		System.out.println("Introduzca un número binario:");
		n = sc.nextInt();

		while (n > 0) {
			res = n % 10;
			n = n / 10;
			resultado = (int) (res * (Math.pow(2, cont)));
			total += resultado;
			cont++;
		}
		System.out.println(total);

		sc.close();
	}

}
