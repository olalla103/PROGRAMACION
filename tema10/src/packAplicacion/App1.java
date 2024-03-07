package packAplicacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class App1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in), intros;
		String nombre, linea, texto = "";

		System.out.println("Introduzca el nombre del fichero que desea leer: ");
		nombre = sc.next();
		if (nombre.equals("")) {
			nombre = "prueba.txt";
		}

		try (BufferedReader lee = new BufferedReader(new FileReader(nombre))) {
			linea = lee.readLine();
			intros = new Scanner(linea);
			while (linea != null) {
				texto += linea;
				linea = lee.readLine();
			}
			System.out.println(texto);
			intros.close();
			sc.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
