package tema12.Resueltas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class R9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        Collection<Integer> numeros = new ArrayList<>();

        System.out.println("Introduzca un número:");
        n = sc.nextInt();
        while (n >= 0) {
            numeros.add(n);
            System.out.println("Introduzca un número:");
            n = sc.nextInt();
        }
        System.out.println(numeros);

        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i % 2 == 0) {
                System.out.print(i * 100 + " ");
            }
        }
    }
}
