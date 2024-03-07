package packAplicacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linea, nombres = "", revisa;
		String palabras[] = new String[0];
		boolean flag = true;

		do {
			System.out.println("Introduzca el nombre que quiere introducir: ");
			revisa = sc.next();

			try (BufferedReader lee = new BufferedReader(new FileReader("firmas.txt"))) {
				linea = lee.readLine();
				while (linea != null) {
					nombres += linea;

					linea = lee.readLine();
				}
				palabras = nombres.split(",");
				for (int i = 0; i < palabras.length; i++) {
					if (revisa.equals(palabras[i])) {
						flag = false;
					}
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			if (!flag || revisa.equals("-1")) {
				System.out.println("Ese nombre ya se encuentra en el archivo.");
			} else {
				try (BufferedWriter escribe = new BufferedWriter(new FileWriter("firmas.txt", true))) {
					escribe.write(revisa + ",");
					escribe.flush();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		} while (!revisa.equals("-1"));
		sc.close();
	}
}
