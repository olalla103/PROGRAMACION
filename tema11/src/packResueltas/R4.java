package packResueltas;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class R4 {

	public static void main(String[] args) {
		// VARIABLES
		int[] tabla = new int[10];

		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("resuelta11_1.dat"))) {
			for (int i = 0; i < tabla.length; i++) {
				tabla[i] = lee.readInt();
			}
			System.out.println(Arrays.toString(tabla));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
