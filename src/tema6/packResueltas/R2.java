package tema6.packResueltas;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase1, frase2;
		System.out.println("Introduzca una frase:");
		frase1 = sc.nextLine();
		System.out.println("Introduzca una frase:");
		frase2 = sc.nextLine();
		System.out.println("La frase más larga es: " + masLarga(frase1, frase2));

		sc.close();
	}

	public static String masLarga(String frase1, String frase2) {

		if (frase1.length() == frase2.length()) {
			return frase1;
		} else if (frase1.length() > frase2.length()) {
			return frase1;
		} else {
			return frase2;
		}

	}
}
