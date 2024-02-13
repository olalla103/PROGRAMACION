package packActsClase;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] tabla = new int[10];
		int op = 0, n, pos, indicador = 0;

		System.out.println(
				"Contamos con un vector con 10 posiciones, tomaremos como que las posiciones que tengan 0 están vacías.\n");
		do {
			System.out.println(
					"Introduzca qué desea realizar:\n1.Insertar\n2.Eliminar\n3.Modificar la tabla\n4.Listar\n5.Ordenar\n6.Buscar\n7.Salir");
			op = sc.nextInt();
			System.out.println();
			switch (op) {
			case 1:
				System.out.println(
						"Introduzca qué desea realizar:\n 1.Insertar al principio\n 2.Insertar al final\n 3.Insertar en una posición");
				op = sc.nextInt();
				switch (op) {
				// OPCIONES INSERTAR
				case 1:
					System.out.println("Introduzca el número que desea insertar:");
					n = sc.nextInt();
					tabla = insertarPpio(tabla, n);
					indicador++;
					muestraTabla(tabla);
					break;
				case 2:
					System.out.println("Introduzca el número que desea insertar:");
					n = sc.nextInt();
					tabla = insertarFinal(tabla, n);
					indicador++;
					muestraTabla(tabla);
					break;
				case 3:
					System.out.println("Introduzca el número que desea insertar:");
					n = sc.nextInt();
					System.out.println("Introduzca en qué posición desea insertarlo:");
					pos = sc.nextInt();
					tabla = insertarPos(tabla, n, pos, indicador);
					indicador++;
					muestraTabla(tabla);
					break;
				}
				break;

			// OPCIONES ELIMINAR
			case 2:
				System.out.println(
						"Introduzca qué desea realizar:\n 1.Eliminar por el principio\n 2.Eliminar por el final\n 3.Eliminar una posición concreta");
				op = sc.nextInt();
				switch (op) {
				case 1:
					tabla = eliminarPpio(tabla, indicador);
					indicador--;
					muestraTabla(tabla);
					break;
				case 2:
					tabla = eliminarFinal(tabla, indicador);
					indicador--;
					muestraTabla(tabla);
					break;
				case 3:
					System.out.println("Indique la posición que desea eliminar:");
					pos = sc.nextInt();
					tabla = eliminarPos(tabla, pos, indicador);
					indicador--;
					muestraTabla(tabla);
					break;
				}
				break;

			// MODIFICAR TABLA
			case 3:
				System.out
						.println("Introduzca qué posición desea modificar:\nRecuerda que las posiciones van de 0 a 9.");
				pos = sc.nextInt();
				System.out.println("Introduzca qué número desea introducir:");
				n = sc.nextInt();
				tabla = modificarTabla(tabla, pos, indicador, n);
				break;

			// LISTAR TABLA
			case 4:
				muestraTabla(tabla);
				break;

			// ORDENAR TABLA
			case 5:
				tabla = ordenaTabla(tabla);
				muestraTabla(tabla);
				break;
			// BUSCAR ELEMENTO
			case 6:
				int pos2;
				System.out.println("Introduzca el número que desea buscar en el vector:");
				n = sc.nextInt();
				pos2 = busquedaNum(tabla, n);
				if (pos2 < 0) {
					System.out.println("El número no se encuentra en la tabla.");
				} else {
					System.out.println("El número está en la posición " + pos2);
				}

				break;
			case 7:
				System.out.println("Con Dios.");
				break;

			}

		} while (op != 7);

		sc.close();

	}

	public static int[] insertarPpio(int[] tabla, int n) {

		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		for (int i = tabla.length; i < 0; i--) {
			tabla[i + 1] = tabla[i];
		}
		tabla[0] = n;
		return tabla;

	}

	public static int[] insertarFinal(int[] tabla, int n) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = n;
		return tabla;
	}

	public static int[] insertarPos(int[] tabla, int n, int pos, int indicador) {
		int[] aux = new int[tabla.length];
		if (indicador == 10) {
			System.out.println("No se pueden insertar más números, la tabla está completa.");
		}
		// muevo los números a la izquierda
		aux[pos] = n;
		for (int i = pos; i < tabla.length - 1; i++) {
			aux[i + 1] = tabla[i];
		}
		indicador++;

		return aux;
	}

	public static int[] eliminarFinal(int[] tabla, int indicador) {
		if (indicador == 0) {
			System.out.println("El vector está vacío, no puede eliminar nada.");
		} else {
			tabla[tabla.length - 1] = 0;
		}
		return tabla;

	}

	public static int[] eliminarPpio(int[] tabla, int indicador) {
		int[] aux = new int[tabla.length];
		if (indicador == 0) {
			System.out.println("El vector está vacío, no puede eliminar nada.");
		}
		for (int i = 0; i < tabla.length - 1; i++) {
			aux[i] = tabla[i + 1];
		}
		return aux;

	}

	public static int[] eliminarPos(int[] tabla, int pos, int indicador) {
		int[] aux = new int[tabla.length];
		if (indicador == 0) {
			System.out.println("El vector está vacío, no puede eliminar nada.");
		} else {
			// primero rellenamos el vector aux
			for (int i = 0; i < tabla.length; i++) {
				aux[i] = tabla[i];
			}
			// ahora eliminamos
			for (int i = pos; i < tabla.length - 1; i++) {
				aux[i] = tabla[i + 1];
			}
		}
		return aux;

	}

	public static int[] modificarTabla(int[] tabla, int pos, int indicador, int n) {
		if (indicador == 0) {
			System.out.println("El vector está vacío, no puede modificar nada.");
		} else {
			tabla[pos] = n;
		}
		return tabla;

	}

	public static int busquedaNum(int[] tabla, int n) {
		int pos = -1;
		Arrays.sort(tabla);
		pos = Arrays.binarySearch(tabla, n);

		return pos;
	}

	public static int[] ordenaTabla(int[] tabla) {
		Arrays.sort(tabla);
		return tabla;
	}

	public static void muestraTabla(int[] tabla) {
		System.out.println(Arrays.toString(tabla));
	}

}
