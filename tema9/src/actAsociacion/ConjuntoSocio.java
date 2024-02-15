package actAsociacion;

import java.util.Arrays;

public class ConjuntoSocio {
	Socio[] tabla = new Socio[0];

	public void nuevoSocio(Object ob) {
		Socio nuevo = (Socio) ob;
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = nuevo;
	}

	public void eliminaSocio(Integer ID) {
		for (int i = 0; i < tabla.length; i++) {
			if (Socio.getID().equals(ID)) {
				for (int j = i; j < tabla.length - 1; j++) {
					tabla[j] = tabla[j + 1];
				}
				tabla = Arrays.copyOf(tabla, tabla.length - 1);
				return;
			}
		}
		System.out.println("Socio con ID " + ID + " no encontrado.");
	}

	@Override
	public String toString() {
		return "ConjuntoSocio [tabla=" + Arrays.toString(tabla) + "]";
	}

	// GETTERS AND SETTERS
	public Socio[] getTabla() {
		return tabla;
	}

	public void setTabla(Socio[] tabla) {
		this.tabla = tabla;
	}
}
