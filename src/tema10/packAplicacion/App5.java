package tema10.packAplicacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linea;
		Integer n = 0, max = 0, min = Integer.MAX_VALUE;
		try (BufferedReader lee = new BufferedReader(new FileReader("Numeros1.txt"))) {
			linea = lee.readLine();
			while (linea != null) {
				n = Integer.valueOf(linea);
				if (n > max) {
					max = n;
				}
				if (n < min) {
					min = n;
				}
				linea = lee.readLine();
			}
			System.out.println("El máximo es: " + max + " el mínimo es: " + min);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
