package packClase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Clase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "", num2 = "";
		int[] todoJunto = new int[0];

		// leer del fichero
		try (BufferedReader lee1 = new BufferedReader(new FileReader("n1.txt"));
				BufferedReader lee2 = new BufferedReader(new FileReader("n2.txt"))) {
			num1 = lee1.readLine();
			while (num1 != null) {
				// comprueba si está el número en la tabla
				if (!estaDentro(todoJunto, Integer.valueOf(num1))) {
					todoJunto = Arrays.copyOf(todoJunto, todoJunto.length + 1);
					todoJunto[todoJunto.length - 1] = Integer.valueOf(num1);
				}

				num1 = lee1.readLine();
			}
			num2 = lee2.readLine();
			while (num2 != null) {
				// comprueba si el numero está en la tabla
				if (!estaDentro(todoJunto, Integer.valueOf(num2))) {
					todoJunto = Arrays.copyOf(todoJunto, todoJunto.length + 1);
					todoJunto[todoJunto.length - 1] = Integer.valueOf(num2);
				}
				num2 = lee2.readLine();
			}

		} catch (IOException e) {
			System.out.println("No lee.");
		}
		Arrays.sort(todoJunto);
		// escribir en el fichero
		try (BufferedWriter escribe = new BufferedWriter(new FileWriter("todoJunto.txt"))) {
			for (int i = 0; i < todoJunto.length; i++) {
				escribe.write(todoJunto[i] + "\n");
				escribe.flush();
			}
		} catch (IOException e) {
			System.out.println("No escribe.");
		}

	}

	// metodo de busqueda
	public static boolean estaDentro(int[] tabla, int n) {
		boolean flag = false;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == n) {
				flag = true;
			}
		}
		return flag;
	}
}
