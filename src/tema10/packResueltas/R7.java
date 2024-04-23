package tema10.packResueltas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class R7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linea;

		try (BufferedWriter escribe = new BufferedWriter(new FileWriter("Resuelta7.txt"))) {
			linea = "En un lugar de la Mancha,";
			for (int i = 0; i < linea.length(); i++) {
				escribe.write((int) linea.charAt(i));
			}
			escribe.flush();
			escribe.newLine();

			linea = "de cuyo nombre no quiero acordarme.";
			escribe.write(linea);
			escribe.flush();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
