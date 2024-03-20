package packClase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Clase2 {
	// NO ESCRIBE EN LOS FICHEROS, REVISAR
	public static void main(String[] args) {
		// variables
		Character letra;
		String letrasMayusculas = "", letrasMinusculas = "";

		// leemos fichero
		try (BufferedReader lee = new BufferedReader(new FileReader("clase2.txt"));
				BufferedWriter escribeMinus = new BufferedWriter(new FileWriter("minusculas.txt"));
				BufferedWriter escribeMayus = new BufferedWriter(new FileWriter("mayusculas.txt"))) {
			letra = (char) lee.read();
			while (letra != null) {
				if (Character.isUpperCase(letra)) {
					letrasMayusculas += letra + " ";
				} else if (Character.isLowerCase(letra)) {
					letrasMinusculas += letra + " ";
				}
				letra = (char) lee.read();
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
