package packActsMoodle;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, max = 99, min = 200;
		double media = 0;
		for (int i = 0; i < 50; i++) {
			n = (int) (Math.random() * (199 - 100 + 1) + 100);
			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}

			System.out.println(n + " ");
			media += n;
		}
		System.out.println("El mínimo es: " + min + "\nEl máximo es: " + max + "\nLa media es: " + media / 50);

	}

}
