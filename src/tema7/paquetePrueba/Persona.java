package tema7.paquetePrueba;

public class Persona {
	String nombre;
	Integer edad;
	Double altura;

	public Persona(String nombre, Integer edad, Double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	public void nuevaAltura(Double altura) {
		this.altura = altura;
	}

	public void muestraInfo() {
		System.out.println("Su nombre es: " + nombre + "\nSu edad es: " + edad + "\nSu altura es: " + altura);
	}
}
