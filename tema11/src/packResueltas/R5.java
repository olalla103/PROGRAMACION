package packResueltas;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class R5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla;
		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("resuelta11_1.dat"))) {
			tabla = (int[]) lee.readObject();
			System.out.println(Arrays.toString(tabla));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
