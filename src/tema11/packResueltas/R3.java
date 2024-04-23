package tema11.packResueltas;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class R3 {

	public static void main(String[] args) {
		// VARIABLES
		Scanner sc = new Scanner(System.in);
		int n, cont = 0;
		double num;

		System.out.println("Introduce la longitud de la tabla:");
		n = sc.nextInt();

		// creamos la tabla con n longitud
		double[] tabla = new double[n];

		// insertamos valores en la tabla
		do {
			System.out.println("Introduce un valor (double):");
			num = sc.nextDouble();
			tabla[cont] = num;
			cont++;
		} while (cont < tabla.length);

		// escribimos en el fichero binario
		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("resuelta11_3.dat"))) {
			escribe.writeObject(tabla);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		sc.close();

	}

}
