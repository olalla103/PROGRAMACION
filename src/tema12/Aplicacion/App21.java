package tema12.Aplicacion;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class App21 {
    public static void main(String[] args) {
        Comparator<Integer> cD = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        Set<Integer> tabla = new TreeSet<>(cD);
        for (int i = 0; i < 20; i++) {
            tabla.add((int) (Math.random() + 100 + 1));
        }
        System.out.println(tabla);


    }
}
