package tema9.amp34;


public class Carta implements Comparable<Object> {
	Palo[] palo = { Palo.ORO, Palo.COPAS, Palo.BASTOS, Palo.ESPADAS };
	Integer numero;
	Palo elegido;

	public Carta() {
		Integer elige = (int) (Math.random() * palo.length - 1 + 1);
		this.numero = (int) (Math.random() * 12 + 1);
		this.elegido = palo[elige];
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.numero.compareTo(((Carta) o).numero);

	}

	@Override
	public String toString() {
		return "Carta  numero=" + numero + ", elegido=" + elegido + "]\n";
	}

}


