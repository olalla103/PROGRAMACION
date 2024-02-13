package packResueltas;

import java.util.Scanner;

public class R9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String palabra, frase = "";

		System.out.println("Introduzca una palabra:");
		palabra = sc.next();
		while (!palabra.equals("fin")) {
			frase = frase + " " + palabra;
			System.out.println("Introduzca una palabra: ");
			palabra = sc.next();
		}
		frase = frase.stripLeading();
		System.out.print(frase);
		sc.close();
	}

}
