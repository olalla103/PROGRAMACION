package app15;

import java.util.Arrays;

public class SuperCola {
	Integer[] cola1 = new Integer[0];
	Integer[] cola2 = new Integer[0];

	public void encolar(Integer elemento, Integer cola) {
		if (cola == 1) {
			cola1 = Arrays.copyOf(cola1, cola1.length + 1);
			cola1[cola1.length - 1] = elemento;
		} else if (cola == 2) {
			cola2 = Arrays.copyOf(cola2, cola2.length + 1);
			cola2[cola2.length - 1] = elemento;
		} else {
			System.out.println("El número introducido no es correcto.");
		}

	}

	public void desencolar(Integer cola) {
		if (cola == 1) {
			for (int i = cola1.length - 1; i < 0; i--) {
				cola1[i] = cola1[i - 1];
			}
			cola1[cola1.length - 1] = 0;
			cola1 = Arrays.copyOf(cola1, cola1.length - 1);
		} else if (cola == 2) {
			for (int i = cola2.length - 1; i < 0; i--) {
				cola2[i] = cola2[i - 1];
			}
			cola2[cola2.length - 1] = 0;
			cola2 = Arrays.copyOf(cola2, cola2.length - 1);
		}

		if (cola == 1 && cola1.length == 0) {
			for (int i = cola2.length - 1; i < 0; i--) {
				cola2[i] = cola2[i - 1];
			}
			cola2[cola2.length - 1] = 0;
			cola2 = Arrays.copyOf(cola2, cola2.length - 1);
		} else if (cola == 2 && cola2.length == 0) {
			for (int i = cola1.length - 1; i < 0; i--) {
				cola1[i] = cola1[i - 1];
			}
			cola1[cola1.length - 1] = 0;
			cola1 = Arrays.copyOf(cola1, cola1.length - 1);
		}
	}

	public String toString(Integer cola) {

		return "Cola " + cola + ": " + Arrays.toString(cola1);

//		if(cola==2) {
//			return "Cola " + cola + ": " + Arrays.toString(cola1);
//			
//		}
	}

}
