package tema10.packAplicacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in), intros;
		String linea = "", palabra; 
		Integer contLineas = 0;
		boolean flag = false;

		try (BufferedReader lee = new BufferedReader(new FileReader("pedasodefichero.txt"))) {
			linea = lee.readLine();
			intros = new Scanner(linea);
			
			while (linea != null || !flag) {
				System.out.println(linea);
				if (intros.hasNextLine()) {
					contLineas++;
					if (contLineas == 24) {
						System.out.println("Quiere leer más? s / n");
						palabra = sc.next();
						if (palabra.equals("s")) {
							flag = true;
						}
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
