package packBoletin;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		System.out.println("Tabla número:");
		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random() * (100 - 0 + 1) + 0);
			System.out.print(numero[i] + " ");
		}
		System.out.println("\nTabla cuadrado:");
		for (int i = 0; i < numero.length; i++) {
			cuadrado[i] = (int) (Math.pow(numero[i], 2));
			System.out.print(cuadrado[i] + " ");
		}
		System.out.println("\nTabla cubo:");
		for (int i = 0; i < numero.length; i++) {
			cubo[i] = (int) (Math.pow(numero[i], 3));
			System.out.print(cubo[i] + " ");
		}

	}

}
