package r45;

import java.util.Arrays;

public abstract class Instrumento {
	protected Nota[] notas = new Nota[0];

	public void add(Nota n) {
		notas = Arrays.copyOf(notas, notas.length + 1);
		notas[notas.length - 1] = n;
	}

	
	
	public void interpretar() {
		System.out.println(Arrays.toString(notas));
	}

	
}
