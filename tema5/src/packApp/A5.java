package packApp;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] alumnos = new int[3][5];
		int al;

		alumnos = rellena(alumnos);
		muestraTabla(alumnos);
		System.out.println("La media de la clase 1 es: " + mediaCurso(alumnos, 0) + "\nLa media de la clase 2 es: "
				+ mediaCurso(alumnos, 1) + "\nLa media de la clase 3 es: " + mediaCurso(alumnos, 2));

		System.out.println("Introduzca el alumno que desea revisar:");
		al = sc.nextInt();
		System.out.println("Su nota media es: " + mediaAlumno(alumnos, al));

		sc.close();

	}

	public static int[][] rellena(int[][] alumnos) {
		for (int i = 0; i < alumnos.length; i++) {
			for (int j = 0; j < alumnos[i].length; j++) {
				alumnos[i][j] = (int) (Math.random() * 10 - 1);
			}
		}
		return alumnos;
	}

	public static double mediaCurso(int[][] tabla, int curso) {
		int cont = 0;
		double media = 0;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				media += tabla[curso][j];
				cont++;
			}
		}
		media = media / cont;
		return media;
	}

	public static double mediaAlumno(int[][] tabla, int alumno) {
		int cont = 0;
		double media = 0;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[alumno].length; j++) {
				media += tabla[i][alumno];
				cont++;
			}
		}
		media = media / cont;
		return media;
	}

	public static void muestraTabla(int[][] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
	}
}
