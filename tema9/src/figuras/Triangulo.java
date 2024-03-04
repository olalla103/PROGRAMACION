package figuras;

public class Triangulo extends FiguraGeometrica implements Imprimible, ComparaArea {
	Double base, altura;

	public Triangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public Double calcularArea() {
		Double area;
		area = base * (altura / 2);
		return area;
	}

	@Override
	public void imprimir() {
		System.out.println("La base de su triángulo es: " + base + " la altura de su triángulo es: " + altura
				+ " por lo que el área de su triángulo es igual a " + calcularArea());

	}

	@Override
	public Integer comparArea(FiguraGeometrica f1, FiguraGeometrica f2) {
		// TODO Auto-generated method stub
		return (int) (f1.calcularArea() - f2.calcularArea());

	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;

	}

}
