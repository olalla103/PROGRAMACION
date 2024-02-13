package packActsMoodle;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d1, d2;
		do {
			System.out.println("Tirada de dados:");
			d1 = (int) (Math.random() * 10 + 1);
			d2 = (int) (Math.random() * 10 + 1);
			System.out.println("Dado 1: " + d1 + " " + "\nDado 2: " + d2);

		} while (d1 != d2);
		System.out.println("Ambos dados son iguales.");

	}

}
