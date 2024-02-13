package packResueltas;

import java.util.Scanner;

public class R10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean op1, op2, op3, salir;

		System.out.println("Está lloviendo?");
		op1 = sc.nextBoolean();
		System.out.println("Has terminado las tareas?");
		op2 = sc.nextBoolean();
		System.out.println("Necesitas ir a la biblioteca?");
		op3 = sc.nextBoolean();
		salir = !op1 && op2 || op3;
		System.out.println(salir);

		sc.close();

	}

}
