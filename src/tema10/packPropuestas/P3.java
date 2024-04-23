package tema10.packPropuestas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner sc;
		String linea = "", nombre = "";
		int edad = 0, cont = 0;
		double altura = 0.0;

		try (BufferedReader lee = new BufferedReader(new FileReader("Jugadores.txt"))) {
			linea = lee.readLine(); // hago la lectura de línea
			while (linea != null) {
				sc = new Scanner(linea);

				if (sc.hasNext()) {
					nombre += sc.next() + " ";
				}
				if (sc.hasNextInt()) {
					edad += sc.nextInt();
				}
				if (sc.hasNextDouble()) {
					altura += (double) sc.nextDouble();
				}

				cont++;
				linea = lee.readLine();
			}

			System.out.println("Los nombres son: " + nombre + "\nLa media de edad es : " + edad / cont
					+ "\nLa media de altura es: " + altura / cont);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
