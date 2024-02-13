package resuelta7;

import java.time.LocalDateTime;

public class Texto {
	private final int LONGITUD;
	private String txt;
	LocalDateTime ultimaMod;

	public Texto(String txt, Integer LONGITUD) {
		this.txt = txt;
		this.LONGITUD = LONGITUD;
	}

	public boolean compruebaLONGITUD() {
		if (txt.length() < LONGITUD) {
			return true;
		} else {
			return false;
		}
	}

	public void ultimaModificacion() {
		System.out.println("\nÚltima modificación: " + LocalDateTime.now());
	}

	public void insertarPpio(String cadena) {
		if (txt.length() + cadena.length() <= LONGITUD) {
			txt = cadena + " " + txt;
			System.out.println(txt);
			ultimaModificacion();

		} else {
			System.out.println("Ya ha llegado a la LONGITUD máxima.");

		}
	}


	public void insertarFinal(String cadena) {
		if (txt.length() + cadena.length() <= LONGITUD) {
			txt = txt + " " + cadena;
			System.out.println(txt);
			ultimaModificacion();

		} else {
			System.out.println("No puede insertar esa cadena, es demasiado larga.");

		}
	}

	public void cuentaVocales() {
		Integer cont = 0;
		for (int i = 0; i < txt.length(); i++) {
			if (txt.charAt(i) == 'a' || txt.charAt(i) == 'e' || txt.charAt(i) == 'i' || txt.charAt(i) == 'o'
					|| txt.charAt(i) == 'u' || txt.charAt(i) == 'A' || txt.charAt(i) == 'E' || txt.charAt(i) == 'I'
					|| txt.charAt(i) == 'O' || txt.charAt(i) == 'U') {
				cont++;
			}
		}
		System.out.println("Hay un total de " + cont + " vocales.");
	}

	@Override
	public String toString() {
		return "Texto [LONGITUD=" + LONGITUD + ", txt=" + txt + ", ultimaMod=" + ultimaMod + "]";
	}
}
