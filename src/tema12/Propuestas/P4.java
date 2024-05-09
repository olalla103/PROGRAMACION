package tema12.Propuestas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        Collection<Integer> positivos = new ArrayList<>();
        Collection<Integer> negativos = new ArrayList<>();

        System.out.println("Introduce un número:");
        n = sc.nextInt();
        while (n != 0) {
            if (n > 0) {
                positivos.add(n);
            } else {
                negativos.add(n);
            }
            System.out.println("Introduce un número:");
            n = sc.nextInt();
        }
        System.out.println("Muestro ambas colecciones\nPositivos: " + positivos + "\nNegativos: " + negativos);

        // calculo totales
        Iterator<Integer> itP = positivos.iterator();
        Iterator<Integer> itN = negativos.iterator();
        int sumaP = 0, sumaN = 0;

        // recorro positivos
        while (itP.hasNext()) {
            sumaP += itP.next();

        }
        // recorro negativos
        while (itN.hasNext()) {
            sumaN += itN.next();

        }
        System.out.println("Suma positivos: " + sumaP + "\nSuma negativos: " + sumaN);
    }
}
