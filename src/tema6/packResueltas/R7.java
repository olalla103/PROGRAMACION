package tema6.packResueltas;

import java.util.Scanner;

public class R7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase, palabra;

		System.out.println("Introduzca una frase:");
		frase = sc.nextLine();
		System.out.println("Introduzca la palabra que desea buscar en la frase:");
		palabra = sc.nextLine();

		System.out.println("La palabra " + palabra + " aparece en la frase un total de "
				+ cantidadPalabra(frase, palabra) + " veces.");

		sc.close();

	}

	public static int cantidadPalabra(String frase, String palabra) {
		int pos = 0, cont = 0;

		pos = frase.indexOf(palabra);
		while (pos != -1) {
			cont++;
			pos = frase.indexOf(palabra, pos + 1);
		}

		return cont;
	}

}
