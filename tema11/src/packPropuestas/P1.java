package packPropuestas;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("resuelta11_1.dat"))) {
			escribe.writeObject(tabla);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
