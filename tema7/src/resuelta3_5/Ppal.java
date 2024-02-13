package resuelta3_5;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente c1 = new CuentaCorriente("78104491X", "Olalla", 400.0, new Gestor("Iñigo", "111222333", 500.0));
		System.out.println(c1.toString());
		c1.sacarDinero(1000.0);
	}

}
