package actAsociacion;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		/*
		 * Realizar un menú de opciones para llevar el mantenimiento de una asociación
		 * de forma que de cada socio los datos son: un ID, un nombre y una fecha de
		 * nacimiento. El ID es el campo clave y no se puede repetir, de tipo numérico.
		 * Además, se desea conocer cuál es el número de socios que tiene la asociación.
		 * Las operaciones que se van a realizar son: - Alta de socio (comprobar que el
		 * ID sea único) - Eliminación de socio (solicita el ID que quiera eliminar) -
		 * Consultar el nº de socios existentes - Consultar los datos de un socio en
		 * concreto (solicita ID) - Modificar la fecha de nacimiento (solicita ID) -
		 * Listado ordenado por ID (criterio de ordenación natural) - Listado ordenado
		 * por la edad y en caso de la misma edad, se ordenará por el nombre del socio -
		 * Salir
		 */
		Scanner sc = new Scanner(System.in);
		Socio socio;
		String nombre, fechaNacimiento;
		Integer op, ID;
		ConjuntoSocio tabla = new ConjuntoSocio();

		do {
			System.out.println(
					"Introduzca qué opción desea realizar:\n 1.Alta socio.\n 2.Elimina Socio.\n 3.Consultar cantidad total de socios existentes."
							+ "\n 4.Consultar datos de un socio concreto.\n 5.Listar por ID.\n 6.Listar por edad.\n 7.Salir");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Introduzca el nombre del socio:");
				nombre = sc.next();
				System.out.println("Introduzca la fecha de nacimiento del socio (el formato es dd-MM-aaa):");
				fechaNacimiento = sc.next();
				socio = new Socio(nombre, fechaNacimiento);
				tabla.nuevoSocio(socio);
				System.out.println(tabla.toString());
				break;

			case 2:
				System.out.println("Introduzca el ID del socio que desea eliminar: ");
				ID = sc.nextInt();
				tabla.eliminaSocio(ID);
				System.out.println(tabla.toString());
				break;

			case 3:
				System.out.println(tabla.max());
				break;
			case 4:
				System.out.println("Introduzca el ID del socio que desea consultar:");
				ID = sc.nextInt();
				tabla.verSocio(ID);
				break;
			case 5:

				break;
			case 6:

				break;

			}
		} while (op != 7);

		sc.close();

	}

}
