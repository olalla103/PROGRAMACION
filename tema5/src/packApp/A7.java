package packApp;

import java.util.Arrays;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = { 10, 1, 5, 8, 9, 2 };
		System.out.println(Arrays.toString(suma(tabla, 3)));

	}

	public static int[] suma(int tabla[], int numElementos) {
		int[] aux = new int[0];
		int i = 0, suma = 0, cont = 0;
		while (i != tabla.length) {
			suma += tabla[i];
			i++;
			cont++;
			if (cont == numElementos) {
				aux = Arrays.copyOf(aux, aux.length + 1);
				aux[aux.length - 1] = suma;
				i = i + 1 - numElementos;
				suma = 0;
				cont = 0;
			}
		}
		return aux;
	}

}
