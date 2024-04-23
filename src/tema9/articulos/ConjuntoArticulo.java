package tema9.articulos;

import java.util.Arrays;

public class ConjuntoArticulo {
	Articulo[] conjuntoArticulos = new Articulo[0];

	public void alta(Articulo articulo) {
		conjuntoArticulos = Arrays.copyOf(conjuntoArticulos, conjuntoArticulos.length + 1);
		conjuntoArticulos[conjuntoArticulos.length - 1] = articulo;

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

	}

	public void modifica(Integer codigo, Double precioVenta) {
		boolean flag = false;
		for (int i = 0; i < conjuntoArticulos.length && !flag; i++) {
			if (conjuntoArticulos[i].getCodigo().equals(codigo)) {
				conjuntoArticulos[i].setPrecioVenta(precioVenta);
				flag = true;
			}
		}
	}

	public void entradaMercancia(Integer codigo, Integer cant) {
		boolean flag = false;
		Integer pos = 0, cantTotal;
		for (int i = 0; i < conjuntoArticulos.length && !flag; i++) {
			if (conjuntoArticulos[i].getCodigo().equals(codigo)) {
				pos = i;
				flag = true;
			}
		}
		cantTotal = conjuntoArticulos[pos].getStock() + cant;
		conjuntoArticulos[pos].setStock(cantTotal);
		System.out.println(conjuntoArticulos[pos].getStock());

	}

	public void salidaMercancia(Integer codigo, Integer cant) {
		boolean flag = false;
		for (int i = 0; i < conjuntoArticulos.length && !flag; i++) {
			if (conjuntoArticulos[i].getCodigo().equals(codigo)) {
				conjuntoArticulos[i].setStock(conjuntoArticulos[i].stock - cant);
				flag = true;
			}
		}
	}

	public void ordenaPorCodigo() {
		Arrays.sort(conjuntoArticulos);
	}

	@Override
	public String toString() {
		return "ConjuntoArticulo [conjuntoArticulos=" + Arrays.toString(conjuntoArticulos) + "]\n";
	}

}
