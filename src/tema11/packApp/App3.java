package tema11.packApp;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] tabla;
		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("resuelta11_3.dat"))) {
			tabla = (double[]) lee.readObject();
			System.out.println(Arrays.toString(tabla));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
