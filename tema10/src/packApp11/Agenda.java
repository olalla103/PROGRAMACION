package packApp11;

import java.util.Arrays;

public class Agenda {
	Contacto[] agenda = new Contacto[0];

	public void aniadir(Contacto contacto) {
		if (agenda.length < 20) {
			if (existeNombre(contacto.getNombre())) {
				System.out.println("El nombre ya se encuentra en la agenda.");
			} else {
				agenda = Arrays.copyOf(agenda, agenda.length + 1);
				agenda[agenda.length - 1] = contacto;
			}
		} else {
			System.out.println("La agenda está llena.");
		}

	}

	// búsqueda para saber si el nombre se encuentra ya insertado
	public boolean existeNombre(String nombre) {
		boolean flag = false;

		if (agenda.length < 1) {
			flag = false;
		} else {
			for (int i = 0; i < agenda.length && !flag; i++) {
				if (agenda[i].getNombre().equals(nombre)) {
					flag = true;
				}
			}
		}
		return flag;
	}

	// buscar por nombre
	public void buscarNombre(String busca) {
		for (int i = 0; i < agenda.length; i++) {
			if (agenda[i].getNombre().contains(busca)) {
				System.out.println(agenda[i].toString());
			}
		}
	}

	@Override
	public String toString() {
		return "ListaContactos [agenda=" + Arrays.toString(agenda) + "\n";
	}

	// GETTERS AND SETTERS
	public Contacto[] getAgenda() {
		return agenda;
	}

	public void setAgenda(Contacto[] agenda) {
		this.agenda = agenda;
	}
}
