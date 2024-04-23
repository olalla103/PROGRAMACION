package tema3.packResueltas;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int edad = 0, cont = 0, mayor = 0, sumaEdad = 0;

		System.out.println("Introduzca una edad:");
		edad = sc.nextInt();
		sumaEdad += edad;
		while (edad > 0) {
			cont++;
			if (edad >= 18) {
				mayor++;
			}
			System.out.println("Introduzca una edad:");
			edad = sc.nextInt();
			sumaEdad += edad;

		}
		System.out.println("Hay un total de " + cont + " alumnos.\nLa media de edad es " + (sumaEdad / cont) + " y " + mayor
				+ " son mayores de edad");
		sc.close();

	}

}
