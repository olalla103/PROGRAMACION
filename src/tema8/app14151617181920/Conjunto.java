package tema8.app14151617181920;

public class Conjunto extends Lista {

	@Override
	public void aniadir(Integer n) {
		if (buscar(n)) {
			super.aniadir(n);

		} else {
			System.out.println("No se puede añadir porque ese número ya existe en el conjunto.");
		}
	}

	public boolean buscar(Integer elemento) {
		boolean flag = false;
		if (super.tabla.length == 0) {
			return true;
		} else {
			for (int i = 0; i < super.tabla.length && !flag; i++) {
				if (super.tabla[i] == elemento) {
					flag = true;
				}
			}
			if (flag == true) {
				return false;
			} else {
				return true;
			}
		}
	}

	public boolean equals(Conjunto otroConjunto) {
		Integer cont = 0;
		if (super.tabla.length == otroConjunto.tabla.length) {

			for (int i = 0; i < super.tabla.length; i++) {
				if (super.tabla[i] == otroConjunto.tabla[i]) {
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
