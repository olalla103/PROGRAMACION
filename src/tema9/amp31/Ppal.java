package tema9.amp31;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Llamada l1 = new Llamada(false, "611486867", "661402901", "19-02-2024", "19:00:00", "19:15:00",
				Tarifas.SEVILLA);
		System.out.println("El coste de la llamada es: "+l1.costeLlamada(l1));

	}

}
