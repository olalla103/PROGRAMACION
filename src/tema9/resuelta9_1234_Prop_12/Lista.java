   package tema9.resuelta9_1234_Prop_12;

import java.util.Arrays;

public class Lista implements Pila, Cola, ColaDoble {
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

	@Override
	public String toString() {
		return "Lista [tabla=" + Arrays.toString(tabla) + "]";
	}

	@Override
	public void encolar(Integer nuevo) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = nuevo;

	}

	@Override
	public void desencolar() {
		// TODO Auto-generated method stub
		// aquí desencolas

	}

	@Override
	public void empilar(Integer n) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = n;

	}

	@Override
	public void desempilar() {
		tabla = Arrays.copyOf(tabla, tabla.length - 1);

	}

	@Override
	public void encolarPpio(Integer elemento) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer desencolarFinal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void encolarMultiple(Integer cantidad) {
		// TODO Auto-generated method stub
		for (int i = 0; i < cantidad; i++) {
			this.encolar(n);
		}

	}

}
