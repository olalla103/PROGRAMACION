package packAplicacion;

import java.util.Arrays;

public class App8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "";
		Arrays.toString(leerEnteros(texto));
		

	}

	public static Integer[] leerEnteros(String texto) {
		String espacio = " ";
		String[] t = texto.split(" ");
		Integer[] numeros = new Integer[t.length];
		for (int i = 0; i < t.length; i++) {
			numeros[i] = Integer.valueOf(t[i]);
		}

		return numeros;
	}
}
