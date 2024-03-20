package packClase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Clase5 {

	public static void main(String[] args) {
		// VARIABLES
		String linea = "", matricula = "";
		int contLetra = 0, contNum = 0, contEspacios = 0;
		boolean flag = false;

		// se escriben todas las matrículas
		try (BufferedReader lee = new BufferedReader(new FileReader("clase5.txt"));
				BufferedWriter escribe = new BufferedWriter(new FileWriter("matriculas.txt"))) {
			linea = lee.readLine();
			while (linea != null) {
				for (int i = 0; i < linea.length() && !flag; i++) {
					if (Character.isLetter(linea.charAt(i)) && Character.isUpperCase(linea.charAt(i))) {
						if (linea.charAt(i) != 'A' && linea.charAt(i) != 'E' && linea.charAt(i) != 'I'
								&& linea.charAt(i) != 'O' && linea.charAt(i) != 'U') {
							contLetra++;
						}
					} else if (Character.isWhitespace(linea.charAt(i))) {
						contEspacios++;
					} else if (Character.isDigit(linea.charAt(i))) {
						contNum++;
					}
					if (contLetra == 3 && contNum == 4 && contEspacios == 1) {
						matricula += linea + "\n";
						flag = true;
					}
				}

				flag = false;
				linea = lee.readLine();
				contLetra = 0;
				contNum = 0;
				contEspacios=0;
			}

			// escribo en el fichero
			escribe.write(matricula);
			escribe.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	/*
	 * 5. Dado un fichero de texto con matrículas, una por línea. Obtener otro
	 * fichero de texto con las matriculas que cumplan lo siguiente: - Tres letras
	 * mayúsculas en cada matrícula - Que no pueden ser vocales. - Seguidas de un
	 * espacio en blanco y 4 dígitos
	 */
}
