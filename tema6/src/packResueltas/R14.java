package packResueltas;

import java.util.Scanner;

public class R14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String palabra;

		System.out.println("Introduzca una palabra:");
		palabra = sc.next();
		System.out.println(creAnagrama(palabra));

		sc.close();
	}

	public static String creAnagrama(String palabra) {
		char[] anagrama = palabra.toCharArray();

		for (int i = 0; i < palabra.length(); i++) {
			int a = (int) (Math.random() * anagrama.length);
			int b = (int) (Math.random() * anagrama.length);
			char aux = anagrama[a];
			anagrama[a] = anagrama[b];
			anagrama[b] = aux;
		}

		return String.valueOf(anagrama);
	}
}
