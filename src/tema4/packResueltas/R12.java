package tema4.packResueltas;

public class R12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		System.out.println(fibo(n));

	}

	public static int fibo(int n) {
		int resultado;
		if (n == 0 || n == 1) {
			resultado = 1;
		} else {
			resultado = fibo(n - 1) + fibo(n - 2);
		}
		return resultado;

	}

}
