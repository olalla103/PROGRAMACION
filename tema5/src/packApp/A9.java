package packApp;

import java.util.Arrays;
import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] tabla = new int[0];
		int n;
		System.out.println("Introduzca el número de dorsal, introduzca -1 cuando no desee introducir más:");
		n = sc.nextInt();
		while (n != -1) {
			rellenaTabla(tabla, n);
			System.out.println("Introduzca el número de dorsal, introduzca -1 cuando no desee introducir más:");
			n = sc.nextInt();
		}
		sc.close();
	}

	public static int[] rellenaTabla(int[] tabla, int n) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = n;
		return tabla;
	}

	public static int[] menores(int[] tabla, int n) {
		int a;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == n) {
				a = tabla[i - 1];
				tabla[i - 1] = tabla[i];
				tabla[i] = a;
			}
		}
		return tabla;
	}
	
	public static void controlDopaje(int [] tabla, int n) {
		
	}

}
