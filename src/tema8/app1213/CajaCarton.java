package tema8.app1213;

public class CajaCarton extends Caja {

	protected Double areaCarton;

	public CajaCarton() {
		super();

	}

	public CajaCarton(Integer alto, Integer ancho, Integer fondo) {
		super(alto, ancho, fondo, Unidad.CENTIMETROS);

	}

	@Override
	public double getVolumen() {
		return super.getVolumen() * 0.8;
	}

	public Integer getArea() {
		Integer area = 2 * fondo * ancho + 2 * fondo * alto + 2 * alto * ancho;
		return area;
	}

	@Override
	public void setEtiqueta(String etiqueta) {

		super.setEtiqueta(etiqueta);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
