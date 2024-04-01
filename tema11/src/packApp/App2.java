package packApp;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double n;

		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("aplicacion11.dat"))) {
			n = lee.readDouble();
			System.out.println(n);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
