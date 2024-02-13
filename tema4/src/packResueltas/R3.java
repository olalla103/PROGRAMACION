package packResueltas;

import java.util.Scanner;

public class R3 {

	public static void main(String[] args) {
		// VARIABLES Y SCANNER
		Scanner sc = new Scanner(System.in);
		int op;
		double radio, altura;

		// DAMOS VALOR A LAS VARIABLES
		do {
			System.out.println("Introduzca qué desea calcular:\n1 = calcular área\n2 = calcular volumen");
			op = sc.nextInt();
			if (op != 1 && op != 2) {
				System.out.println("No ha seleccionado una opción válida.");
			}
		} while (op != 1 && op != 2);
		System.out.println("Introduzca el radio de su cilindro:");
		radio = sc.nextDouble();
		System.out.println("Introduzca la altura de su cilindro:");
		altura = sc.nextDouble();

		// LLAMADA A LA FUNCIÓN
		System.out.println(areaVolumen(op, radio, altura));

		sc.close();
	}

	public static double areaVolumen(int op, double radio, double altura) {
		double area = 0, volumen;

		if (op == 1) {
			System.out.println("Va a calcular el área:");
			area = 2 * Math.PI * radio * (altura + radio);
			return area;
		} else if (op == 2) {
			System.out.println("Va a calcular el volumen:");
			volumen = Math.PI * Math.pow(radio, 2) * altura;
			return volumen;
		}
		return area;

	}
}
