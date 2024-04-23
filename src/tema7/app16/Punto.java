package tema7.app16;

public class Punto {
	private double x, y;

	// CONSTRUCTORES
	public Punto() {
	}

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// MÉTODOS PRA DESPLAZAR
	public void desplazaX(double dx) {
		x += dx;
	}

	public void desplazaY(double dy) {
		y += dy;
	}

	public void desplaza(double dx, double dy) {
		x += dx;
		y += dy;
	}

	public double distanciaEuclidea(Punto otro) {
		double distancia;
		// d = √((x2 - x1)² + (y2 - y1)²)
		distancia = Math.sqrt(Math.pow(otro.x - x, 2) + Math.pow(otro.y - y, 2));
		System.out.println("La distancia euclidea es: " + distancia);
		return distancia;
	}

	public void muestra() {
		System.out.println("Punto X: " + x + "\nPunto Y: " + y);
	}

	// GETTERS AND SETTERS
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
