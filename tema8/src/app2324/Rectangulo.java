package app2324;

public class Rectangulo extends Poligono {
	public Rectangulo(Double base, Double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		Double a = super.base * super.altura;
		return a;
	}

}
