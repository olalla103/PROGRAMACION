package packAplicacion;

import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double gradosA, radianes;

		System.out.println("Introduzca cuántos grados tiene un ángulo:");
		gradosA = sc.nextDouble();

		if (gradosA < 0 || gradosA > 360) {
			gradosA = (gradosA % 360)+gradosA;
		}

		radianes = (gradosA * Math.PI) / 180;
		System.out.println(radianes);
		sc.close();

	}

}
