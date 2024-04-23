package tema11.packApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class App8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] firmas = new String[0];
		String firma;

		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("firmas.dat"))) {
			firmas = (String[]) lee.readObject();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Recién leída: " + Arrays.toString(firmas));

		System.out.println("Ingresa un nombre:");
		firma = sc.next();
		while (!firma.equalsIgnoreCase("fin")) {
			firmas = alta(firmas, firma);
			System.out.println("Ingresa un nombre:");
			firma = sc.next();
		}

		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("firmas.dat"))) {
			escribe.writeObject(firmas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Recién escrita: " + Arrays.toString(firmas));

		sc.close();

	}

	public static String[] alta(String[] firmas, String firma) {
		if (!compruebaNombre(firmas, firma)) {
			firmas = Arrays.copyOf(firmas, firmas.length + 1);
			firmas[firmas.length - 1] = firma;
		} else {
			System.out.println("Ese nombre se encuentra en la lista.");
		}
		return firmas;
	}

	public static boolean compruebaNombre(String[] firmas, String nombre) {
		boolean flag = false;
		for (int i = 0; i < firmas.length && !flag; i++) {
			if (firmas[i].equals(nombre)) {
				flag = true;
			}
		}
		return flag;
	}
}
