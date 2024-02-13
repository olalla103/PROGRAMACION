package packAplicacion;

import java.util.Scanner;

public class A16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s1, m, s2, h;
		System.out.println("Introduzca una cantidad de segundos: ");
		s1 = sc.nextInt();
		m = s1 / 60;
		s2 = s1 % 60;
		h = m % 60;
		System.out.println(h + " : " + m + " : " + s2);

		sc.close();
	}

}
