package tema3.packResueltas;

import java.util.Scanner;

public class R4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double altura, max = 0;
		int etiqueta, etiquetaArbolMasAlto;

		System.out.println("Introduzca la altura de su árbol:");
		altura = sc.nextDouble();
		etiqueta = 0;
		etiquetaArbolMasAlto = 0;
		while (altura != -1) {
			if (altura > max) {
				max = altura;
				etiquetaArbolMasAlto = etiqueta;
			}
			etiqueta++;
			System.out.println("Introduzca la altura de su árbol:");
			altura = sc.nextDouble();

		}
		if (max == -1) {
			System.out.println("No ha introducido árboles.");
		} else {
			System.out.println("El árbol más alto mide: " + altura + "\nEtiqueta del árbol: " + etiquetaArbolMasAlto);
		}
		sc.close();

	}

}
