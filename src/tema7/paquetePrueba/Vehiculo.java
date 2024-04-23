package tema7.paquetePrueba;

public class Vehiculo {
	String matricula, modelo, marca, color;

	public Vehiculo(String mat, String mod, String marca, String color) {
		this.matricula = mat;
		this.modelo = mod;
		this.marca = marca;
		this.color = color;
	}

	public void pintar(String color) {
		this.color = color;
	}

	public void muestrAtributos() {
		System.out.println("El modelo de su coche es " + modelo + "\nLa matrícula de su coche es " + matricula
				+ "\nLa marca de su coche es " + marca + "\nEl color de su coche es " + color);
	}

}
