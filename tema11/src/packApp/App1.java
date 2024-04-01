package packApp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n;

		try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("aplicacion11.dat"))) {
			System.out.println("Introduzca un número (double):");
			n = sc.nextDouble();
			escribe.writeDouble(n);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		sc.close();

	}

}
