package tema3.packActsMoodle;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, todo = 0, cont = 0;

		System.out.println("Introduzca un número:");
		n = sc.nextInt();
		while (todo < 10000) {
			cont++;
			todo += n;
			System.out.println("Introduzca un número:");
			n = sc.nextInt();
		}
		
		System.out.println("La cantidad acumulada es: " + todo + ".\nLa media es " + todo / cont + ".");

		sc.close();

	}

}
