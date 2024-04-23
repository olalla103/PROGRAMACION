package tema11.packApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class App9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] telfs = new String[0];
		String telefono;
		int op;

		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("telefonos.dat"))) {
			telfs = (String[]) lee.readObject();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		do {
			System.out.println("1.Añadir teléfono\n2.Listar teléfonos\n-1.Salir");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Introduce el teléfono:");
				telefono = sc.next();
				telfs = alta(telfs, telefono);
				break;
			case 2:
				System.out.println(Arrays.toString(telfs));
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}

		} while (op != -1);

		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("telefonos.dat"))) {
			escribe.writeObject(telfs);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

	public static String[] alta(String[] telfs, String telefono) {
		telfs = Arrays.copyOf(telfs, telfs.length + 1);
		telfs[telfs.length - 1] = telefono;

		return telfs;
	}

}
