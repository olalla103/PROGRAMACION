package tema7.app21;

import java.util.Arrays;

public class Conjunto {

	private Integer[] conjunto = new Integer[0];

	public Conjunto() {

	}

	public Conjunto(Integer[] conjunto) {

		this.conjunto = conjunto;
	}

	public int numElementos() {
		return conjunto.length;
	}

	public boolean insertarElemento(Integer nuevo) {
		Arrays.sort(conjunto);
		if (!pertenece(nuevo)) {
			conjunto = Arrays.copyOf(conjunto, conjunto.length + 1);
			conjunto[conjunto.length - 1] = nuevo;
			return true;
		} else {
			System.out.println("Ya existe ese número en el conjunto.");
			return false;
		}
	}

	public boolean insertarConjunto(Conjunto otroConjunto) {
		Arrays.sort(conjunto);
		if (Arrays.binarySearch(conjunto, otroConjunto.conjunto) < 0) {
			conjunto = Arrays.copyOf(conjunto, conjunto.length + otroConjunto.conjunto.length);
//			System.arraycopy(otroConjunto.conjunto, 0, conjunto, otroConjunto.conjunto.length - 1,
//					otroConjunto.conjunto.length - 1);
			for (int i = 0; i < otroConjunto.conjunto.length; i++) {
				conjunto[i] = otroConjunto.conjunto[i];
			}
			return true;
		} else {
			System.out.println("Ya existe ese conjunto.");
			return false;
		}
	}

	public boolean eliminarElemento(Integer elemento) {
		Integer n = Arrays.binarySearch(conjunto, elemento);
		if (n > 0) {
			for (int i = conjunto.length - 1; i >= n; i--) {
				conjunto[i - 1] = conjunto[i];
			}
			conjunto = Arrays.copyOf(conjunto, conjunto.length - 1);
			return true;
		} else {
			System.out.println("Ese número no se encuentra en el conjunto.");
			return false;
		}

	}

	// revisar
	public boolean eliminarConjunto(Conjunto otroConjunto) {
		Integer n = Arrays.binarySearch(conjunto, otroConjunto.conjunto);

		if (n > 0) {
			Integer aux[] = new Integer[otroConjunto.conjunto.length];
			System.arraycopy(conjunto, 0, aux, 0, n);
			System.arraycopy(conjunto, aux.length, conjunto, n, conjunto.length);
		}
		return false;
	}

	public boolean pertenece(Integer elemento) {
		if (Arrays.binarySearch(conjunto, elemento) > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void muestra() {
		System.out.println(Arrays.toString(conjunto));
	}

	public Integer[] getConjunto() {
		return conjunto;
	}

	public void setConjunto(Integer[] conjunto) {
		this.conjunto = conjunto;
	}
}
