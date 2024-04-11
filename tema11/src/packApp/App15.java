package packApp;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class App15 {

	public static void main(String[] args) {
		// tablas números ordenados
//		Integer[] t1 = { 1, 2, 3, 4, 5, 6, 7 }, t2 = { 12, 13, 14, 15, 16 }, t3 = { 20, 21, 22, 23, 24, 25 },
//				t4 = { 31, 32, 33, 34, 35, 36, 37, 38 };
		// nombre de los ficheros
//		String nombres[] = { "t1.dat", "t2.dat", "t3.dat", "t4.dat" };
//		Integer[] tAux;
//		int n;

		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("t1.dat"));
				ObjectOutputStream escribe2 = new ObjectOutputStream(new FileOutputStream("t2.dat"));
				ObjectOutputStream escribe3 = new ObjectOutputStream(new FileOutputStream("t3.dat"));
				ObjectOutputStream escribe4 = new ObjectOutputStream(new FileOutputStream("t4.dat"))) {
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
