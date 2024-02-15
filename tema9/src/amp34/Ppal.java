package amp34;

public class Ppal {
	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		Carta c1 = new Carta();
		Carta c2 = new Carta();
		Carta c3 = new Carta();
		Carta c4 = new Carta();
		Carta c5 = new Carta();

		baraja.aniadirCarta(c1);
		baraja.aniadirCarta(c2);
		baraja.aniadirCarta(c3);
		baraja.aniadirCarta(c4);
		baraja.aniadirCarta(c5);

		System.out.println(baraja.toString());
		baraja.ordena();
		System.out.println("\nBaraja ordenada por número:\n" + baraja.toString());
		baraja.ordenaPalo();
		System.out.println("\nBaraja ordenada por palo o número:\n" + baraja.toString());

	}
}
