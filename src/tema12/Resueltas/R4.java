package tema12.Resueltas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class R4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        Collection<Integer> colNum = new ArrayList<>();

        System.out.println("Introduzca un número:");
        n = sc.nextInt();
        while (n > 0) {
            colNum.add(n);
            System.out.println("Introduzca un número:");
            n = sc.nextInt();
        }

        Iterator<Integer> it = colNum.iterator();
        for (; it.hasNext(); ) {
            Integer i = it.next();
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println(colNum.toString());

        // eliminamos los múltiplos de 3
        Iterator<Integer> it2 = colNum.iterator();
        for (; it2.hasNext(); ) {
            Integer i = it2.next();
            if (i % 3 == 0) {
                it2.remove();
            }
        }
        System.out.println(colNum.toString());

    }
}
