package packApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
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
			while(true) {
				
				linea += (String) lee.readObject() + "\n";
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(linea);

		sc.close();

	}

}
