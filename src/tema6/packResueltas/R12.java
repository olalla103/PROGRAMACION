package tema6.packResueltas;

import java.util.Arrays;
import java.util.Scanner;

public class R12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String p1, p2;

		System.out.println("Introduzca una palabra:");
		p1 = sc.next();
		System.out.println("Introduzca una palabra:");
		p2 = sc.next();

		System.out.println(anagrama(p1, p2));

		sc.close();

	}

	public static boolean anagrama(String p1, String p2) {
		// hacemos 2 arrays de tipo char y los ordenamos, así veremos si son iguales más
		// rápido
		char[] c1 = p1.toCharArray();
		char[] c2 = p2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) {
			return true;
		} else {
			return false;
		}

	}

}
