package tema7.app16;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto punto = new Punto(1.0, 10.0);
		Punto punto2 = new Punto(-6.0, -3.0);
		punto.desplazaX(30.0);
		punto.muestra();
		System.out.println();
		punto.desplazaY(5.0);
		punto.muestra();
		System.out.println();
		punto.desplaza(-30.0, -2.0);
		punto.muestra();
		System.out.println();
		punto.distanciaEuclidea(punto2);

	}

}
