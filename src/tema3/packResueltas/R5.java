package tema3.packResueltas;

import java.util.Scanner;

public class R5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, op1, op2, cont = 0;

		do {
			op1 = (int) (Math.random() * 100 + 1);
			op2 = (int) (Math.random() * 100 + 1);
			System.out.println(op1 + op2);
			System.out.println(op1 + " + " + op2);
			System.out.println("Introduzca el valor de la suma:");
			n = sc.nextInt();
			cont++;
		} while (n == op1 + op2);

		System.out.println("Ha tenido un total de " + (cont - 1) + " aciertos.");

		sc.close();

	}

}
