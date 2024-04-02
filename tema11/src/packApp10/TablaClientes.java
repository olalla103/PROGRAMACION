package packApp10;

import java.util.Arrays;

public class TablaClientes {
	Cliente[] clientes = new Cliente[0];

	public void alta(Cliente c) {
		if (!compruebaNombre(c.getNombre())) {
			clientes = Arrays.copyOf(clientes, clientes.length + 1);
			clientes[clientes.length - 1] = c;
		} else {
			System.out.println("Ese nombre se encuentra en la lista.");
		}
	}

	public boolean compruebaNombre(String nombre) {
		boolean flag = false;
		for (int i = 0; i < clientes.length && !flag; i++) {
			if (clientes[i].getNombre().equals(nombre)) {
				flag = true;
			}
		}
		return flag;
	}

	// terminar
	public void modifica(Integer id) {
		boolean flag = false;
		for (int i = 0; i < clientes.length && !flag; i++) {
			if (Cliente.getId() == id) {

				flag = true;
			}
		}
	}
}
