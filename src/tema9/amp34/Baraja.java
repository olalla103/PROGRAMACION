package tema9.amp34;

import java.util.Arrays;

public class Baraja {
	Carta barajaCartas[] = new Carta[0];
	ComparaPalo cP = new ComparaPalo();

	public void aniadirCarta(Carta carta) {
		barajaCartas = Arrays.copyOf(barajaCartas, barajaCartas.length + 1);
		barajaCartas[barajaCartas.length - 1] = carta;

	}

	public void ordena() {
		Arrays.sort(barajaCartas);
	}

	public void ordenaPalo() {
		Arrays.sort(barajaCartas, cP);
	}

	@Override
	public String toString() {
		return "Baraja [barajaCartas=" + Arrays.toString(barajaCartas) + "]";
	}

}
