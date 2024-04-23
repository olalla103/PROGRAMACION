package tema7.resuelta1_2;

public class CuentaCorriente {
	String dni, nombreTitular;
	Double saldo;

	public CuentaCorriente() {

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

	public void sacarDinero(Double dineroMenos) {
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

	public void ingresar(Double dinero) {
		saldo += dinero;
		saldoActual();
	}

	public void infoCuenta() {
		System.out.println("El titular de la cuenta es: " + nombreTitular + "\n");
		saldoActual();
	}

	public void saldoActual() {
		System.out.println("Su saldo actual es: " + saldo);
	}

}
