package tema10.packAplicacion;

import java.io.*;
import java.util.Scanner;

public class App13 {

	public static void main(String[] args) {
		Scanner sc;
		String[] aux;
		String nombre = "";
		double estatura = 0.0, peso = 0.0;
		int edad = 0;

		File file = new File("deportistas.txt");

		// Pasar el objeto File al constructor de Scanner
		try (BufferedWriter escribeNombrePeso = new BufferedWriter(new FileWriter("nombres.txt"));
				BufferedWriter escribeEdad = new BufferedWriter(new FileWriter("edad.txt"));
				BufferedWriter escribeEstatura = new BufferedWriter(new FileWriter("estatura.txt"));) {
			sc = new Scanner(file);
			sc.nextLine(); // pasamos primera línea
			while (sc.hasNextLine()) {
				aux = sc.nextLine().split("\t+");
				nombre = aux[0] + " ";
				edad = Integer.parseInt(aux[1]);
				peso = Double.parseDouble(aux[2]);
				estatura = Double.parseDouble(aux[3]);

				// escribe en el fichero
				escribeNombrePeso.write(nombre + peso + "\n");
				escribeEdad.write(edad + " ");
				escribeEstatura.write(estatura + " ");

			}
			escribeNombrePeso.flush();
			escribeEdad.flush();
			escribeEstatura.flush();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
