package tema11.packResueltas;

import java.io.*;
import java.util.Scanner;

public class R7 {

	public static void main(String[] args) {
		// VARIABLES
		Scanner sc = new Scanner(System.in);
		int n;

		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("numeros.dat"))) {

			// escribimos en fichero numeros.dat
			System.out.println("Introduzca un número:");
			n = sc.nextInt();
			while (n >= 0) {
				escribe.writeInt(n);
				System.out.println("Introduzca un número:");
				n = sc.nextInt();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("numeros.dat"));
				ObjectOutputStream copia = new ObjectOutputStream(new FileOutputStream("numerosCopia.dat"))) {

			// leemos fichero numeros.dat y escribimos en numerosCopia
			while (true) {
				int ncopia = lee.readInt();
				System.out.print(ncopia + " ");
				copia.writeInt(ncopia);
			}

		} catch (EOFException e) {
			System.out.println("\nFin de fichero");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		sc.close();

	}

}
