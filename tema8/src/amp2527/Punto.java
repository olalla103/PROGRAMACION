package amp2527;

public class Punto {
	protected Double x, y;

	public Punto(Double x, Double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Double distancia(Punto otroPunto) {
		return Math.sqrt(Math.pow((otroPunto.x - this.x), 2) + Math.pow(otroPunto.y - this.y, 2));
	}

	public boolean equals(Punto otroPunto) {
		if (this.x == otroPunto.x && this.y == otroPunto.y) {
			return true;
		} else {
			return false;
		}
	}

	// GETTERS AND SETTERS
	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}
	
	
}
