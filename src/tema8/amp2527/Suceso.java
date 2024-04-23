package tema8.amp2527;

public class Suceso extends Punto3D {
	Integer tiempo;
	String descripcion;

	public Suceso(Double x, Double y, Double z, Integer tiempo, String descripcion) {
		super(x, y, z);
		this.tiempo = tiempo;
		this.descripcion = descripcion;
	}

	public boolean equals(Suceso otroSuceso) {
		if (this.x == otroSuceso.x && this.y == otroSuceso.y && this.z == otroSuceso.z
				&& this.tiempo == otroSuceso.tiempo && this.descripcion == otroSuceso.descripcion) {
			return true;
		} else {
			return false;
		}
	}

}
