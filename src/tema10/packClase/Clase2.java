package tema10.packClase;

import java.io.*;

public class Clase2 {
	public static void main(String[] args) {
		// variables
		char letra;
		int n;
		String letrasMayusculas = "", letrasMinusculas = "";

		// leemos fichero
		try (BufferedReader lee = new BufferedReader(new FileReader("clase2.txt"));
				BufferedWriter escribeMinus = new BufferedWriter(new FileWriter("minusculas.txt"));
				BufferedWriter escribeMayus = new BufferedWriter(new FileWriter("mayusculas.txt"))) {
			n = lee.read();
			while (n != -1) {
				letra = (char) n; // si pasamos directamente a char, se hace un bucle infinito
				if (Character.isUpperCase(letra)) {
					letrasMayusculas += letra + " ";
				} else if (Character.isLowerCase(letra)) {
					letrasMinusculas += letra + " ";
				}
				n = lee.read();
			}

			// escribe fichero
			// mayúsculas
			escribeMayus.write(letrasMayusculas);
			escribeMayus.flush();
			// minúsculas
			escribeMinus.write(letrasMinusculas);
			escribeMinus.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
