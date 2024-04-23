package tema10.packAplicacion;

import java.io.*;
import java.util.Scanner;

public class App6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linea, nombres = "", revisa;
		String palabras[] = new String[0];
		boolean flag = true;

		// hacer otra vez

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
					if (revisa.equalsIgnoreCase(palabras[i])) {
						flag = false;
					}
				}
				nombres = "";
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

			if (!flag || revisa.equals("-1")) {
				if (revisa.equals("-1")) {
					System.out.println("Hasta luego!");
				} else {
					System.out.println("Ese nombre ya se encuentra en el archivo.");
				}
			} else {
				try (BufferedWriter escribe = new BufferedWriter(new FileWriter("firmas.txt"))) {
					escribe.write(revisa);
					escribe.newLine();

					escribe.flush();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		} while (!revisa.equals("-1"));
		sc.close();
	}
}
