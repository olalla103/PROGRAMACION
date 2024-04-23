package tema7.app13;

import java.util.Arrays;

public class Colores {
	private String[] paleta = { "azul", "verde", "rojo" };

	public String[] getPaleta() {
		return paleta;
	}

	public void setPaleta(String[] paleta) {
		this.paleta = paleta;
	}

	public Colores() {
		// TODO Auto-generated constructor stub
	}

	public Colores(String[] paleta) {
		// TODO Auto-generated constructor stub
		this.paleta = paleta;
	}

	public void aniaadeColor(String color) {
		paleta = Arrays.copyOf(paleta, paleta.length + 1);
		paleta[paleta.length - 1] = color;
	}

	public void muestraColores(Integer numColores) {
		boolean flag = false;
		if (numColores > paleta.length) {
			System.out
					.println("En la paleta hay un total de " + paleta.length + " colores, introduzca un número menor.");
		} else {
			String[] devuelve = new String[numColores];
			int i = 0;

			while (i < numColores) {
				int colorRandom = (int) (Math.random() * paleta.length);
				String colorSeleccionado = paleta[colorRandom];

				// Verificar si el color ya ha sido seleccionado
				boolean yaSeleccionado = false;
				for (int j = 0; j < i && !flag; j++) {
					if (devuelve[j].equals(colorSeleccionado)) {
						yaSeleccionado = true;
						flag = true;
					}
				}

				// Si el color no ha sido seleccionado, agrégalo al array
				if (!yaSeleccionado) {
					devuelve[i] = colorSeleccionado;
					i++;
				}
			}
			System.out.println("Los colores elegidos son: "+Arrays.toString(devuelve));
		}

	}

	@Override
	public String toString() {
		return "Los colores existentes son: " + Arrays.toString(paleta);
	}

}
