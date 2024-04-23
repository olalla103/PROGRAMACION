package tema5.packActsClase;

import java.util.Scanner;

public class OperacionesBasicas {

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
					tabla = insertarPpio(tabla, n, indicador);
					indicador++;
					muestraTabla(tabla, indicador);
					break;
				case 2:
					System.out.println("Introduzca el número que desea insertar:");
					n = sc.nextInt();
					tabla = insertarFinal(tabla, n, indicador);
					indicador++;
					muestraTabla(tabla, indicador);
					break;
				case 3:
					System.out.println("Introduzca el número que desea insertar:");
					n = sc.nextInt();
					System.out.println("Introduzca en qué posición desea insertarlo:");
					pos = sc.nextInt();
					tabla = insertarPos(tabla, n, pos, indicador);
					indicador++;
					muestraTabla(tabla, indicador);
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
					muestraTabla(tabla, indicador);
					break;
				case 2:
					tabla = eliminarFinal(tabla, indicador);
					indicador--;
					muestraTabla(tabla, indicador);
					break;
				case 3:
					System.out.println("Indique la posición que desea eliminar:");
					pos = sc.nextInt();
					tabla = eliminarPos(tabla, pos, indicador);
					indicador--;
					muestraTabla(tabla, indicador);
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
				muestraTabla(tabla, indicador);
				break;

			// ORDENAR TABLA
			case 5:
				tabla = ordenaBurbuja(tabla);
				muestraTabla(tabla, indicador);
				break;
			// BUSCAR ELEMENTO
			case 6:
				System.out.println("Introduzca el número que desea buscar en el vector:");
				n = sc.nextInt();
				busquedaNum(tabla, n, indicador);
				break;
			case 7:
				System.out.println("Con Dios.");
				break;

			}

		} while (op != 7);

		sc.close();

	}

	public static int[] insertarPpio(int[] tabla, int n, int indicador) {
		int[] aux = new int[tabla.length];
		if (indicador == 10) {
			System.out.println("No se pueden insertar más números, la tabla está completa.");
		}
		// muevo los números a la izquierda
		aux[0] = n;
		for (int i = 0; i < tabla.length - 1; i++) {
			aux[i + 1] = tabla[i];
		}
		indicador++;

		return aux;

	}

	public static int[] insertarFinal(int[] tabla, int n, int indicador) {
		if (indicador >= 10) {
			System.out.println("No se pueden insertar más números porque la tabla ya está completa.");
		} else {
			for (int i = 0; i < indicador; i++) {
				tabla[indicador] = n;
			}
		}
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

	public static int busquedaNum(int[] tabla, int n, int indicador) {
		int pos = 0;
		boolean flag = false;
		for (int i = 0; i < indicador || !flag; i++) {
			if (tabla[i] == n) {
				pos = i;
				flag = true;
			}
		}
		if (flag == true) {
			System.out.println("El número se encuentra en la posición: " + pos);
		} else {
			System.out.println("El número introducido no se encuentra en el vector.");
		}
		return pos;
	}

	public static int[] ordenaBurbuja(int[] tabla) {
		int i, j, aux;
		for (i = 0; i < tabla.length - 1; i++) {
			for (j = 0; j < tabla.length - i - 1; j++) {
				if (tabla[j + 1] < tabla[j]) {
					aux = tabla[j + 1];
					tabla[j + 1] = tabla[j];
					tabla[j] = aux;
				}
			}
		}
		return tabla;
	}

	public static void muestraTabla(int[] tabla, int indicador) {
		for (int i = 0; i < indicador; i++) {
			System.out.print(tabla[i] + " ");
		}
		System.out.println();
	}

}
