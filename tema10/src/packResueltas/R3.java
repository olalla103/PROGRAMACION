package packResueltas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class R3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linea = "", texto = "";
		BufferedReader leeLinea = null;
		try {
			leeLinea = new BufferedReader(new FileReader("Ppal.txt"));
			linea = leeLinea.readLine();
			while (linea != null) {
				texto = texto + linea + "\n";
				linea = leeLinea.readLine();

			}
		} catch (IOException e) {
			System.out.println("Fin de fichero.");
		} finally {
			if (leeLinea != null) {
				try {
					leeLinea.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
		}
		System.out.println(texto);
	}

}
