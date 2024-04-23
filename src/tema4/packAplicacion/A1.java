package tema4.packAplicacion;

public class A1 {

	public static void main(String[] args) {
		// VARIABLES
		double radio = 3.5;

		// LLAMADA A LA FUNCIÓN
		System.out.println("La superficie de la esfera es: " + superficie(radio));
		System.out.println("El volumen de la esfera es: " + volumen(radio));

	}

	public static double superficie(double radio) {
		// VARIABLES
		double superficie;

		// EJECUCIÓN
		superficie = (Math.PI * 4) * Math.pow(radio, 2);

		return superficie;

	}

	public static double volumen(double radio) {
		// VARIABLES
		double volumen;

		// EJECUCIÓN
		volumen = ((Math.PI * 4) / 3) * Math.pow(radio, 3);

		return volumen;

	}

}
