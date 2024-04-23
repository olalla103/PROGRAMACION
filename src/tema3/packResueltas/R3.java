package tema3.packResueltas;

import java.util.Scanner;

public class R3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = (int) (Math.random() * 100 + 1), respuesta;
		boolean flag = false;
		System.out.println(n);

		System.out.println("Introduzca un número:");
		respuesta = sc.nextInt();
		while (respuesta != n && flag == true) {
			if (respuesta == -1) {
				flag = true;
			}
			if (respuesta < n) {
				System.out.println("Es un número mayor.");
			} else if (respuesta > n) {
				System.out.println("Es un número menor.");
			}
			System.out.println("Introduzca un número:");
			respuesta = sc.nextInt();
		}
		sc.close();
	}

}
