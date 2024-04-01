package packResueltas;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class R1 {

	public static void main(String[] args) {
		int[] tabla = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("resuelta11_1.dat"))) {
			for (int n : tabla) {
				escribe.writeInt(n);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
