package packAplicacion;

import java.util.Scanner;

public class A11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		String frase, codificada = "";

		System.out.println("Introduzca una palabra para codificarla:");
		frase = sc.next();
		frase = frase.toLowerCase();
		for (int i = 0; i < frase.length(); i++) {
			codificada += codifica(conjunto1, conjunto2, frase.charAt(i));
		}
		System.out.println(codificada);

		sc.close();

	}

	public static char codifica(char[] conjunto1, char[] conjunto2, char letra) {
		boolean flag = false;
		for (int i = 0; i < conjunto1.length && !flag; i++) {
			if (letra == conjunto2[i]) {
				letra = conjunto1[i];
				flag = true;
			}
		}
		return letra;
	}

}
