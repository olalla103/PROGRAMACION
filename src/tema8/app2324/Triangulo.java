package tema8.app2324;

public class Triangulo extends Poligono {

	public Triangulo(Double base, Double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		Double a = 0.5 * super.base * super.altura;

		return a;
	}

}
