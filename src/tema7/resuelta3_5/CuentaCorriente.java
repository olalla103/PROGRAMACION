package tema7.resuelta3_5;

public class CuentaCorriente {
	static private String nombreBanco = "Santander";
	String dni, nombreTitular;
	Double saldo;
	Gestor gestor = new Gestor();

	// Constructores
	public CuentaCorriente() {

	}

	public CuentaCorriente(String dni, String nombreTitular, Double saldo, Gestor gestor) {
		super();
		this.dni = dni;
		this.nombreTitular = nombreTitular;
		this.saldo = saldo;
		this.gestor = gestor;
	}

	public CuentaCorriente(String dni, Double saldo) {
		this.dni = dni;
		this.saldo = saldo;
	}

	public CuentaCorriente(String dni, String nombreTitular) {
		this.dni = dni;
		this.nombreTitular = nombreTitular;
		saldo = 0.0;
	}

	public CuentaCorriente(String dni, String nombreTitular, Double saldo) {
		this.dni = dni;
		this.nombreTitular = nombreTitular;
		this.saldo = saldo;
	}

	// Métodos
	public void sacarDinero(Double dineroMenos) {
		if (dineroMenos > this.gestor.importeMax) {
			System.out.println("No puede realizar esa operación.\nSu gestor no maneja esa cantidad de dinero.");
		} else {
			if (dineroMenos > saldo) {
				System.out.println("Ha sacado un total de " + saldo + " porque no tiene más dinero en la cuenta.");
				saldo = 0.0;
				saldoActual();
			} else if (saldo <= 0) {
				System.out.println("No puede sacar dinero, no tiene.");
				saldoActual();
			} else {
				saldo = saldo - dineroMenos;
				System.out.println("La operación se ha realizado correctamente.");
				saldoActual();
			}
		}
	}

	public void ingresar(Double dinero) {
		if (dinero > this.gestor.importeMax) {
			System.out.println("No puede realizar esa operación.\nSu gestor no maneja esa cantidad de dinero.");
		} else {
			saldo += dinero;
			saldoActual();
		}
	}

	public void infoCuenta() {
		System.out.println("El titular de la cuenta es: " + nombreTitular + "\n");
		saldoActual();
	}

	public void saldoActual() {
		System.out.println("Su saldo actual es: " + saldo);
	}

	public static String getNombreBanco() {
		return nombreBanco;
	}

	public static void setNombreBanco(String nombreBanco) {
		CuentaCorriente.nombreBanco = nombreBanco;
	}

	// To String
	@Override
	public String toString() {
		return "Cuenta corriente\nBanco: " + CuentaCorriente.nombreBanco + "\nDNI: " + dni + "\nNombre titular: "
				+ nombreTitular + "\nSaldo: " + saldo + " euros\n\nGestor" + gestor;
	}

}
