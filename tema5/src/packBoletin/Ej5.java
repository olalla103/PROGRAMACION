package packBoletin;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = new int[20];
		int[] pares;
		int[] impares;

		// rellenamos tabla de números aleatorios
		rellenaTabla(tabla);

		// ponemos longitud y rellenamos la tabla pares
		pares = new int[longitudPares(tabla)];
		rellenaPares(tabla, pares);
		System.out.println("Tabla números pares");
		muestraTabla(pares, longitudPares(tabla));

		// ponemos longitud y rellenamos la tabla impares
		impares = new int[longitudImpares(tabla)];
		rellenaImpares(tabla, impares);
		System.out.println("\nTabla números impares");
		muestraTabla(impares, longitudImpares(tabla));

		// rellenamos tabla original en orden de pares a impares
		// rellenamos con pares
		for (int i = 0; i < pares.length; i++) {
			tabla[i] = pares[i];
		}
		int k = pares.length;
		// rellenamos con impares
		for (int i = 0; i < impares.length; i++, k++) {
			tabla[k] = impares[i];
		}

		System.out.println("\nTabla ordenada de pares a impares");
		muestraTabla(tabla, tabla.length);

	}

	public static void rellenaTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * (100 - 0 + 1) + 0);
		}
	}

	public static void muestraTabla(int[] tabla, int indicador) {
		for (int i = 0; i < indicador; i++) {
			System.out.print(tabla[i] + " ");
		}
	}

	public static int longitudPares(int[] tabla) {
		int cont = 0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] % 2 == 0) {
				cont++;
			}
		}
		return cont;
	}

	public static void rellenaPares(int[] tabla, int[] pares) {
		int cont = 0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] % 2 == 0) {
				if (cont == 0) {
					pares[0] = tabla[i];
				} else {
					pares[cont] = tabla[i];
				}
				cont++;
			}
		}
	}

	public static int longitudImpares(int[] tabla) {
		int cont = 0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] % 2 != 0) {
				cont++;
			}
		}
		return cont;
	}

	public static void rellenaImpares(int[] tabla, int[] impares) {
		int cont = 0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] % 2 != 0) {
				if (cont == 0) {
					impares[0] = tabla[i];
				} else {
					impares[cont] = tabla[i];
				}
				cont++;
			}
		}
	}

}
