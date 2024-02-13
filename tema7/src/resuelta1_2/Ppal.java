package resuelta1_2;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente c1 = new CuentaCorriente("78104491X", "Olalla", 300.0);
		c1.sacarDinero(400.0);
		c1.ingresar(450.0);
		c1.infoCuenta();

		CuentaCorriente c2 = new CuentaCorriente("78104492B", 800.0);
		c2.infoCuenta();

	}

}
