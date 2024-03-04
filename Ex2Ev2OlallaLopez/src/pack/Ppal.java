package pack;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		// Atributos y Scanner
		Scanner sc = new Scanner(System.in);
		String marca, modelo;
		Integer numRuedas, pasajeros, numSensores, op, id;
		Boolean sidecar;

		// Declaración de objetos necesarios
		ConjuntoVehiculo conjuntoVehiculo = new ConjuntoVehiculo();
		Automovil automovil;
		Motocicleta motocicleta;
		AutomovilAutonomo automovilAutonomo;

		do {
			System.out.println(
					"Introduzca qué opción desea realizar:\n 1.ALTA de un coche.\n 2.ALTA de una moto.\n 3.ALTA de un coche autónomo."
							+ "\n 4.LISTADO de todos los vehículos creados con todas sus características de total existentes."
							+ "\n 5.LISTADO de coches alquilados\n 6.LISTADO de motos\n 7.Alquilar un vehículo"
							+ "\n 8.Devolver vehículo\n 9.Salir");
			op = sc.nextInt();
			switch (op) {
			case 1:
				// ALTA DE UN COCHE
				System.out.println("Introduzca la marca: ");
				marca = sc.next();
				System.out.println("Introduzca el modelo: ");
				modelo = sc.next();
				System.out.println("Introduzca el número de ruedas:");
				numRuedas = sc.nextInt();
				System.out.println("Introduzca el número de pasajeros: ");
				pasajeros = sc.nextInt();
				automovil = new Automovil(marca, modelo, numRuedas, pasajeros);
				conjuntoVehiculo.alta(automovil);
				break;
			case 2:
				// ALTA DE UNA MOTO
				System.out.println("Introduzca la marca: ");
				marca = sc.next();
				System.out.println("Introduzca el modelo: ");
				modelo = sc.next();
				System.out.println("Introduzca el número de ruedas:");
				numRuedas = sc.nextInt();
				System.out.println("Introduzca true si tiene sidecar, si no, introduzca false: ");
				sidecar = sc.nextBoolean();
				motocicleta = new Motocicleta(marca, modelo, numRuedas, sidecar);
				conjuntoVehiculo.alta(motocicleta);
				break;
			case 3:
				// ALTA DE UN COCHE AUTÓNOMO
				System.out.println("Introduzca la marca: ");
				marca = sc.next();
				System.out.println("Introduzca el modelo: ");
				modelo = sc.next();
				System.out.println("Introduzca el número de ruedas:");
				numRuedas = sc.nextInt();
				System.out.println("Introduzca el número de pasajeros: ");
				pasajeros = sc.nextInt();
				System.out.println("Introduzca el número de sensores que tiene el coche: ");
				numSensores = sc.nextInt();
				do {
					System.out.println("Ese número de sensores no está permitido, debe ser entre 3 y 5.");
					System.out.println("Introduzca el número de sensores que tiene el coche: ");
					numSensores = sc.nextInt();
				} while (numSensores < 3 || numSensores > 5);

				automovilAutonomo = new AutomovilAutonomo(marca, modelo, numRuedas, numSensores);
				conjuntoVehiculo.alta(automovilAutonomo);
				break;
			case 4:
				// LISTADO DE TODOS LOS VEHÍCULOS
				System.out.println(conjuntoVehiculo.listadoCompleto());
				break;
			case 5:
				// LISTADO DE COCHES ALQUILADOS
				conjuntoVehiculo.listadoCochesAlquilados();
				break;
			case 6:
				// LISTADO DE MOTOS
				conjuntoVehiculo.listadoMotos();
				break;
			case 7:
				// ALQUILER DE UN VEHÍCULO POR ID
				System.out.println("Introduzca el id del vehículo que desea alquilar:");
				id = sc.nextInt();
				conjuntoVehiculo.alquilarVehiculo(id);
				break;
			case 8:
				// DEVOLUCIÓN DE UN VEHÍCULO POR ID
				System.out.println("Introduzca el id del vehículo que desea devolver: ");
				id = sc.nextInt();
				conjuntoVehiculo.devolverVehiculo(id);
				break;
			}
		} while (op != 9);
		System.out.println("Hasta luego!");

		sc.close();

	}

}
