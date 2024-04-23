package tema6.packResueltas;

import java.util.Scanner;

public class R8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase, prefijo = "Javalín, javalón", sufijo = "javalén, len, len";

		System.out.println("Introduzca una frase:");
		frase = sc.nextLine();

		System.out.println(traducido(frase, prefijo, sufijo));

		sc.close();

	}

	public static boolean javalandia(String frase, String prefijo, String sufijo) {
		if (frase.startsWith(prefijo) || frase.endsWith(sufijo)) {
			return true;
		} else {
			return false;
		}
	}

	public static String traducido(String frase, String prefijo, String sufijo) {
		String fraseNueva = "";
		int pos = -1;
		if (javalandia(frase, prefijo, sufijo)) {
			pos = frase.indexOf(prefijo);
			if (pos == -1) {
				pos = frase.indexOf(sufijo);
				fraseNueva = frase.substring(0, pos);
			} else {
				fraseNueva = frase.substring(prefijo.length());
			}
			fraseNueva = fraseNueva.strip();

		}
		return fraseNueva;

	}

}
