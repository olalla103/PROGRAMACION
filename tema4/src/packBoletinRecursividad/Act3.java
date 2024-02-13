package packBoletinRecursividad;

public class Act3 {
	/*
	 * 3. Algoritmo recursivo que reciba de un número entero positivo y muestre su
	 * tabla de multiplicar.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		tablaMultiplicar(n);

	}

	public static int tablaMultiplicar(int n) {
		int resultado = 0;
		if (n != 10) {
			resultado = n * tablaMultiplicar(n + 1);
			System.out.println(resultado);
		} else {
			resultado = 0;
		}
		return resultado;

	}
}
