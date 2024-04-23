package tema9.resuelta9_56;

import java.util.Arrays;

public class Cola {
	protected Integer[] tabla = new Integer[0];
	protected Integer n;

	public void encolar(Integer n) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = n;
	}

	public void desencolar() {
		if (tabla.length == 0) {
			System.out.println("No puede desencolar, la cola está vacía.");
		} else {
			for (int i = tabla.length - 1; i > 0; i--) {
				tabla[i - 1] = tabla[i];
			}
			tabla = Arrays.copyOf(tabla, tabla.length - 1);
		}
	}

	public boolean equals(Cola otraLista) {
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
}
