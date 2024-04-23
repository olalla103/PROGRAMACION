package tema2.packAplicacion;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int comidaDiaria, numAnimales, kilosPorAnimal;

		System.out.println("Introduzca el número de animales: ");
		numAnimales = sc.nextInt();
		System.out.println("Introduzca la cantidad de comida que necesitan los animales: ");
		kilosPorAnimal = sc.nextInt();
		System.out.println("Introduzca la cantidad de comida de la que dispone: ");
		comidaDiaria = sc.nextInt();

		if (numAnimales == 0) {
			System.out.println("No se puede ejecutar el programa.");
		} else {
			if (comidaDiaria / kilosPorAnimal >= numAnimales) {
				System.out.println("Se pueden alimentar a los animales.");
			} else {
				System.out.println("No se puede alimentar a los animales necesita un total de "
						+ comidaDiaria / numAnimales + " kilos.");
			}
		}
		sc.close();

	}

}
