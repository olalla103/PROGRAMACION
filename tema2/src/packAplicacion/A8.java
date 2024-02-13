package packAplicacion;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1, n2, total = 0, respuesta, operacion;

		n1 = (int) (Math.random() * 99 + 1);
		n2 = (int) (Math.random() * 99 + 1);
		operacion = (int) (Math.random() * 3 + 1);

		switch (operacion) {
		case 1:
			total = n1 + n2;
			System.out.println("Realice la operación entre " + n1 + " + " + n2);
			break;
		case 2:
			total = n1 - n2;
			System.out.println("Realice la operación entre " + n1 + " - " + n2);
			break;
		case 3:
			total = n1 / n2;
			System.out.println("Realice la operación entre " + n1 + " / " + n2);
			break;
		}

		System.out.println("Introduzca el resultado:");
		respuesta = sc.nextInt();

		if (respuesta == total) {
			System.out.println("Correcto.");
		} else {
			System.out.println("Incorrecto.");
		}
		sc.close();
	}

}
