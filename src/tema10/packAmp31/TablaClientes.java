package tema10.packAmp31;

import java.util.Arrays;

public class TablaClientes {
	Clientes[] tablaClientes = new Clientes[0];

	public void alta(Clientes cliente) {
		tablaClientes = Arrays.copyOf(tablaClientes, tablaClientes.length + 1);
		tablaClientes[tablaClientes.length - 1] = cliente;
	}

	public void baja(String dni) {
		for (int i = 0; i < tablaClientes.length; i++) {
			if (busca(dni)) {
				for (int j = i; j < tablaClientes.length - 1; j++) {
					tablaClientes[j] = tablaClientes[j + 1];
				}
				tablaClientes = Arrays.copyOf(tablaClientes, tablaClientes.length - 1);
			}
		}

	}

	public boolean busca(String dni) {
		boolean flag = false;
		for (int i = 0; i < tablaClientes.length; i++) {
			if (tablaClientes[i].getDni().equals(dni)) {
				flag = true;
			}
		}
		return flag;
	}
}
