package tema10.packClase;

import java.io.*;
import java.util.Arrays;

public class Clase3 {

	public static void main(String[] args) {
		// VARIABLES
		String linea = "", texto = "";
		String[] tabla = new String[0];

		try (BufferedReader lee = new BufferedReader(new FileReader("clase3.txt"))) {
			// leemos
			linea = lee.readLine();
			while (linea != null) {
				texto += linea + "\n";
				linea = lee.readLine();
			}
			tabla = texto.split("\n");
			Arrays.sort(tabla);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try (BufferedWriter escribe = new BufferedWriter(new FileWriter("clase3.txt"))) {
			// escribo
			for (int i = 0; i < tabla.length; i++) {
				escribe.write(tabla[i] + "\n");
			}
			escribe.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
