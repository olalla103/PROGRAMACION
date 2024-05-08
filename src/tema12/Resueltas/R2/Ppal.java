package tema12.Resueltas.R2;

import java.util.Scanner;

public class Ppal {
    public static void main(String[] args) {

        // INTERFAZ COLA
        Integer[] t = new Integer[0];
        Contenedor<Integer> ob = new Contenedor<>(t);
        ob.apilar(1);
        System.out.println(ob.toString());

        // INTERFAZ PILA
        Scanner sc = new Scanner(System.in);
        int n;
        Integer[] tInt = new Integer[0];
        Contenedor<Integer> ob1 = new Contenedor<>(tInt);
        System.out.println("Introduzca un número:");
        n = sc.nextInt();
        while (n != -1) {
            ob1.encolar(n);
            System.out.println("Introduzca un número:");
            n = sc.nextInt();
        }
        System.out.println("Su tabla ha quedado así:\n" + ob1);


    }
}
