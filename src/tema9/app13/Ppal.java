package tema9.app13;

import java.util.Arrays;

public class Ppal {
	public static void main(String[] args) {
		Futbolista[] jugadores = new Futbolista[4];
		ComparaEdadNombres comparaEdadNombres = new ComparaEdadNombres();

		Futbolista inigo = new Futbolista("78104492B", "Inigo", 18, 3);
		Futbolista paola = new Futbolista("11111111R", "Paola", 18, 5);
		Futbolista berta = new Futbolista("11111111A", "Berta", 16, 4);
		Futbolista cuchara = new Futbolista("22222222B", "Cuchara", 21, 8);

		jugadores[0] = inigo;
		jugadores[1] = cuchara;
		jugadores[2] = berta;
		jugadores[3] = paola;

		System.out.println("Listado sin ordenar: \n" + Arrays.toString(jugadores));
		Arrays.sort(jugadores);
		System.out.println("\nListado ordenado (sort): \n" + Arrays.toString(jugadores));
		Arrays.sort(jugadores, comparaEdadNombres);
		System.out.println("\nListado ordenado por nombre y edad (comparator): \n" + Arrays.toString(jugadores));

	}
}
