package packApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class App6 {

	public static void main(String[] args) {
		// { "Paola", "Olalla", "Iñigo", "Berta", "Fran", "Dani", "Pablo" }
		Scanner sc = new Scanner(System.in);
		String nombre;
		String nombres[] = new String[0];

		// leemos para introducir en la tabla
		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("nombres.dat"))) {
			nombres = (String[]) lee.readObject();

		} catch (IOException e) {
			System.out.println("No se encuentra el fichero.");

		} catch (ClassNotFoundException e) {
			System.out.println("No se encuentra la clase.");
		}
		System.out.println(Arrays.toString(nombres));

		// pedimos nombres hasta que se introduzca fin
		System.out.println("Introduzca un nombre:");
		nombre = sc.next();
		while (!nombre.equalsIgnoreCase("fin")) {
			nombres = altaNombre(nombres, nombre);
			System.out.println("Introduzca un nombre:");
			nombre = sc.next();
		}

		// escribo en el fichero binario
		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("nombres.dat"))) {
			escribe.writeObject(nombres);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(Arrays.toString(nombres));

		sc.close();
	}

	public static String[] altaNombre(String[] nombres, String nombre) {
		nombres = Arrays.copyOf(nombres, nombres.length + 1);
		nombres[nombres.length - 1] = nombre;
		Arrays.sort(nombres);
		return nombres;
	}

}
