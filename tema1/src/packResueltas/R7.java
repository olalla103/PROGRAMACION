package packResueltas;

import java.util.Scanner;

public class R7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radio, longitud, area;
		System.out.println("Introduzca el radio de una circunferencia: ");
		radio = sc.nextDouble();
		longitud = (2 * Math.PI) * radio;
		area = Math.PI * Math.pow(radio, 2);
		System.out.println(
				"La longitud de su circunferencia es: " + longitud + "\nEl área de su circunferencia es: " + area);
		sc.close();
	}

}
