package packPropuestas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linea = "", texto = "";
		BufferedReader leeLinea = null;

		try {

			leeLinea = new BufferedReader(new FileReader("Propuesta1.txt"));
			linea = leeLinea.readLine();
			while (linea != null) {
				texto = texto + linea + "\n";
				linea = leeLinea.readLine();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (linea != null) {
				try {
					leeLinea.close();
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		}
		System.out.println(texto);
	}

}
