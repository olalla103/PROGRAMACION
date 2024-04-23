package tema8.app2324;

public abstract class Poligono {
	protected Double base, altura, a;

	public Poligono(Double base, Double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public abstract double area();
}
