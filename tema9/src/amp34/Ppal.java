package amp34;

public class Ppal {
	public static void main(String[] args) {
		Baraja baraja1 = new Baraja();
		Carta c1 = new Carta();
		Carta c2 = new Carta();
		Carta c3 = new Carta();
		Carta c4 = new Carta();
		Carta c5 = new Carta();

		Baraja baraja2 = new Baraja();
		Carta c12 = new Carta();
		Carta c22 = new Carta();
		Carta c32 = new Carta();
		Carta c42 = new Carta();
		Carta c52 = new Carta();

		baraja1.aniadirCarta(c1);
		baraja1.aniadirCarta(c2);
		baraja1.aniadirCarta(c3);
		baraja1.aniadirCarta(c4);
		baraja1.aniadirCarta(c5);
		baraja2.aniadirCarta(c12);
		baraja2.aniadirCarta(c22);
		baraja2.aniadirCarta(c32);
		baraja2.aniadirCarta(c42);
		baraja2.aniadirCarta(c52);

		System.out.println(baraja1.toString());
		baraja1.ordena();
		System.out.println("\nbaraja1 ordenada por número:\n" + baraja1.toString());
		baraja1.ordenaPalo();
		System.out.println("\nbaraja1 ordenada por palo o número:\n" + baraja1.toString());

		System.out.println();

		System.out.println(baraja2.toString());
		baraja1.ordena();
		System.out.println("\nbaraja2 ordenada por número:\n" + baraja2.toString());
		baraja1.ordenaPalo();
		System.out.println("\nbaraja2 ordenada por palo o número:\n" + baraja2.toString());

	}
}
