package articulos;

import java.util.Arrays;

public class ConjuntoArticulo {
	Articulo[] conjuntoArticulos = new Articulo[0];

	public void alta(Articulo articulo) {
		conjuntoArticulos = Arrays.copyOf(conjuntoArticulos, conjuntoArticulos.length + 1);
		conjuntoArticulos[conjuntoArticulos.length - 1] = articulo;
		System.out.println(conjuntoArticulos.toString());

	}

	public void baja(Integer codigo) {
		for (int i = 0; i < conjuntoArticulos.length; i++) {
			if (conjuntoArticulos[i].getCodigo().equals(codigo)) {
				for (int j = i; j < conjuntoArticulos.length - 1; j++) {
					conjuntoArticulos[j] = conjuntoArticulos[j + 1];
				}
				conjuntoArticulos = Arrays.copyOf(conjuntoArticulos, conjuntoArticulos.length - 1);
				Articulo.cont--;
			}
		}
		System.out.println(conjuntoArticulos.toString());

	}

	public void modifica(Integer codigo, Double precioVenta) {
		boolean flag = false;
		for (int i = 0; i < conjuntoArticulos.length && !flag; i++) {
			if (conjuntoArticulos[i].getCodigo().equals(codigo)) {
				conjuntoArticulos[i].setPrecioVenta(precioVenta);
				flag = true;
			}
		}
		System.out.println(conjuntoArticulos.toString());
	}

	public void entradaMercancia(Integer codigo, Integer cant) {
		boolean flag = false;
		for (int i = 0; i < conjuntoArticulos.length && !flag; i++) {
			if (conjuntoArticulos[i].getCodigo().equals(codigo)) {
				conjuntoArticulos[i].setStock(conjuntoArticulos[i].stock + cant);
				flag = true;
			}
		}
		System.out.println(conjuntoArticulos.toString());

	}

	public void salidaMercancia(Integer codigo, Integer cant) {
		boolean flag = false;
		for (int i = 0; i < conjuntoArticulos.length && !flag; i++) {
			if (conjuntoArticulos[i].getCodigo().equals(codigo)) {
				conjuntoArticulos[i].setStock(conjuntoArticulos[i].stock - cant);
				flag = true;
			}
		}
		System.out.println(conjuntoArticulos.toString());
	}

	public void ordenaPorCodigo() {
		Arrays.sort(conjuntoArticulos);
		System.out.println(conjuntoArticulos.toString());
	}

	@Override
	public String toString() {
		return Arrays.toString(conjuntoArticulos);
	}

}
