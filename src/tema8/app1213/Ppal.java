package tema8.app1213;


public class Ppal {

	public static void main(String[] args) {
		// APLICACIÓN 12
		System.out.println("Actividad de aplicación 12:");
		String etiqueta = "Hola qué tal";
		Caja caja1 = new Caja(10, 20, 30, Caja.Unidad.CENTIMETROS);
		caja1.setEtiqueta(etiqueta);
		System.out.println(caja1.toString());

		System.out.println("\nActividad de aplicación 13: ");
		// APLICACIÓN 13
		CajaCarton carton = new CajaCarton(10, 20, 10);
		etiqueta = "Caja de cartón.";
		carton.setEtiqueta(etiqueta);
		System.out.println(carton.toString());

	}

}
