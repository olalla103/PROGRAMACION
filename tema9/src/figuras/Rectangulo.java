package figuras;

public class Rectangulo extends FiguraGeometrica implements Imprimible, ComparaArea {
	Integer base, altura;

	public Rectangulo(Integer base, Integer altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public Double calcularArea() {
		Double area = (double) base * altura;
		return area;
	}

	@Override
	public void imprimir() {
		System.out.println("La base de su rectángulo es: " + base + " la altura de su rectángulo es: " + altura
				+ " por lo que el área de su rectángulo es igual a " + calcularArea());

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
