package packApp12;

import java.util.Arrays;

public class Lista {
	Object[] elementos = new Object[0];
	Integer tamaño;

	public void alta(Object o) {
		elementos = Arrays.copyOf(elementos, elementos.length + 1);
		elementos[elementos.length - 1] = (Empleado) o;
	}

	public void mostrarDatos(String dni) {
		int pos = compruebaDni(dni);

		if (pos >= 0) {
			if (elementos[pos] instanceof Empleado) {
				Empleado empleado = (Empleado) elementos[pos];
				System.out.println(empleado.toString());
			}
		}
	}

	public int compruebaDni(String dni) {
		int pos = -1;
		boolean flag = false;
		for (int i = 0; i < elementos.length && !flag; i++) {
			if (elementos[i] instanceof Empleado) {
				Empleado empleado = (Empleado) elementos[i];
				if (empleado.getDni().equals(dni)) {
					pos = i;
					flag = true;
				}
			}
		}
		return pos;
	}

	public void eliminaCliente(String dni) {
		int pos = compruebaDni(dni);
		if (pos >= 0) {
			for (int i = 0; i < elementos.length; i++) {
				if (elementos[i] instanceof Empleado) {
					Empleado empleado = (Empleado) elementos[i];
					if (empleado.getDni().equals(dni)) {
						for (int j = i; j < elementos.length - 1; j++) {
							elementos[j] = elementos[j + 1];

						}
						elementos = Arrays.copyOf(elementos, elementos.length - 1);
					}
				}
			}
		} else {
			System.out.println("El dni introducido no se encuentra.");
		}
	}

	@Override
	public String toString() {
		return "Lista [elementos=" + Arrays.toString(elementos) + ", tamaño=" + tamaño + "]";
	}

}
