package tema11.packApp10;

import java.io.Serializable;
import java.util.Arrays;

public class TablaClientes implements Serializable {
	private static final long serialVersionUID = 1L;
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

	public Integer compruebaId(Integer id) {
		Integer pos = -1;
		boolean flag = false;
		for (int i = 0; i < clientes.length && !flag; i++) {
			if (Cliente.getId() == id) {
				pos = i;
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("Ese id no se encuentra en la clientes.");
		}
		return pos;
	}

	public void modifica(Integer id, String nombre, String telf) {
		if (compruebaId(id) >= 0) {
			clientes[compruebaId(id)].setNombre(nombre);
			clientes[compruebaId(id)].setTelf(telf);
		}

	}

	public void eliminaCliente(Integer ID) {
		for (int i = 0; i < clientes.length; i++) {
			if (compruebaId(ID) >= 0) {
				for (int j = i; j < clientes.length - 1; j++) {
					clientes[j] = clientes[j + 1];
				}
				clientes = Arrays.copyOf(clientes, clientes.length - 1);

			}
		}
	}

	@Override
	public String toString() {
		return "TablaClientes [clientes=" + Arrays.toString(clientes) + "]";
	}
	
	
}
