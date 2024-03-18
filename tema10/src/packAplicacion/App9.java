package packAplicacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linea = "";
		try (BufferedReader lee = new BufferedReader(new FileReader("app19.txt"))) {
			linea = lee.readLine();
			while (linea != null) {
				linea = lee.readLine();

			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}
	/*
	 * public static void codificar(String linea) { char[] alfabeto = { 'a', 'b',
	 * 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
	 * 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	 * 
	 * char[] cifrado = { 'e', 'm', 's', 'r', 'c', 'y', 'j', 'n', 'f', 'x', 'i',
	 * 'w', 't', 'a', 'k', 'o', 'z', 'd', 'l', 'q', 'v', 'b', 'h', 'u', 'p', 'g' };
	 * int i = 0; Scanner leeLinea = new Scanner(linea);
	 * 
	 * while (leeLinea.hasNext()) { if (alfabeto[i] == leeLinea.next().charAt(i)) {
	 * // me falta escribir en el fichero } } }
	 */
}
