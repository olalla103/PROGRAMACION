package packResueltas;

import java.util.Scanner;

public class R3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String contrasena, respuesta;

		System.out.println("Introduzca la contraseña que se debe adivinar:");
		contrasena = sc.nextLine();

		for (int i = 0; i < contrasena.length(); i++) {
			System.out.print("_ ");
		}
		System.out.println();

		System.out.println("Introduzca la contraseña que considera correcta:");
		respuesta = sc.next();
		while (!respuesta.equals(contrasena)) {
			// aciertaLongitud(contrasena, respuesta);
			aciertaContrasena2(contrasena, respuesta);
			System.out.println();
			System.out.println("Introduzca la contraseña que considera correcta:");
			respuesta = sc.next();
		}
		System.out.println("La ha acertado.");
		sc.close();

	}

	// option 1
	public static boolean aciertaLongitud(String contrasena, String supuesta) {
		if (supuesta.length() == contrasena.length()) {
			System.out.println("Tienen la misma longitud.");
			return true;
		} else if (supuesta.length() > contrasena.length()) {
			System.out.println("La clave introducida es más larga que la contraseña.");
			return false;
		} else {
			System.out.println("La contraseña es más larga que la clave introducida.");
			return false;
		}
	}

	// option 2
	public static void aciertaContrasena2(String contrasena, String supuesta) {
		if (aciertaLongitud(contrasena, supuesta)) {
			for (int i = 0; i < contrasena.length(); i++) {
				if (supuesta.charAt(i) == contrasena.charAt(i)) {
					System.out.print(contrasena.charAt(i) + " ");
				} else {
					System.out.print("_ ");
				}
			}
		}
	}

}
