package packResueltas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class R2 {

	public static void main(String[] args) {
		// declaramos variables
		int c; // donde vamos a ir guardando carácter a carácter
		String texto = " "; // aquí haremos el texto al completo sumando los caracteres
		FileReader in = null; // la que va a leer el archivo
		try {
			in = new FileReader("\\C:\\Users\\nacho\\PROGRAMACION\\tema1\\A1.java"); // le decimos donde tiene que leer
			c = in.read(); // lee
			while (c != -1) { // mientras que la lectura sea diferente de -1 (fichero acabado)
				texto = texto + (char) c; // vamos creando el texto
				c = in.read(); // volvemos a leer
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");
		} catch (IOException e) {
			System.out.println("Fin de ficero.");
		} finally {
			if (in != null) {
				try {
					in.close(); // cerramos el archivo que estamos leyendo
				} catch (IOException e2) {
					System.out.println(e2);
				}
			}
		}
		System.out.println(texto); // imprimimos todo el texto recogido

	}

}
