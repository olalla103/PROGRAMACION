package packResueltas;

public class R8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculadora(1, 10, 1);
	}

	public static void calculadora(int op, int n1, int n2) {
		switch (op) {
		case 1:
			System.out.println("Ha seleccionado suma.");
			System.out.println("La suma entre " + n1 + " + " + n2 + " es igual a: " + (n1 + n2));
			break;

		case 2:
			System.out.println("Ha seleccionado resta.");
			System.out.println("La resta entre " + n1 + " - " + n2 + " es igual a: " + (n1 - n2));
			break;

		case 3:
			System.out.println("Ha seleccionado multiplicación.");
			System.out.println("La multiplicacióin entre " + n1 + " * " + n2 + " es igual a: " + (n1 * n2));
			break;

		case 4:
			System.out.println("Ha seleccionado división.");
			System.out.println("La resta entre " + n1 + " / " + n2 + " es igual a: " + (n1 / n2));
			break;

		case 5:
			System.out.println("Ha seleccionado raíz cuadrada.");
			System.out.println("La raíz cuadrada de " + n1 + " es: " + (int) Math.sqrt(n1));
			break;
		}
	}
}
