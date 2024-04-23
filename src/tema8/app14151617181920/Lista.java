package tema8.app14151617181920;

import java.util.Arrays;

public class Lista {
	protected Integer[] tabla = new Integer[0];
	protected Integer n;

	public void aniadir(Integer n) {
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

	public boolean equals(Lista otraLista) {
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

	public String toString() {
		return Arrays.toString(tabla);
	}

	// GETTERS AND SETTERS
	public Integer[] gettabla() {
		return tabla;
	}

	public void settabla(Integer[] tabla) {
		this.tabla = tabla;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}
}
