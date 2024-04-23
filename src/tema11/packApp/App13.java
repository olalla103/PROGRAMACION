package tema11.packApp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class App13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tabla;
		tabla = fusionar(null, null);
		System.out.println(Arrays.toString(tabla));

	}

	public static Integer[] fusionar(String fichero1, String fichero2) {
		Integer[] tabla = new Integer[0], t1, t2;

		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream(fichero1 + ".dat"));
				ObjectInputStream lee2 = new ObjectInputStream(new FileInputStream(fichero2 + ".dat"))) {
			t1 = (Integer[]) lee.readObject();
			t2 = (Integer[]) lee2.readObject();

			tabla = new Integer[t1.length + t2.length];

			for (int i = 0; i < t1.length; i++) {
				tabla[i] = t1[i];
			}
			for (int i = t1.length; i < tabla.length; i++) {
				tabla[i] = t2[i];
			}

		} catch (ClassNotFoundException e) {
			System.out.println("La clase no corresponde");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return tabla;
	}

}
