package packResueltas;

import java.util.Scanner;

public class R10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase;

		System.out.println("Introduzca una frase:");
		frase = sc.nextLine();
		frase = frase.toLowerCase();
		System.out.println(palindroma(frase));

		sc.close();

	}

	public static boolean palindroma(String frase) {
		frase = sinEspacios(frase);
		String frase2 = "";
		for (int i = frase.length() - 1; i >= 0; i--) {
			frase2 += frase.charAt(i);
		}
		if (frase.equalsIgnoreCase(frase2)) {
			return true;
		} else {
			return false;
		}
	}

	public static String sinEspacios(String frase) {
		String sin = "";
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (!Character.isWhitespace(c)) {
				sin = sin + c;
			}
		}
		return sin;
	}

}
