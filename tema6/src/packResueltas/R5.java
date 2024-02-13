package packResueltas;

import java.util.Scanner;

public class R5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase;

		System.out.println("Introduzca una frase:");
		frase = sc.nextLine();
		fraseAlReves(frase);

		sc.close();

	}

	public static void fraseAlReves(String frase) {
		for (int i = frase.length()-1; i >= 0; i--) {
			System.out.print(frase.charAt(i));
		}
	}

}
