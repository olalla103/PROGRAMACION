package tema10.packAplicacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		String[] aux;
		double estatura = 0.0, peso = 0.0;
		int edad = 0, cont = 0;

		File file = new File("deportistas.txt");

		// Pasar el objeto File al constructor de Scanner
		try {
			sc = new Scanner(file);
			sc.nextLine(); // pasamos primera línea
			while (sc.hasNextLine()) {
				aux = sc.nextLine().split("\t+");
				edad += Integer.parseInt(aux[1]);
				peso += Double.parseDouble(aux[2]);
				estatura += Double.parseDouble(aux[3]);
				cont++;

			}
			System.out.println("La edad media es: " + edad / cont + "\nEl peso medio es: " + peso / cont
					+ "\nLa estatura media es: " + estatura / cont);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
