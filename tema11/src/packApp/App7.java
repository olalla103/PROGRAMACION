package packApp;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String linea = "";

		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("aplicacion7.dat"))) {

			System.out.println("Introduce una frase:");
			linea = sc.nextLine();

			while (!linea.isEmpty()) {
				escribe.writeObject(linea + " ");

				System.out.println("Introduce una frase:");
				linea = sc.nextLine();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("aplicacion7.dat"))) {
			while (true) {
				linea += (String) lee.readObject() + "\n";
			}

		} catch (EOFException e) {
			System.out.println("Fin de fichero.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("No se encuentra la clase.");
		}
		System.out.println(linea);

		sc.close();

	}

}
