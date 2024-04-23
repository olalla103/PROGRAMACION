package tema7.resuelta9;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bombilla b1 = new Bombilla(true);
		Bombilla b2 = new Bombilla(false);
		Bombilla b3 = new Bombilla(true);
		b1.eniendeGeneral();
		b2.enciendeIndividual(false);
		b3.apagaGeneral();

	}

}
