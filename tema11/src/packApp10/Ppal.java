package packApp10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TablaClientes tabla = new TablaClientes();
		Cliente cliente;
		String nombre, telf;
		Integer op, id;

		// lectura en el fichero para meter en la tabla
		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("clientes.dat"))) {
			tabla = (TablaClientes) lee.readObject();

		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Fichero vacío");
		}
		System.out.println(tabla.toString());

		do {
			System.out.println(
					"1.Añadir nuevo cliente\n2.Modificar datos\n3.Dar de baja cliente\n4.Listar los clientes.\n5.Salir");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Introduzca el nombre del cliente:");
				nombre = sc.next();
				System.out.println("Introduzca el teléfono del cliente:");
				telf = sc.next();
				cliente = new Cliente(nombre, telf);
				tabla.alta(cliente);
				break;
			case 2:
				System.out.println("Introduzca el código del cliente que desea modificar:");
				id = sc.nextInt();
				tabla.compruebaId(id);
				if (tabla.compruebaId(id) >= 0) {
					System.out.println("Introduzca el nuevo nombre:");
					nombre = sc.next();
					System.out.println("Introduzca el nuevo teléfono:");
					telf = sc.next();
					tabla.modifica(id, nombre, telf);
				}
				break;
			case 3:
				System.out.println("Introduzca el id del cliente que desea dar de baja:");
				id = sc.nextInt();
				if (tabla.compruebaId(id) >= 0) {
					tabla.eliminaCliente(id);
				}
				break;
			case 4:
				System.out.println(tabla.toString());
				break;
			}
		} while (op < 5);

		// escribir en el fichero
		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("clientes.dat"))) {
			escribe.writeObject(tabla);
		} catch (IOException e) {
			System.out.println("No se encuentra el fichero.");
		}

		sc.close();

	}
}
