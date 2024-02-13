package app12;

public class EcuacionSegundoGrado {
	private double a, b, c, r1, r2;

	public EcuacionSegundoGrado(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Double Ecuacion() {
		// resultado con +
		r1 = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
		return r1;

	}

	public void positivoNegativo() {
		Double n;
		n = Ecuacion();
		if (n > 0) {
			// con el +
			setR1((-b + n) / (2 * a));

			// con el -
			setR2((-b - n) / (2 * a));

			System.out.println("El resultado 1 es: " + r1);
			System.out.println("El resultado 2 es: " + r2);

		} else {
			System.out.println("No se puede realizar la operación, la raíz es negativa.");
		}
	}

	// GETTERS Y SETTERS
	public double getR1() {
		return r1;
	}

	public void setR1(double r1) {
		this.r1 = r1;
	}

	public double getR2() {
		return r2;
	}

	public void setR2(double r2) {
		this.r2 = r2;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	// imprimimos clase
	@Override
	public String toString() {
		return "Las variables usadas para realizar la ecuación han sido:\na=" + a + "\nb=" + b + "\nc=" + c;
	}

}
