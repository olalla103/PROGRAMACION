package packAplicacion;

import java.util.Scanner;

public class A20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		double raiz;
		System.out.println("Introduzca un número real:");
		n = sc.nextInt();
		raiz = Math.sqrt(n);
		System.out.println(raiz);
		sc.close();
	}

}
