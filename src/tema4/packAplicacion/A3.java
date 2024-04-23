package tema4.packAplicacion;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		muestraPares(n);

	}

	public static void muestraPares(int n) {
		int cont = 0, i = 0;

		while (i < n) {
			if (cont % 2 == 0) {
				System.out.println(cont);
				i++;
			}
			cont++;
		}

	}

}
