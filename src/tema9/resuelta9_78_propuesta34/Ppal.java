package tema9.resuelta9_78_propuesta34;

import java.util.Arrays;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socio[] tablaSocios = new Socio[3];

		Socio socio1 = new Socio(1, "Olalla", "10-03-2004");
		Socio socio2 = new Socio(2, "María", "28-04-2004");
		Socio socio3 = new Socio(3, "Celia", "01-07-2004");

		tablaSocios[0] = socio1;
		tablaSocios[1] = socio2;
		tablaSocios[2] = socio3;

		Arrays.sort(tablaSocios);
		System.out.println(Arrays.toString(tablaSocios));

		System.out.println(socio3.compareTo(socio2));
		System.out.println(socio1.compareTo(socio1));
		System.out.println(socio1.toString());

	}

}
