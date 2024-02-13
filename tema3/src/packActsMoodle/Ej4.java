package packActsMoodle;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n, op = 0;
		int par = 0, impar = 0;

		boolean flag = true;

		System.out.println("Introduzca un número:");
		n = sc.nextLong();

		while (flag) {
			//SEPARAMOS EL NÚMERO EN DÍGITOS
			op = n % 10;
			n = n / 10;
			//REALIZAMOS LA CUENTA DE PAR E IMPAR
			if (op % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			if (n == 0) {
				flag = false;
			}
		}
		System.out.println("El número tiene un total de " + par + " dígitos pares\ny " + impar + " dígitos impares.");
		sc.close();

	}

}
