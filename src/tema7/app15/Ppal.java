package tema7.app15;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendario hoy = new Calendario(6, 7, 2023);
		hoy.incrementarDia();
		hoy.incrementarMes();
		hoy.incrementarAnio(30);
		hoy.mostrar();
	}

}
