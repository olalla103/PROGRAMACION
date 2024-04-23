package tema1.packResueltas;

import java.util.Scanner;

public class R9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		boolean par;

		System.out.println("Introduzca un número: ");
		n = sc.nextInt();
		par = (n % 2) == 0;
		System.out.println(par);

		sc.close();
	}

}
