package tema8.amp2527;

public class Punto3D extends Punto {

	public Punto3D(Double x, Double y, Double z) {
		super(x, y);
		this.z = z;
	}

	protected Double z;

	@Override
	public Double distancia(Punto otroPunto) {
		// TODO Auto-generated method stub
		return super.distancia(otroPunto);
	}

	// EQUALS
	public boolean equals(Punto3D otroPunto) {
		// TODO Auto-generated method stub
		if (this.getX() == otroPunto.getX() && this.getY() == otroPunto.getY() && this.getZ() == otroPunto.getZ()) {
			return true;
		} else {
			return false;
		}
	}

	// GETTERS AND SETTERS

	public Double getZ() {
		return z;
	}

	public void setZ(Double z) {
		this.z = z;
	}

}
