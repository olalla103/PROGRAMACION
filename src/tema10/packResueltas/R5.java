package tema10.packResueltas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class R5 {

	public static void main(String[] args) {
		// VARIABLES
		Scanner sc;
		String linea;
		double n = 0, suma = 0;

		try (BufferedReader lee = new BufferedReader(new FileReader("Resuelta5.txt"))) {
			linea = lee.readLine(); // lectura de la línea
			while (linea != null) {
				sc = new Scanner(linea);
				// manipulación de los datos
				if (sc.hasNextDouble()) {
					n = sc.nextDouble();
					suma += n;
				}
				linea = lee.readLine(); // lectura de la línea
			}
			System.out.println(suma);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
