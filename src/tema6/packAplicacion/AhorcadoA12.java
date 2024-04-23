package tema6.packAplicacion;

import java.util.Scanner;

public class AhorcadoA12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String palabraSecreta = "a", palabrAdivinada = "";
		char letra;

		System.out.println("Introduzca la palabra que hay que adivinar: ");
		palabraSecreta = sc.nextLine();
		guiones(palabraSecreta);
		System.out.println();
		do {
			System.out.println("Introduzca una letra:");
			letra = sc.next().charAt(0);
			if (comprueba(palabraSecreta, letra)) {
				palabrAdivinada += letra;
			}

			guionesLetras(palabraSecreta, palabrAdivinada, letra);
		} while (!palabrAdivinada.equals(palabraSecreta));

		sc.close();
	}

	public static void guiones(String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			System.out.print("_ ");
		}
	}

	public static void guionesLetras(String palabra, String palabrAdivinada, char letra) {
		for (int i = 0; i < palabra.length(); i++) {
			// char letraActual = palabra.charAt(i)
			/*
			 * if (contiene(letrasAdivinadas, letraActual)) { resultado += letraActual +
			 * " "; } else { resultado += "_ "; } }
			 */
		}
	}

	public static boolean comprueba(String palabra, char letra) {
		boolean si = false;
		for (int i = 0; i < palabra.length() && !si; i++) {
			if (palabra.charAt(i) == letra) {
				si = true;
			} else {
				si = false;
			}
		}
		return si;
	}

}
