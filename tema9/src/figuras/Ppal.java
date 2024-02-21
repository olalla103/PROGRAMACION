package figuras;

public class Ppal {
	public static void main(String[] args) {
		Circulo circulo = new Circulo(2.5);
		Rectangulo rectangulo = new Rectangulo(12, 5);
		Triangulo triangulo = new Triangulo(8.0, 10.0);

		circulo.imprimir();
		rectangulo.imprimir();
		triangulo.imprimir();

		System.out.println(circulo.comparArea(circulo, rectangulo));
	}

}
