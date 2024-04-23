package tema6.packAplicacion;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] tablero = new int[3][3];
		int f1, c1, cont = 0;
		boolean flag = false;

		comienzo(tablero);
		muestraTabla(tablero);
		do {

			System.out.println();
			rellenaCasillaOrdenador(tablero);
			cont++;
			muestraTabla(tablero);
			if (compruebaGanador(tablero, cont) > -1 || cont == 9) {
				flag = true;
			} else {
				System.out.println("Introduzca donde quiere introducir la fila de la ficha:");
				f1 = sc.nextInt();
				System.out.println("Introduzca donde quiere introducir la ficha:");
				c1 = sc.nextInt();
				while (rellenaCasillaJugador(tablero, f1, c1) == false) {
					System.out.println("Introduzca la fila:");
					f1 = sc.nextInt();
					System.out.println("Introduzca la columna:");
					c1 = sc.nextInt();
				}
				cont++;
				muestraTabla(tablero);
			}
			if (compruebaGanador(tablero, cont) > -1 || cont == 9) {
				flag = true;
			}
		} while (flag != true);
		System.out.println();
		muestraTabla(tablero);
		ganador(tablero, cont);

		sc.close();

	}

	public static void comienzo(int[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = -1;
			}
		}
	}

	public static boolean rellenaCasillaJugador(int[][] tablero, int fila, int columna) {
		if (tablero[fila][columna] < 0) {
			tablero[fila][columna] = 1;
			return true;
		} else {
			System.out.println("Esa casilla está ocupada, introduzca una casilla válida.");
			return false;
		}
	}

	public static void rellenaCasillaOrdenador(int[][] tablero) {
		int fila = (int) (Math.random() * (2 - 0 + 1) + 0);
		int columna = (int) (Math.random() * (2 - 0 + 1) + 0);
		boolean flag = false;

		if (tablero[fila][columna] > -1) { // si está rellena la casilla, se hace un while, hasta que la podamos
											// rellenar
			while (flag != true) {
				fila = (int) (Math.random() * (2 - 0 + 1) + 0);
				columna = (int) (Math.random() * (2 - 0 + 1) + 0);
				if (tablero[fila][columna] < 0) {
					flag = true;
				}
			}
		}
		tablero[fila][columna] = 0;
	}

	public static void muestraTabla(int[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] == 0) {
					System.out.print("|O ");
				} else if (tablero[i][j] == 1) {
					System.out.print("|X ");
				} else {
					System.out.print("|  ");
				}
			}
			System.out.println("\n---------");
		}
	}

	public static int compruebaGanador(int[][] tablero, int cont) {
		int gana = -1;
		for (int i = 0; i < tablero.length; i++) {
			// comprueba filas
			if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
				if (tablero[i][0] > -1) {
					gana = tablero[i][0];
					return gana;
				}
			}

			// comprueba columnas
			if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) {
				if (tablero[0][i] > -1) {
					gana = tablero[0][i];
					return gana;
				}
			}
		} // con el for me ahorro 4 if, se optimiza más.

		// comprueba diagonales
		if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
			if (tablero[0][0] > -1) {
				gana = tablero[0][0];
				return gana;
			}
		}

		if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
			if (tablero[0][2] > -1) {
				gana = tablero[0][2];
				return gana;
			}
		}
		return gana;
	}

	public static void ganador(int[][] tablero, int cont) {
		int gana = compruebaGanador(tablero, cont);
		if (gana == -1) {
			System.out.println("La partida se ha acabado, no hay ningún ganador.");
		} else if (gana == 0) {
			System.out.println("El ganador es el ordenador.");
		} else if (gana == 1) {
			System.out.println("Ha ganado!!");
		}
	}

}
