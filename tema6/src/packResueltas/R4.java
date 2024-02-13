package packResueltas;

import java.util.Scanner;

public class R4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase;

		System.out.println("Introduzca una frase:");
		frase = sc.nextLine();
		System.out.println("La frase tiene un total de " + espacios(frase) + " espacios en blanco.");

		sc.close();
	}

	@SuppressWarnings("deprecation")
	public static int espacios(String frase) {
		char a;
		int contEspacios = 0;
		for (int i = 0; i < frase.length(); i++) {
			a = frase.charAt(i);
			if (Character.isSpace(a)) {
				contEspacios++;
			}
		}
		return contEspacios;
	}

}
