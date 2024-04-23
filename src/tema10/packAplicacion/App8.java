package tema10.packAplicacion;

import java.util.Arrays;
import java.util.Scanner;

public class App8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un texto en una sola línea:");
		texto = sc.nextLine();

		System.out.println(Arrays.toString(leerEnteros(texto)));

		sc.close();
	}

	public static Integer[] leerEnteros(String texto) {
		String num = "";
		Scanner sc = new Scanner(texto);

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				num += sc.nextInt() + " ";
			} else {
				sc.next(); // Avanzar al siguiente token si no es un entero
			}
		}
		String[] t = num.split(" ");
		Integer[] numeros = new Integer[t.length];
		for (int i = 0; i < t.length; i++) {
			numeros[i] = Integer.valueOf(t[i]);
		}
		sc.close();
		return numeros;
	}

}
