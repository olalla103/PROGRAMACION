package packPropuestas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Propuesta4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linea = "";

		try (BufferedWriter escribe = new BufferedWriter(new FileWriter("Propuesta4.txt"))) {
			System.out.println("Escriba un texto hasta que introduzca fin.");
			linea = sc.nextLine();
			while (linea != "fin") {
				escribe.write(linea);
				escribe.flush();
				linea = sc.nextLine(); // no se para el bucle
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
