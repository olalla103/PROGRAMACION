package tema10.packAmpliacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Amp27 {

	public static void main(String[] args) {
		Scanner sc;
		Integer contCaracteres = 0, contLineas = 0;
		String linea = "", leeCh, p = "";
		String palabras[];

		try (BufferedReader lee = new BufferedReader(new FileReader("carta.txt"))) {
			linea = lee.readLine();
			while (linea != null) {
				leeCh = linea;
				sc = new Scanner(linea);
				
				if (sc.hasNextLine()) {
					p += " ";
				}
				p += leeCh;
				// contamos cantidad de caracteres
				for (int i = 0; i < leeCh.length(); i++) {
					contCaracteres++;
				}
				// contamos cantidad de Líneas
				contLineas++;
				linea = lee.readLine();
			}
			palabras = p.split(" ");

			System.out.println("Hay un total de " + contLineas + " líneas y un total de " + contCaracteres
					+ " caracteres. Hay un total de " + (palabras.length - 1) + " palabras");

		} catch (IOException e) {
			System.out.println("No se encuentra el archivo.");
		}

	}

}
