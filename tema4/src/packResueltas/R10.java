package packResueltas;

public class R10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 2, exponente = 8;

		System.out.println(elevadoIt(base, exponente));
		System.out.println(elevadoRe(base, exponente));

	}

	public static int elevadoIt(int base, int exponente) {
		int resultado = 0;

		for (int i = 1; i <= exponente; i++) {
			if (i == 0) {
				resultado = 1;
			} else if (i == 1) {
				resultado = base;
			} else {
				resultado *= base;
			}
		}
		return resultado;

	}

	public static int elevadoRe(int base, int exponente) {
		int resultado;

		if (exponente == 0) {
			resultado = 1;
		} else {
			resultado = base * elevadoRe(base, exponente - 1);
		}
		return resultado;

	}

}
