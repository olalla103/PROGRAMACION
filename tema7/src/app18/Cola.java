package app18;

import java.util.Arrays;


public class Cola {
	private Integer[] colilla = new Integer[0];
	private Integer n;

	public void encolar(Integer n) {
		colilla = Arrays.copyOf(colilla, colilla.length + 1);
		colilla[colilla.length - 1] = n;
	}

	public void desencolar() {
		if (colilla.length == 0) {
			System.out.println("No puede desencolar, la cola está vacía.");
		} else {
			for (int i = colilla.length - 1; i > 0; i--) {
				colilla[i - 1] = colilla[i];
			}
			colilla = Arrays.copyOf(colilla, colilla.length - 1);
		}
	}

	public void muestra() {
		System.out.println(Arrays.toString(colilla));
	}

	// GETTERS AND SETTERS
	public Integer[] getColilla() {
		return colilla;
	}

	public void setColilla(Integer[] colilla) {
		this.colilla = colilla;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}

}
