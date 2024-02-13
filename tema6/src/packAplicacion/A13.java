package packAplicacion;

import java.util.Scanner;

public class A13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase;

		System.out.println("Introduzca una frase con comentarios:");
		frase = sc.nextLine();

		System.out.println(fraseSinC(frase));

		sc.close();

	}

	public static String fraseSinC(String frase) {
		int pos1 = 0, pos2 = 0;
		String nueva;
		pos1 = frase.indexOf("/*");
		pos2 = frase.indexOf("*/", pos1);
		nueva = frase.substring(0, pos1);
		nueva = nueva + frase.substring(pos2+2, frase.length());

		return nueva;
	}
}
