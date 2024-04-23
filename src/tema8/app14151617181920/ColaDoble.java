package tema8.app14151617181920;

import java.util.Arrays;

public class ColaDoble extends Cola {

	@Override
	public void encolar(Integer n) {
		super.encolar(n);
	}

	public void encolarPpio(Integer elemento) {
		super.tabla = Arrays.copyOf(tabla, tabla.length + 1);
		for (int i = tabla.length - 1; i > 0; i--) {
			tabla[i] = tabla[i - 1];

		}
		tabla[0] = elemento;
		System.out.println(Arrays.toString(tabla));

	}

	public Integer desencolarFinal() {
		Integer n = super.tabla[super.tabla.length - 1];
		super.tabla = Arrays.copyOf(super.tabla, super.tabla.length - 1);
		return n;
	}

	@Override
	public String toString() {
		return "ColaDoble [tabla=" + Arrays.toString(tabla) + "]";
	}

}
