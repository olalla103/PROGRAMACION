package tema10.packAmpliacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

public class Amp28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombreFichero, cadena, linea = "";
		int cont = 0, indice = 0;

		System.out.println("Introduzca el nombre del fichero que quiere buscar:");
		nombreFichero = sc.next();
		System.out.println("Introduzca la cadena que quiere buscar en el fichero:");
		cadena = sc.next();
		// patron = Pattern.compile(cadena);

		try (BufferedReader lee = new BufferedReader(new FileReader(nombreFichero + ".txt"))) {
			linea = lee.readLine();
			while (linea != null) {
				indice = linea.indexOf(cadena);
				while (indice != -1) {
					cont++;
					indice = linea.indexOf(cadena, indice + 1);
				}
				linea = lee.readLine();
			}
			System.out.println("La cadena aparece un total de " + cont + " veces.");
		} catch (NoSuchFileException e) {
			System.out.println("No se ha encontrado el fichero.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
