package packClase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Clase4 {

	public static void main(String[] args) {
		// VARIABLES
		Scanner sc = new Scanner(System.in), longitud;
		int tamanio = 0;
		String linea = "", palabra = "";

		System.out.println("Introduzca el tamaño de palabra que quiere leer: ");
		tamanio = sc.nextInt();

		try (BufferedReader lee = new BufferedReader(new FileReader("clase4.txt"));
				BufferedWriter escribeMenor = new BufferedWriter(new FileWriter("menores.txt"));
				BufferedWriter escribeMayor = new BufferedWriter(new FileWriter("mayores.txt"))) {
			linea = lee.readLine();
			while (linea != null) {
				longitud = new Scanner(linea);
				while (longitud.hasNextLine()) {
					palabra = longitud.next();
					if (palabra.length() < tamanio) {
						escribeMenor.write(palabra + " ");
						escribeMenor.flush();
					} else if (palabra.length() > tamanio) {
						escribeMayor.write(palabra + " ");
						escribeMayor.flush();
					}
				}
				linea = lee.readLine();

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
