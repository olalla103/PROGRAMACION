package packPropuestas;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// Pide por teclado el nombre, la edad y la estatura en metros, introduce los
		// datos en una sola línea.
		Scanner sc = new Scanner(System.in);
		String nombre;
		int edad;
		double estatura;

		System.out.println("Introduzca su nombre, su edad y su altura: ");
		nombre = sc.next();
		edad = sc.nextInt();
		estatura = sc.nextDouble();

		System.out.println(nombre + " " + edad + " " + estatura);

		sc.close();

	}

}
