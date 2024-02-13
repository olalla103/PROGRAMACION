package paquetePrueba;

public class Ppal {

	public static void main(String[] args) {
		// Clase Vehiculo
		String matricula = "71234 XBV", modelo = "Corsa", marca = "Opel", color = "Dorado";
		Vehiculo coche = new Vehiculo(matricula, modelo, marca, color);
		coche.muestrAtributos();
		color = "Verde";
		coche.pintar(color);
		System.out.println();
		coche.muestrAtributos();
		System.out.println();

		// Clase Persona
		String nombre = "Olalla";
		Integer edad = 19;
		Double altura = 1.43;
		Persona p1 = new Persona(nombre, edad, altura);
		p1.muestraInfo();
		System.out.println();
		p1.nuevaAltura(1.73);
		p1.muestraInfo();

	}

}
