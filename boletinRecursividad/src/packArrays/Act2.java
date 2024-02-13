package packArrays;

public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = 3, cont = 0, resultado = 0;
		multiplicacion(a, b, cont, resultado);

	}

	public static void multiplicacion(int a, int b, int cont, int resultado) {
		if (cont == b) {
			System.out.println(resultado);
		} else {
			resultado += a;
			cont++;
			multiplicacion(a, b, cont, resultado);
		}
	}

}
