package tema6.packResueltas;

import java.util.Scanner;

public class R6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre;

		System.out.println("Introduzca su nombre:");
		nombre = sc.nextLine();
		System.out.println(noVocales(nombre));

		sc.close();

	}

	public static String noVocales(String nombre) {
		String sinVocal = "";
		for (int i = 0; i < nombre.length(); i++) {
			if (nombre.charAt(i) != 'a' && nombre.charAt(i) != 'e' && nombre.charAt(i) != 'i' && nombre.charAt(i) != 'o'
					&& nombre.charAt(i) != 'u' && nombre.charAt(i) != 'A' && nombre.charAt(i) != 'E'
					&& nombre.charAt(i) != 'I' && nombre.charAt(i) != 'O' && nombre.charAt(i) != 'U'
					&& nombre.charAt(i) != 'á' && nombre.charAt(i) != 'é' && nombre.charAt(i) != 'í'
					&& nombre.charAt(i) != 'ó' && nombre.charAt(i) != 'ú' && nombre.charAt(i) != 'Á'
					&& nombre.charAt(i) != 'É' && nombre.charAt(i) != 'Í' && nombre.charAt(i) != 'Ó'
					&& nombre.charAt(i) != 'Ú') {
				sinVocal += nombre.charAt(i);
			}
		}
		return sinVocal;
	}
	/* */

}
