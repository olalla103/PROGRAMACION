package tema10.packApp11;

import java.io.*;
import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, telefono, linea = "";
		String[] separa = new String[2];
		int op;
		Agenda agenda = new Agenda();
		Contacto contacto;

		try (BufferedReader lee = new BufferedReader(new FileReader("agenda.txt"))) {
			linea = lee.readLine();
			while (linea != null) {
				separa = linea.split(" ");
				nombre = separa[0];
				telefono = separa[1];
				contacto = new Contacto(nombre, telefono);
				agenda.aniadir(contacto);
				linea = lee.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(agenda.toString());
		do {
			System.out.println(
					"Introduzca qué opción desea realizar:\n1.Nuevo contacto\n2.Buscar por nombre\n3.Mostrar todos\n4.Salir");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Introduzca el nombre del contacto que desea añadir: ");
				nombre = sc.next();
				System.out.println("Introduzca el teléfono del contacto:");
				telefono = sc.next();
				contacto = new Contacto(nombre, telefono);
				agenda.aniadir(contacto);
				break;
			case 2:
				System.out.println("Introduzca el nombre que desea buscar: ");
				nombre = sc.next();
				agenda.buscarNombre(nombre);
				break;
			case 3:
				System.out.println(agenda.toString());
				break;
			}
		} while (op != 4);

		try (BufferedWriter escribe = new BufferedWriter(new FileWriter("agenda.txt"))) {
			linea = "";
			for (int i = 0; i < agenda.agenda.length; i++) {
				linea += agenda.agenda[i].getNombre() + " " + agenda.agenda[i].getTelefono() + "\n";
			}
			escribe.write(linea);
			escribe.flush();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hasta luego!");
		sc.close();

	}

}
