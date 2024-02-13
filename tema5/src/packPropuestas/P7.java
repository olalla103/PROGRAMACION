package packPropuestas;

import java.util.Arrays;
import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cant, a = 0, suma = 0, media;
		int[] nFav;

		System.out.println("Cuántos números favoritos tienes?");
		cant = sc.nextInt();

		nFav = new int[cant];
		for (int i = 0; i < cant; i++) {
			System.out.println("Introduzca su número favorito:");
			nFav[i] = sc.nextInt();

		}

		for (int i = 0; i < 2; i++) {
			a = favorito(nFav);
			suma += a;
			elimina(nFav, a);
		}
		media = suma / 2;
		System.out.println(media);

		sc.close();

	}

	public static int favorito(int[] nFav) {
		int a;

		a = (int) (Math.random() * nFav.length - 1);

		return a;

	}

	public static void elimina(int[] tabla, int a) {
		System.arraycopy(tabla, a + 1, tabla, a, tabla.length - a - 1);
		tabla = Arrays.copyOf(tabla, tabla.length - 1);
	}
}
