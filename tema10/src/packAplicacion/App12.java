package packAplicacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linea = "";
		Scanner sc;
		double estatura = 0.0, peso = 0.0;
		int edad = 0, cont = 0;

		try (BufferedReader lee = new BufferedReader(new FileReader("deportistas.txt"))) {
			linea = lee.readLine();
			while (linea != null) {
				cont++;
				sc = new Scanner(linea);
				if (sc.hasNextInt()) {
					edad += sc.nextInt();
				}
				if (sc.hasNextDouble()) {
					peso += sc.nextDouble();
					estatura += sc.nextDouble();
				}
				linea = lee.readLine();
			}
			System.out.println("La edad media es: " + edad / cont + "\nEl peso medio es: " + peso / cont
					+ "\nLa estatura media: " + estatura / cont);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
