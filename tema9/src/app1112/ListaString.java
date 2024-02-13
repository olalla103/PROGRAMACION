package app1112;

import java.util.Arrays;

public class ListaString implements ColaString, PilaString {
	protected String[] tabla = new String[0];
	protected String n;

	public void aniadir(String n) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = n;
	}

	public void eliminar() {
		if (tabla.length == 0) {
			System.out.println("No puede eliminar, la cola está vacía.");
		} else {
			for (int i = tabla.length - 1; i > 0; i--) {
				tabla[i - 1] = tabla[i];
			}
			tabla = Arrays.copyOf(tabla, tabla.length - 1);
		}
	}

	public boolean equals(ListaString otraLista) {
		Integer cont = 0;
		if (this.tabla.length == otraLista.tabla.length) {
			for (int i = 0; i < tabla.length; i++) {
				if (this.tabla[i] == otraLista.tabla[i]) {
					cont++;
				}
			}
			if (cont == tabla.length) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "Lista [tabla=" + Arrays.toString(tabla) + "]";
	}

	@Override
	public void apilar() {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = n;
	}

	@Override
	public void desapilar() {
		if (tabla.length == 0) {
			System.out.println("No puede eliminar, la cola está vacía.");
		} else {
			for (int i = tabla.length - 1; i > 0; i--) {
				tabla[i - 1] = tabla[i];
			}
			tabla = Arrays.copyOf(tabla, tabla.length - 1);
		}
	}

	@Override
	public void encolar() {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = n;
	}

	@Override
	public void desencolar() {
		if (tabla.length == 0) {
			System.out.println("No puede eliminar, la cola está vacía.");
		} else {
			for (int i = tabla.length - 1; i > 0; i--) {
				tabla[i - 1] = tabla[i];
			}
			tabla = Arrays.copyOf(tabla, tabla.length - 1);
		}
	}

}
