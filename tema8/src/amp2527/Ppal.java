package amp2527;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto a = new Punto(5.0, 6.0);
		Punto b = new Punto(8.0, 10.0);
		System.out.println(a.distancia(b));

		Punto3D d = new Punto3D(5.0, 4.0, 6.0);
		Punto3D e = new Punto3D(5.0, 4.0, 6.0);
		System.out.println(d.equals(e));

		// amp 28
		Suceso s=new Suceso(5.0, 4.0, 6.0, 10, "si");
		Suceso z=new Suceso(5.0, 4.0, 6.0, 10, "si");
		System.out.println(s.equals(z));
	}

}
