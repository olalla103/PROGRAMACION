package Ex2Ev2OlallaLopez.pack;

import java.util.Arrays;

public class ConjuntoVehiculo {
	Vehiculo[] vehiculos = new Vehiculo[0];

	// damos de alta
	public void alta(Vehiculo v) {
		vehiculos = Arrays.copyOf(vehiculos, vehiculos.length + 1);
		vehiculos[vehiculos.length - 1] = v;
	}

	// LISTADO DE COCHES Y MOTOS
	public String listadoCompleto() {
		return Arrays.toString(vehiculos);
	}

	// LISTADO DE COCHES ALQUILADOS
	public void listadoCochesAlquilados() {
		for (int i = 0; i < vehiculos.length; i++) {
			if (vehiculos[i] instanceof Vehiculo && vehiculos[i].getAlquilado()) {
				System.out.print(vehiculos[i] + " ");
			}
		}
	}

	// LISTADO DE MOTOS
	public void listadoMotos() {
		for (int i = 0; i < vehiculos.length; i++) {
			if (vehiculos[i] instanceof Motocicleta) {
				System.out.print(vehiculos[i] + " ");
			}
		}
	}

	// ALQUILER DE UN VEHÍCULO POR ID
	public void alquilarVehiculo(Integer id) {
		boolean flag = false;
		if (id > Vehiculo.contid) {
			System.out.println("El id introducido no es correcto.");
		} else {
			for (int i = 0; i < vehiculos.length && !flag; i++) {
				if (vehiculos[i].getId() == id || id < Vehiculo.contid) {
					if (vehiculos[i].getAlquilado()) {
						System.out.println("No puede alquilar ese coche, ya está alquilado.");
						flag = true;
					} else {
						vehiculos[i].setAlquilado(true);
						flag = true;
					}
				}
			}
		}

	}

	// DEVOLUCIÓN DE UN VEHÍCULO POR ID
	public void devolverVehiculo(Integer id) {
		boolean flag = false;
		if (id > Vehiculo.contid || id < Vehiculo.contid) {
			System.out.println("El id introducido no es correcto.");
		} else {
			for (int i = 0; i < vehiculos.length && !flag; i++) {
				if (vehiculos[i].getId() == id) {
					if (!vehiculos[i].getAlquilado()) {
						System.out.println("No puede devolver ese coche, ya está devuelto.");
						flag = false;
					} else {
						vehiculos[i].setAlquilado(false);
						flag = true;
					}
				}
			}
		}

	}

	

}
