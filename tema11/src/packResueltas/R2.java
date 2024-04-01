package packResueltas;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class R2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Con diez cañones por banda,\nviento en popa a toda vela,\nno corta el mar,sino vuela\nun velero bergatín";
		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("resuelta11_2.dat"))) {
			escribe.writeObject(cadena);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
