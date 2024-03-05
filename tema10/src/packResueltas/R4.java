package packResueltas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class R4 {

	public static void main(String[] args) {
		BufferedReader leeLinea = null;
		String linea;
		Integer suma = 0;
		double media;

		try {
			leeLinea = new BufferedReader(new FileReader("NumerosReales.txt"));
			linea = leeLinea.readLine(); // solo hacemos un readLine() porque sabemos que el fichero tiene una sola
											// línea.
			String[] subcadenas = linea.split(" "); // rellenamos el array con la línea a la cuál le eliminamos los
													// espacios.
			for (int i = 0; i < subcadenas.length; i++) {
				suma += Integer.valueOf(subcadenas[i]); // recorremos el array y vamos añadiendo a la variable suma los
														// números.
														// hacemos un valueOf porque lo tenemos en String.
			}
			media = suma / subcadenas.length - 1; // calculamos la media
			System.out.println("La suma de los números leídos es: " + suma
					+ "\nLa media aritmética de los números leídos es: " + media);

		} catch (IOException e) {
			System.out.println(e.getMessage());

		} finally { // cerrramos el búfer de entrada
			if (leeLinea != null) {

				try {
					leeLinea.close();
				} catch (Exception e2) {

					System.out.println(e2.getMessage());
				}

			}
		}

	}

}
