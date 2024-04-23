package tema10.packAplicacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		int edad;

		System.out.println("Introduce tu nombre: ");
		nombre = sc.nextLine();
		System.out.println("Introduce tu edad: ");
		edad = sc.nextInt();

		try (BufferedWriter escribe = new BufferedWriter(new FileWriter("datos.txt", true))) {
			escribe.write(nombre + " " + edad);
			escribe.newLine();
			escribe.flush();
			sc.close();
		} catch (IOException e) {
			System.out.println("No existe el archivo indicado.");
		}

	}

}
