package packR8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Ppal {
	public static void main(String[] args) {
		Socio[] tabla = new Socio[2];
		tabla[0] = new Socio("78104491X", "Olalla");
		tabla[1] = new Socio("78104492B", "Iñigo");

		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("socio.dat"))) {
			escribe.writeObject(tabla);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("socio.dat"))) {
			tabla = (Socio[]) lee.readObject();
			System.out.println(Arrays.toString(tabla));

		} catch (ClassNotFoundException e) {
			System.out.println("clase no encontrada.");

		} catch (IOException e) {
			System.out.println("no se encuentra el archivo");
		}
	}
}
