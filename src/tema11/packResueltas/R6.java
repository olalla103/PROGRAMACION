package tema11.packResueltas;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class R6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String estrofa;
		try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("resuelta11_2.dat"))) {
			estrofa = (String) lee.readObject();
			System.out.println(estrofa);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
