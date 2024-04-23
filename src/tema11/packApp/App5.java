package tema11.packApp;

import java.io.*;
import java.util.Arrays;

public class App5 {

	public static void main(String[] args) {
		int n;
		int[] par = new int[0];
		int[] impar = new int[0];

		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("numerosCopia.dat"))) {
			while (true) {
				n = lee.readInt();
				if (parImpar(n)) {
					aniade(par, n);
				} else {
					aniade(impar, n);
				}
			}
		} catch (IOException e) {
			System.out.println("Fin de fichero");
		}

		System.out.println("Se ha leído.");

		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("par.dat"));
				ObjectOutputStream escribe2 = new ObjectOutputStream(new FileOutputStream("impar.dat"))) {
			escribe.writeObject(par);
			escribe2.writeObject(impar);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Se ha escrito.");

	}

	public static boolean parImpar(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void aniade(int[] tabla, int n) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = n;
	}
}
