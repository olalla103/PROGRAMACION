package tema9.amp28;

import java.util.Arrays;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jornada[] jornada = new Jornada[4];
		OrdenaFechas fechasOdFechas = new OrdenaFechas();
		OrdenaMinutos minutosOdMinutos = new OrdenaMinutos();
		Jornada t1 = new Jornada("20-02-2024", "08:15", "14:45", "78104491X");
		Jornada t2 = new Jornada("10-01-2024", "10:00", "16:00", "78104492B");
		Jornada t3 = new Jornada("17-02-2024", "10:30", "23:30", "78104491X");
		Jornada t4 = new Jornada("01-02-2024", "07:25", "14:45", "78104493S");

		jornada[0] = t1;
		jornada[1] = t2;
		jornada[2] = t4;
		jornada[3] = t3;

		System.out.println("Sin ordenar:\n" + Arrays.toString(jornada));
		Arrays.sort(jornada);
		System.out.println("\nOrden natural:\n" + Arrays.toString(jornada));
		Arrays.sort(jornada, fechasOdFechas);
		System.out.println("\nOrden natural:\n" + Arrays.toString(jornada));
		Arrays.sort(jornada, minutosOdMinutos);
		System.out.println("\nOrden minutos:\n" + Arrays.toString(jornada));

	}

}
