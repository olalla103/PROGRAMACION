package tema4.packResueltas;

public class R11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = 25;
		System.out.println(mcd(a, b));

	}

	public static int mcd(int a, int b) {
		int resultado;

		if (a == 0) {
			resultado = b;
		} else if (b == 0) {
			resultado = a;
		} else {
			int min = a <= b ? a : b;
			int max = a <= b ? b : a;
			resultado = mcd(min, max - min);
		}
		return resultado;
	}
}
