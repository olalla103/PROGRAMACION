package packResueltas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class R6 {

	public static void main(String[] args) {
		// VARIABLES
		String linea = "";
		int n = 0, suma = 0, cont = 0;
		double media;
		Scanner sc = null;
		
		try (BufferedReader lee = new BufferedReader(new FileReader("Enteros.txt"))) {
			linea = lee.readLine();
			while (linea != null) {	
				sc = new Scanner(linea);
				while (sc.hasNextInt()) { // mientras que haya un int, se hace
					n = sc.nextInt();
					suma += n;
					cont++;
				}
				linea = lee.readLine();
			}

			media = suma / cont;
			System.out.println("La suma total de los números es: " + suma + "\nLa media de los números es: " + media);
			sc.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
