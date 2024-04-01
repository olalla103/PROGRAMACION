package packApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase;

		System.out.println("Introduzca una frase:");
		frase = sc.nextLine();

		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("aplicacion14.dat"))) {
			escribe.writeObject(frase);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("aplicacion14.dat"))) {
			frase = (String) lee.readObject();
			System.out.println(frase);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		sc.close();

	}

}
