package packResueltas;

import java.util.Scanner;

public class R14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n;
		int nN;

		System.out.println("Introduzca un número: ");
		n = sc.nextDouble();
		nN = (int) (n + 0.5);
		System.out.println(nN);

		sc.close();
	}

}
