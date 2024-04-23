package tema11.packR9;

import java.io.*;
import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TablaRegistros tabla = new TablaRegistros();
		Registros registro;
		Double temperatura;
		int op = 0;

		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("resuelta9.dat"))) {
			tabla = (TablaRegistros) lee.readObject();
		} catch (ClassNotFoundException e) {
			System.out.println("Clase no encontrada.");

		} catch (IOException e) {
			System.out.println("No se encuentra el fichero.");
		}

		do {
			System.out.println("Introduzca lo que quiere realizar\n1.Añadir\n2.Mostrar\n-1.Salir");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Introduzca la temperatura que desea registrar:");
				temperatura = sc.nextDouble();
				registro = new Registros(temperatura);
				tabla.alta(registro);
				break;

			case 2:
				System.out.println(tabla.mostrarListado());
				break;
			}

		} while (op >= 0);

		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("resuelta9.dat"))) {
			escribe.writeObject(tabla);

		} catch (IOException e) {
			System.out.println("No se encuentra el fichero.");
		}

		sc.close();
	}

}
