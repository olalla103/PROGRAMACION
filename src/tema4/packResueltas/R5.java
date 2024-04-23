package tema4.packResueltas;

import java.util.Scanner;

public class R5 {

	public static void main(String[] args) {
		// SCANNER Y VARIABLES
		Scanner sc = new Scanner(System.in);
		char letra;

		// DAMOS VALOR A LA VARIABLE Y REALIZAMOS LA LLAMADA A LA FUNCIÓN
		System.out.println("Introduzca UNA letra");
		letra = sc.next().charAt(0);
		esVocal(letra);

		sc.close();

	}

	public static void esVocal(char letra) {
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E'
				|| letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.println("La letra introducida es una vocal.");
		} else {
			System.out.println("La letra introducida NO es una vocal.");
		}

	}

}
