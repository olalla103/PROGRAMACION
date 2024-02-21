package figuras;

public class Circulo extends FiguraGeometrica {
	Double radio;
	

	public Circulo(Double radio) {
		this.radio = radio;
	}

	@Override
	public Double calcularArea() {
		Double area;
		area = Math.pow(radio, 2) * Math.PI;
		return area;

	}

	@Override
	public void imprimir() {
		System.out.println("El radio de su círculo es: " + radio + " por lo que el área de su círculo es igual a "
				+ calcularArea());

	}

	@Override
	public Integer comparArea(FiguraGeometrica f1, FiguraGeometrica f2) {
		// TODO Auto-generated method stub
		return (int) (f1.calcularArea() - f2.calcularArea());

	}

}
