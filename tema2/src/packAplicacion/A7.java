package packAplicacion;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1, n2, total, respuesta;

		n1 = (int) (Math.random() * 99 + 1);
		n2 = (int) (Math.random() * 99 + 1);
		total = n1 + n2;
		System.out.println("Realice la suma entre " + n1 + " + " + n2);
		System.out.println("Introduzca el resultado de la suma:");
		respuesta = sc.nextInt();

		if (respuesta == total) {
			System.out.println("Correcto.");
		} else {
			System.out.println("Incorrecto.");
		}
		sc.close();

	}

}
