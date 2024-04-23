package tema1.packResueltas;

public class R13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3, nT;
		double notaTotalEX;
		System.out.println("Introduzca su nota media del primer trimestre: ");
		n1 = 9;
		System.out.println("Introduzca su nota media del segundo trimestre: ");
		n2 = 3;
		System.out.println("Introduzca su nota media del tercer trimestre: ");
		n3 = 4;
		nT = (int) (n1 + n2 + n3) / 3;
		notaTotalEX = (double) (n1 + n2 + n3) / 3;
		System.out.println(
				"Su nota media en el expediente es: " + notaTotalEX + "\nSu nota media total en el boletín es: " + nT);

	}

}
