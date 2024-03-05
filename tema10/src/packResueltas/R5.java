package packResueltas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class R5 {

	public static void main(String[] args) {
		// VARIABLES
		Scanner sc;
		BufferedReader lee = null;
		String linea;
		double n = 0, suma = 0;

		try {
			lee = new BufferedReader(new FileReader("Resuelta5.txt"));
			linea = lee.readLine();
			while (linea != null) {
				sc = new Scanner(linea);
				if (sc.hasNextDouble()) {
					n = sc.nextDouble();
					suma += n;
				}
				linea = lee.readLine();
			}
			System.out.println(suma);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
