package packActsClase;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int op, n1, n2;

		do {
			// OPCIONES
			do {
				System.out.println(
						"Introduzca una opción:\n1.- Suma\n2.- Resta\n3.- Multiplicación\n4.- División\n5.- Raíz Cuadrada\n6.- Salir");
				op = sc.nextInt();
			} while (op < 1 || op > 6);

			// OPERACIONES
			switch (op) {
			case 1:
				System.out.println("Ha seleccionado suma.");
				System.out.println("Introduzca un número:");
				n1 = sc.nextInt();
				System.out.println("Introduzca un número:");
				n2 = sc.nextInt();
				System.out.println("La suma entre " + n1 + " + " + n2 + " es igual a: " + (n1 + n2));
				break;

			case 2:
				System.out.println("Ha seleccionado resta.");
				System.out.println("Introduzca un número:");
				n1 = sc.nextInt();
				System.out.println("Introduzca un número:");
				n2 = sc.nextInt();
				System.out.println("La resta entre " + n1 + " - " + n2 + " es igual a: " + (n1 - n2));
				break;

			case 3:
				System.out.println("Ha seleccionado multiplicación.");
				System.out.println("Introduzca un número:");
				n1 = sc.nextInt();
				System.out.println("Introduzca un número:");
				n2 = sc.nextInt();
				System.out.println("La multiplicacióin entre " + n1 + " * " + n2 + " es igual a: " + (n1 * n2));
				break;

			case 4:
				System.out.println("Ha seleccionado división.");
				System.out.println("Introduzca un número:");
				n1 = sc.nextInt();
				System.out.println("Introduzca un número:");
				n2 = sc.nextInt();
				System.out.println("La resta entre " + n1 + " / " + n2 + " es igual a: " + (n1 / n2));
				break;

			case 5:
				System.out.println("Ha seleccionado raíz cuadrada.");
				System.out.println("Introduzca un número:");
				n1 = sc.nextInt();
				System.out.println("La raíz cuadrada de " + n1 + " es: " + (int) Math.sqrt(n1));
				break;

			default:
				System.out.println("Hasta luego!");
			}

		} while (op != 6);

		sc.close();

	}

}
