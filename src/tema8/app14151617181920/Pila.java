package tema8.app14151617181920;

public class Pila extends Lista {
	private Integer[] pililla = new Integer[0];

	public void empilar(Integer n) {
		super.aniadir(n);
	}

	public void desmpilar() {
		super.eliminar();
	}

	@Override
	public boolean equals(Lista otraLista) {
		// TODO Auto-generated method stub
		return super.equals(otraLista);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	// GETTERS AND SETTERS
	public Integer[] getPililla() {
		return pililla;
	}

	public void setPililla(Integer[] pililla) {
		this.pililla = pililla;
	}

}
