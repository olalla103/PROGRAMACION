package tema8.app14151617181920;

public class Cola extends Lista {

	public void encolar(Integer n) {
		super.aniadir(n);
	}

	public void desencolar() {
		super.eliminar();
	}

	@Override
	public boolean equals(Lista otraLista) {
		return super.equals(otraLista);
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
